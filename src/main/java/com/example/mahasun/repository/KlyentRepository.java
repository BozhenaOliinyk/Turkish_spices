package com.example.mahasun.repository;

import com.example.mahasun.entity.Klyent;
import jakarta.persistence.*;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class KlyentRepository implements com.example.mahasun.entity.Repository<Klyent> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Klyent> read() {
        return entityManager.createQuery("SELECT k FROM Klyent k", Klyent.class).getResultList();
    }

    @Override
    public Klyent getById(int id) {
        return entityManager.find(Klyent.class, id);
    }

    @Override
    public void create(Klyent entity) {
        entityManager.persist(entity);
    }

    @Override
    public void update(Klyent entity) {
        entityManager.merge(entity);
    }

    @Override
    public void delete(Klyent entity) {
        Klyent attached = entity;
        if (!entityManager.contains(entity)) {
            attached = entityManager.find(Klyent.class, entity.getId());
        }
        if (attached != null) {
            entityManager.remove(attached);
        }
    }
}
