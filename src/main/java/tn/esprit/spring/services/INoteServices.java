package tn.esprit.spring.services;

import tn.esprit.spring.entities.Note;

import java.util.List;

public interface INoteServices {

    List<Note> retrieveAllCourses();

    List<Note> retrieveAllNote();

    Note addNote(Note  note);

    Note updateNote(Note note);

    Note retrieveNote(Long numNote);


}
