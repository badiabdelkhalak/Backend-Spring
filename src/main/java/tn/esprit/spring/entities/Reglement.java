package tn.esprit.spring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "reglement")
public class Reglement {
    @Id
    @Column(name = "idReglement", nullable = false)
    private Integer id;

    @Column(name = "nomReglement")
    private String nomReglement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "facture_id")
    private Facture facture;

}