package br.api.notebook.service;

import br.api.notebook.dto.NotebookDTO;
import br.api.notebook.model.NotebookEntity;

import java.util.List;
import java.util.Optional;

public interface NotebookService {
    NotebookEntity saveNote(NotebookEntity note);
    List<NotebookDTO> getNotes();
    Optional<NotebookEntity> getNoteById(Long id);
    NotebookEntity updateNote(NotebookEntity noteEntity);
    void deleteNote(Long id);
}
