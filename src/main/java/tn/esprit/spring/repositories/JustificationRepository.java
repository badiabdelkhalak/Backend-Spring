package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Justification;

@Repository
public interface JustificationRepository extends JpaRepository<Justification,Long> {
}
