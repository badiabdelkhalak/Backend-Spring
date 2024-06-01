package tn.esprit.spring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "note")
public class Note {
    @Id
    @Column(name = "idNote", nullable = false)
    private Integer id;

    @Column(name = "noteCc")
    private Double noteCc;

    @Column(name = "noteTp")
    private Double noteTp;

    @Column(name = "noteEx")
    private Double noteEx;

    @Column(name = "classe")
    private String classe;

    @Column(name = "etudiant")
    private String etudiant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "matiere_id")
    private Matiere matiere;

}