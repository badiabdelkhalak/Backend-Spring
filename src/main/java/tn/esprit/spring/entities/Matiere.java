package tn.esprit.spring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "matiere")
public class Matiere {
    @Id
    @Column(name = "idMatiere", nullable = false)
    private Integer id;

    @Column(name = "nomMatiere")
    private String nomMatiere;

    @Column(name = "nbreHeures")
    private Integer nbreHeures;

    @Column(name = "coefficientTP")
    private Double coefficientTP;

    @Column(name = "coefficientCC")
    private Double coefficientCC;

    @Column(name = "coefficientExamen")
    private Double coefficientExamen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "module_id")
    private Module module;

}