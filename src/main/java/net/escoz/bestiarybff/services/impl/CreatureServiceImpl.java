package net.escoz.bestiarybff.services.impl;

import lombok.AllArgsConstructor;
import net.escoz.bestiarybff.models.Creature;
import net.escoz.bestiarybff.repositories.CreatureRepository;
import net.escoz.bestiarybff.services.CreatureService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CreatureServiceImpl implements CreatureService {

	private final CreatureRepository creatureRepository;

	@Override
	public List<Creature> getCreatures() {
		return creatureRepository.findAll();
	}
}
