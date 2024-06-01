package tn.esprit.spring.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNote;
    private double noteCc;
    private double noteTp;
    private double noteEx;

    private String classe;
    private String etudiant;

    @ManyToOne
    private Subject subject;

}
