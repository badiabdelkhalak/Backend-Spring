package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.Module;

public interface ModuleRepository extends JpaRepository<Module, Integer> {
}
