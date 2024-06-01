package tn.esprit.spring.services;

import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Presence;

import java.util.List;


public interface IPresenceService {

    Presence addPresence(Presence presence);
    Presence assignPresenceToStudent(Long idPresence, Long idUtilisateur);
    Presence updatePresence(Presence presence);
    Presence retrievePresenceById(Long idPresence);
    List<Presence> retrieveAllPresences();
    void deletePresenceById(Long idPresence);
    void deleteAllPresences();


}
