package com.example.mahasun.repository;

import com.example.mahasun.entity.Klyent;
import com.example.mahasun.entity.Pracivnyk;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class PracivnykRepository implements com.example.mahasun.entity.Repository<Pracivnyk> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Pracivnyk> read() {
        return entityManager.createQuery("SELECT p FROM Pracivnyk p", Pracivnyk.class)
                .getResultList();
    }

    @Override
    public Pracivnyk getById(int id) {
        return entityManager.find(Pracivnyk.class, id);
    }

    @Override
    public void create(Pracivnyk entity) {
        entityManager.persist(entity);
    }

    @Override
    public void update(Pracivnyk entity) {
        entityManager.merge(entity);
    }

    @Override
    public void delete(Pracivnyk entity) {
        Pracivnyk attached = entity;
        if (!entityManager.contains(entity)) {
            attached = entityManager.find(Pracivnyk.class, entity.getId());
        }
        if (attached != null) {
            entityManager.remove(attached);
        }
    }
}
