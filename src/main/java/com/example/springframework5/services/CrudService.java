package com.example.springframework5.services;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T save(T Object);

    T findById(ID id);

    void delete(T Object);

    void deleteById(ID id);
}
