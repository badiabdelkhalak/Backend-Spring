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
public class Justification implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idJusutification", nullable = false)
    private Long idJustification;
    private String name;
    private String reason;
    private int status;
    private Date submissionDate;
    private Date ValidationDate;

    @OneToOne
    private Presence presence;
}

