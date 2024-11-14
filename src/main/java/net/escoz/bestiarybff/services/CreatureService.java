package net.escoz.bestiarybff.services;

import net.escoz.bestiarybff.models.Creature;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CreatureService {

	Page<Creature> getCreatures(Pageable pageable);

	Creature getCreature(long id);

	List<Creature> randomEncounter(int nCreatures);

	Creature addCreature(Creature creature);

	Creature updateCreature(Creature creature);

	void deleteCreature(long id);

}
