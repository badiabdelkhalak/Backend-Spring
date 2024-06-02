package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.Competence;

public interface ClasseRepository extends JpaRepository<Class, Long> {
}
