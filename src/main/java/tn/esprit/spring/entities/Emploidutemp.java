package tn.esprit.spring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "emploidutemps")
public class Emploidutemp {
    @Id
    @Column(name = "idEmploiDuTemps", nullable = false)
    private Integer id;

    @Column(name = "semestreAnnee")
    private Integer semestreAnnee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

}