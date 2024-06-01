package tn.esprit.spring.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "salle")
public class Salle {
    @Id
    @Column(name = "idSalle", nullable = false)
    private Integer id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "capacite")
    private Integer capacite;

}