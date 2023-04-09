package trackit.services.impl.map;

import org.springframework.stereotype.Service;
import trackit.model.Note;
import trackit.services.NoteService;
import trackit.services.impl.map.AbstractMapService;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class NoteServiceMapImpl extends AbstractMapService<Note, Long> implements NoteService {
    @Override
    public Set<Note> findByDate(LocalDate date) {
        return new HashSet(map.values().stream().filter((n) -> n.isOnDate(date)).collect(Collectors.toSet()));
    }
}
