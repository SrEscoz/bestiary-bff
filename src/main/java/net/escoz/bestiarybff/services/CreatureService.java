package net.escoz.bestiarybff.services;

import net.escoz.bestiarybff.models.Creature;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CreatureService {

	Page<Creature> getCreatures(Pageable pageable);

	Creature getCreature(long id);

}
