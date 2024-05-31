package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Attendance;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance,Long> {
}
