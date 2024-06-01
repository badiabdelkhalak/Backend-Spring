package tn.esprit.spring.services;


import tn.esprit.spring.entities.Justification;

import java.util.List;

public interface IJustificationService {

    Justification addJustification(Justification justification);

    Justification assignJustificationToAbsence(Long idPresence, Long idUtilisateur, String reason);
    Justification updateJustification(Justification justification);
    Justification retrieveJustificationById (Long idJustification);

    List<Justification> retrieveAllJustifications();

    void deleteJustificationById(Long idJustification);

    void deleteAllJustifications();




}
