package tn.esprit.spring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.catalina.User;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "Presence")
public class Presence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPresence;
    private Boolean etat;
    private LocalDate date;

    @OneToOne (mappedBy = "presence")
    private Justification justification;

    @ManyToOne
    private Utilisateur utilisateur;

}