package tn.esprit.spring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "facture")
public class Facture {
    @Id
    @Column(name = "idFacture", nullable = false)
    private Integer id;

    @Column(name = "montant")
    private Double montant;

    @Column(name = "date")
    private LocalDate date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emetteur_id")
    private Utilisateur emetteur;

}