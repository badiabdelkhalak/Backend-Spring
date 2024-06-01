package tn.esprit.spring.services;


import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Presence;
import tn.esprit.spring.entities.Utilisateur;
import tn.esprit.spring.repositories.PresenceRepository;
import tn.esprit.spring.repositories.UtilisateurRepository;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
public class PresenceServiceImpl implements IPresenceService {

    private PresenceRepository presenceRepository;
    private UtilisateurRepository utilisateurRepository;
    @Override
    public Presence addPresence(Presence presence) {
        return presenceRepository.save(presence);
    }

    @Override
    public Presence assignPresenceToStudent(Long idPresence, Long idUtilisateur) {
        Optional<Utilisateur> utilisateur = utilisateurRepository.findByIdAndRoleNomRole(idUtilisateur, "etudiant");
        if (utilisateur.isPresent()) {
            Presence presence = presenceRepository.findById(idPresence).orElseThrow(() -> new RuntimeException("Presence not found"));
            presence.setUtilisateur(utilisateur.get());
            return presenceRepository.save(presence);
        } else {
            throw new RuntimeException("Student not found with this id" + idUtilisateur);
        }
    }

    @Override
    public Presence updatePresence(Presence presence) {
        return presenceRepository.save(presence);
    }

    @Override
    public Presence retrievePresenceById(Long idPresence) {
        return presenceRepository.findById(idPresence)
                .orElseThrow(()->new IllegalArgumentException("No attendance was found with this id" + idPresence));
    }

    @Override
    public List<Presence> retrieveAllPresences() {
        return presenceRepository.findAll();
    }

    @Override
    public void deletePresenceById(Long idPresence) {
        presenceRepository.deleteById(idPresence);
    }

    @Override
    public void deleteAllPresences() {
        presenceRepository.deleteAll();
    }

}
