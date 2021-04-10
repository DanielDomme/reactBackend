package com.example.demo.daos;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    Optional<T> get(int id);

    List<T> getAll();

    boolean insert(T t);

    boolean update(T t);

    boolean delete(T t);
}
