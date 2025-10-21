package com.example.mahasun.entity;

import java.util.List;

public interface Repository<T> {
    List<T> read();
    T getById(int id);
    void create(T entity);
    void update(T entity);
    void delete(T entity);
}