package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Presence;

@Repository
public interface PresenceRepository extends JpaRepository<Presence, Long> {

}