package tn.esprit.spring.services;

import tn.esprit.spring.entities.Matiere;

import java.util.List;

public interface IMatiereServices {
    Matiere saveMatiere(Matiere matiere);
    Matiere updateMatiere(Matiere matiere);
    void deleteMatiere(Long id);
    Matiere getMatiereById(Long id);
    List<Matiere> getAllMatieres();
}
