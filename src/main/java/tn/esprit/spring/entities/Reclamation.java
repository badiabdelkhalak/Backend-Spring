package tn.esprit.spring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "reclamation")
public class Reclamation {
    @Id
    @Column(name = "idReclamation", nullable = false)
    private Integer id;

    @Column(name = "description")
    private String description;

    @Column(name = "statut")
    private String statut;

    @Column(name = "date")
    private LocalDate date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

}