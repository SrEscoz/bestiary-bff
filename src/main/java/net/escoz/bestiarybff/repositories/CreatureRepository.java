package net.escoz.bestiarybff.repositories;

import net.escoz.bestiarybff.models.Creature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CreatureRepository extends JpaRepository<Creature, Long> {

	Optional<Creature> findByName(String name);
}
