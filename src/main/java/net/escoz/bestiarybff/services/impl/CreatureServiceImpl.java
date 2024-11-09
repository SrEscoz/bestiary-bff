package net.escoz.bestiarybff.services.impl;

import lombok.AllArgsConstructor;
import net.escoz.bestiarybff.models.Creature;
import net.escoz.bestiarybff.repositories.CreatureRepository;
import net.escoz.bestiarybff.services.CreatureService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreatureServiceImpl implements CreatureService {

	private final CreatureRepository creatureRepository;

	@Override
	public Page<Creature> getCreatures(Pageable pageable) {
		return creatureRepository.findAll(pageable);
	}
}
