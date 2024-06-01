package tn.esprit.spring.services;


import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Justification;
import tn.esprit.spring.entities.Presence;
import tn.esprit.spring.entities.Utilisateur;
import tn.esprit.spring.repositories.JustificationRepository;
import tn.esprit.spring.repositories.PresenceRepository;
import tn.esprit.spring.repositories.UtilisateurRepository;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
public class JustificationServiceImpl implements IJustificationService {

    private JustificationRepository justificationRepository;
    private UtilisateurRepository utilisateurRepository;
    private PresenceRepository presenceRepository;

    public JustificationServiceImpl(PresenceRepository presenceRepository) {
        this.presenceRepository = presenceRepository;
    }

    @Override
    public Justification addJustification(Justification justification) {
        return justificationRepository.save(justification);
    }

    @Override
    public Justification assignJustificationToAbsence(Long idPresence, Long idUtilisateur, String reason) {
        Optional<Utilisateur> utilisateurOpt = utilisateurRepository.findByIdAndRoleNomRole(idUtilisateur, "etudiant");
        if (utilisateurOpt.isPresent()) {
            Presence presence = presenceRepository.findById(idPresence)
                    .orElseThrow(() -> new RuntimeException("Presence not found"));
            if (presence.getEtat() != null && !presence.getEtat()) {
                Justification justification = new Justification();
                justification.setReason(reason);
                justification.setPresence(presence);
                presence.setJustification(justification);
                presenceRepository.save(presence);
                return justificationRepository.save(justification);
            } else {
                throw new RuntimeException("The student was not marked absent");
            }
        } else {
            throw new RuntimeException("Utilisateur with role etudiant not found");
        }
    }

    @Override
    public Justification updateJustification(Justification justification) {
        return justificationRepository.save(justification);
    }

    @Override
    public Justification retrieveJustificationById(Long idJustification) {
        return justificationRepository.findById(idJustification)
                .orElseThrow(()->new IllegalArgumentException("No justification was found with this id" + idJustification));
    }

    @Override
    public List<Justification> retrieveAllJustifications() {
        return justificationRepository.findAll();
    }

    @Override
    public void deleteJustificationById(Long idJustification) {
        justificationRepository.deleteById(idJustification);
    }

    @Override
    public void deleteAllJustifications() {
        justificationRepository.deleteAll();
    }


}
