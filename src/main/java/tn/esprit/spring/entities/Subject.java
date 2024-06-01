package tn.esprit.spring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMatiere;
    private String nomMatiere;
    private int nbreHeures;
    private double coefficientTP;
    private double coefficientCC;
    private double coefficientExamen;

    @ManyToOne
    private Module module;
    
  /*
    @OneToMany(mappedBy = "matiere")
    private List<Competence> competences;

    @OneToMany(mappedBy = "matiere")
    private List<SeanceClasse> seances;*/


}
