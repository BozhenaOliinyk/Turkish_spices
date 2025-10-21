package com.example.mahasun.repository;

import com.example.mahasun.entity.Klyent;
import com.example.mahasun.entity.TorhovaTochka;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class TorhovaTochkaRepository implements com.example.mahasun.entity.Repository<TorhovaTochka> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<TorhovaTochka> read() {
        return entityManager.createQuery("SELECT t FROM TorhovaTochka t", TorhovaTochka.class)
                .getResultList();
    }

    @Override
    public TorhovaTochka getById(int id) {
        return entityManager.find(TorhovaTochka.class, id);
    }

    @Override
    public void create(TorhovaTochka entity) {
        entityManager.persist(entity);
    }

    @Override
    public void update(TorhovaTochka entity) {
        entityManager.merge(entity);
    }

    @Override
    public void delete(TorhovaTochka entity) {
        TorhovaTochka attached = entity;
        if (!entityManager.contains(entity)) {
            attached = entityManager.find(TorhovaTochka.class, entity.getId());
        }
        if (attached != null) {
            entityManager.remove(attached);
        }
    }
}
