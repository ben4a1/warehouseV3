package by.paramonov.warehousev3.dao;


import java.util.List;
import java.util.UUID;

public interface BaseDao<T> {
    T findOne(UUID id);
    void save(T entity);
    List<T> findAll();
}
