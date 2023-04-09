package trackit.services;

import java.util.Set;

public interface CrudService <T, ID extends Long> {
    public T findById(ID id);

    public Set<T> findAll();

    public T save(T t);
}
