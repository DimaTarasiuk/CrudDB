package org.example.repository;

import java.util.List;

public interface GenericRepository <T, ID>{
    T getByID(ID id);
    List<T> getAll();
    T save(T t);
    T updateByID (ID id);
    void deleteByID(ID id);
}
