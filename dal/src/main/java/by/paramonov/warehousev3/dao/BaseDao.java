package by.paramonov.warehousev3.dao;


import java.util.List;

public interface BaseDao<T> {
    T findOne(Long id);
    void save(T entity);
    List<T> findAll();
}
