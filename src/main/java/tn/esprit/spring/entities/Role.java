package tn.esprit.spring.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "idRole", nullable = false)
    Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "nom")
    RoleName nom;

    @Lob
    @Column(name = "permissions")
    private String permissions;

}
