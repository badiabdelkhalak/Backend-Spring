package tn.esprit.spring.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Note;
import tn.esprit.spring.repositories.NoteRepository;

import java.util.List;


@RequiredArgsConstructor
@Service
public class NoteServicesImpl implements INoteServices {

    private final NoteRepository noteRepository;

    @Override
    public List<Note> retrieveAllCourses() {
        return noteRepository.findAll();
    }
    @Override
    public List<Note> retrieveAllNote() {
        return noteRepository.findAll();
    }

    @Override
    public Note addNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Note updateNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Note retrieveNote(Long numNote) {
        return noteRepository.findById(numNote)
                .orElseThrow(() -> new IllegalArgumentException("no course found with this id " + numNote));
    }


}
