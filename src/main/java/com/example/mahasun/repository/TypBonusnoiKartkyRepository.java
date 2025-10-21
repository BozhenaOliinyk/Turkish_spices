package com.example.mahasun.repository;

import com.example.mahasun.entity.Klyent;
import com.example.mahasun.entity.TypBonusnoiKartky;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class TypBonusnoiKartkyRepository implements com.example.mahasun.entity.Repository<TypBonusnoiKartky> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<TypBonusnoiKartky> read() {
        return entityManager.createQuery("SELECT t FROM TypBonusnoiKartky t", TypBonusnoiKartky.class)
                .getResultList();
    }

    @Override
    public TypBonusnoiKartky getById(int id) {
        return entityManager.find(TypBonusnoiKartky.class, id);
    }

    @Override
    public void create(TypBonusnoiKartky entity) {
        entityManager.persist(entity);
    }

    @Override
    public void update(TypBonusnoiKartky entity) {
        entityManager.merge(entity);
    }

    @Override
    public void delete(TypBonusnoiKartky entity) {
        TypBonusnoiKartky attached = entity;
        if (!entityManager.contains(entity)) {
            attached = entityManager.find(TypBonusnoiKartky.class, entity.getId());
        }
        if (attached != null) {
            entityManager.remove(attached);
        }
    }
}
