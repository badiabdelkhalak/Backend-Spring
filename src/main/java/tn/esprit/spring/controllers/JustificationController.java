package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.Justification;
import tn.esprit.spring.services.JustificationServiceImpl;

import java.util.List;

@RestController
@RequestMapping("justifications")
public class JustificationController {

    @Autowired
    private JustificationServiceImpl justificationService;

    @PostMapping
    public Justification addJustification(@RequestBody Justification justification) {
        return justificationService.addJustification(justification);
    }

    @PostMapping("/assign")
    public Justification assignJustificationToAbsence(@RequestParam Long idPresence, @RequestParam Long idUtilisateur, @RequestParam String reason) {
        return justificationService.assignJustificationToAbsence(idPresence, idUtilisateur, reason);
    }

    @PutMapping
    public Justification updateJustification(@RequestBody Justification justification) {
        return justificationService.updateJustification(justification);
    }

    @GetMapping("/{idJustification}")
    public Justification retrieveJustificationById(@PathVariable Long idJustification) {
        return justificationService.retrieveJustificationById(idJustification);
    }

    @GetMapping
    public List<Justification> retrieveAllJustifications() {
        return justificationService.retrieveAllJustifications();
    }

    @DeleteMapping("/{idJustification}")
    public void deleteJustificationById(@PathVariable Long idJustification) {
        justificationService.deleteJustificationById(idJustification);
    }

    @DeleteMapping
    public void deleteAllJustifications() {
        justificationService.deleteAllJustifications();
    }
}
