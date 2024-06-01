package tn.esprit.spring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "seanceclasse")
public class Seanceclasse {
    @Id
    @Column(name = "idSeance", nullable = false)
    private Integer id;

    @Column(name = "annee")
    private Integer annee;

    @Column(name = "semaine")
    private Integer semaine;

    @Column(name = "jour")
    private Integer jour;

    @Column(name = "heureDebut")
    private Instant heureDebut;

    @Column(name = "heureFin")
    private Instant heureFin;

    @Column(name = "idGroupe")
    private Integer idGroupe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "matiere_id")
    private Matiere matiere;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enseignant_id")
    private Utilisateur enseignant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "salle_id")
    private Salle salle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emploiDuTemps_id")
    private Emploidutemp emploiDuTemps;

}