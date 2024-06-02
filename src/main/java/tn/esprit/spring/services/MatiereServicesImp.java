package tn.esprit.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Matiere;
import tn.esprit.spring.repositories.MatiereRepository;

import java.util.List;
@Service
public class MatiereServicesImp implements IMatiereServices {

    @Autowired
    private MatiereRepository matiereRepository;

    @Override
    public Matiere saveMatiere(Matiere matiere) {
        return matiereRepository.save(matiere);
    }

    @Override
    public Matiere updateMatiere(Matiere matiere) {
        return matiereRepository.save(matiere);
    }

    @Override
    public void deleteMatiere(Long id) {
        matiereRepository.deleteById(id);
    }

    @Override
    public Matiere getMatiereById(Long id) {
        return matiereRepository.findById(id).orElse(null);
    }

    @Override
    public List<Matiere> getAllMatieres() {
        return matiereRepository.findAll();
    }
}
