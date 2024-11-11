package net.escoz.bestiarybff.repositories;

import net.escoz.bestiarybff.models.Alignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AligmentRepository extends JpaRepository<Alignment, Long> {
}
