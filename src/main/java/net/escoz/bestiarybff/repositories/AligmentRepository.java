package net.escoz.bestiarybff.repositories;

import net.escoz.bestiarybff.models.Aligment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AligmentRepository extends JpaRepository<Aligment, Long> {
}
