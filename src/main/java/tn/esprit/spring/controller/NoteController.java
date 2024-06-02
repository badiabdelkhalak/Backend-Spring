package tn.esprit.spring.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tn.esprit.spring.services.impl.NoteServicesImpl;
import tn.esprit.spring.entities.Note;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    private NoteServicesImpl noteService;

    @PostMapping
    public Note saveNote(@RequestBody Note note, @RequestParam Long userId) {
        return noteService.saveNote(note, userId);
    }

    @PutMapping
    public Note updateNote(@RequestBody Note note, @RequestParam Long userId) {
        return noteService.updateNote(note, userId);
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable Long id, @RequestParam Long userId) {
        noteService.deleteNote(id, userId);
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id, @RequestParam Long userId) {
        return noteService.getNoteById(id, userId);
    }

    @GetMapping
    public List<Note> getAllNotes(@RequestParam Long userId) {
        return noteService.getAllNotes(userId);
    }

    @PostMapping("/upload")
    public void uploadNotesFromExcel(@RequestParam("file") MultipartFile file, @RequestParam Long userId) {
        noteService.saveNotesFromExcel(file, userId);
    }

    @GetMapping("/user/{userId}")
    public List<Note> getNotesByUserId(@PathVariable Long userId) {
        return noteService.getNotesByUserId(userId);
    }

}
