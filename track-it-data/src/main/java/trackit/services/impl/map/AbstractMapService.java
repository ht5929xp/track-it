package trackit.services.impl.map;

import trackit.model.BaseEntity;
import trackit.services.CrudService;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {
    protected Map<Long, T> map = new HashMap<>();

    public T findById(ID id) {
        return map.get(id);
    }

    public Set<T> findAll() {
        return new HashSet(map.values());
    }

    public T save(T t) {
        if (t != null) {
            if (t.getId() == null) {
                Long newId = getNextId();
                t.setId(newId);
            }

            map.put(t.getId(), t);
        }

        return t;
    }

    private Long getNextId() {
        return !map.isEmpty() ? Collections.max(map.keySet()) + 1 : 1L;
    }
}
