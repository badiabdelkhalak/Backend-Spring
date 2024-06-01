package tn.esprit.spring.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.Presence;
import tn.esprit.spring.services.PresenceServiceImpl;

import java.util.List;

@RestController
@RequestMapping("presences")
@RequiredArgsConstructor
public class PresenceController {

    @Autowired
    private PresenceServiceImpl presenceService;

    @PostMapping
    public Presence addPresence(@RequestBody Presence presence) {
        return presenceService.addPresence(presence);
    }

    @PutMapping("/{idPresence}/assign/{idUtilisateur}")
    public Presence assignPresenceToStudent(@PathVariable Long idPresence, @PathVariable Long idUtilisateur) {
        return presenceService.assignPresenceToStudent(idPresence, idUtilisateur);
    }

    @PutMapping
    public Presence updatePresence(@RequestBody Presence presence) {
        return presenceService.updatePresence(presence);
    }

    @GetMapping("/{idPresence}")
    public Presence retrievePresenceById(@PathVariable Long idPresence) {
        return presenceService.retrievePresenceById(idPresence);
    }

    @GetMapping
    public List<Presence> retrieveAllPresences() {
        return presenceService.retrieveAllPresences();
    }

    @DeleteMapping("/{idPresence}")
    public void deletePresenceById(@PathVariable Long idPresence) {
        presenceService.deletePresenceById(idPresence);
    }

    @DeleteMapping
    public void deleteAllPresences() {
        presenceService.deleteAllPresences();
    }




}
