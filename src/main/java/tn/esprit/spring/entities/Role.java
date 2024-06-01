package tn.esprit.spring.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "role")
public class Role {
    @Id
    @Column(name = "nomRole", nullable = false)
    private String nomRole;

    @Lob
    @Column(name = "permissions")
    private String permissions;



}