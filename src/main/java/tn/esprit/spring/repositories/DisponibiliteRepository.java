package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.Disponibilite;

public interface DisponibiliteRepository extends JpaRepository<Disponibilite, Long> {
}
