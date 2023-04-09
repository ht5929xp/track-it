package trackit.services;

import trackit.model.Note;

import java.time.LocalDate;
import java.util.Set;

public interface NoteService extends CrudService<Note, Long> {
    public Set<Note> findByDate(LocalDate date);
}
