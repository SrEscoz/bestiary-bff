package net.escoz.bestiarybff.services.impl;

import lombok.AllArgsConstructor;
import net.escoz.bestiarybff.exceptions.EntityConflictException;
import net.escoz.bestiarybff.exceptions.NotFoundException;
import net.escoz.bestiarybff.models.Action;
import net.escoz.bestiarybff.models.Creature;
import net.escoz.bestiarybff.models.LegendaryAction;
import net.escoz.bestiarybff.repositories.CreatureRepository;
import net.escoz.bestiarybff.services.ActionService;
import net.escoz.bestiarybff.services.CreatureService;
import net.escoz.bestiarybff.services.MetadataService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CreatureServiceImpl implements CreatureService {

	private final MetadataService metadataService;
	private final ActionService actionService;

	private final CreatureRepository creatureRepository;

	@Override
	public Page<Creature> getCreatures(Pageable pageable) {
		return creatureRepository.findAll(pageable);
	}

	@Override
	public Creature getCreature(long id) {
		return creatureRepository.findById(id)
				.orElseThrow(() -> new NotFoundException("Creature with id: " + id + " not found"));
	}

	@Override
	public Creature addCreature(Creature creature) {

		creatureRepository.findByName(creature.getName())
				.ifPresent(c -> {
					throw new EntityConflictException("Creature with name: " + creature.getName() + " already exists");
				});

		creature.setType(metadataService.getType(creature.getType().getId()));
		creature.setAlignment(metadataService.getAlignment(creature.getAlignment().getId()));

		if (creature.getActions() != null) {
			Set<Action> actions = creature.getActions().stream()
					.map(action -> actionService.getAction(action.getId()))
					.collect(Collectors.toSet());

			creature.setActions(actions);
		}

		if (creature.getLegendaryActions() != null) {
			Set<LegendaryAction> actions = creature.getLegendaryActions().stream()
					.map(action -> actionService.getLegendaryAction(action.getId()))
					.collect(Collectors.toSet());

			creature.setLegendaryActions(actions);
		}

		return creatureRepository.save(creature);
	}

	@Override
	public void deleteCreature(long id) {
		creatureRepository.delete(getCreature(id));
	}
}
