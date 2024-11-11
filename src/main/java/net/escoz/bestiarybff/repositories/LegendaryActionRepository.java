package net.escoz.bestiarybff.repositories;

import net.escoz.bestiarybff.models.LegendaryAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LegendaryActionRepository extends JpaRepository<LegendaryAction, Long> {
}
