package com.istte.biblioteca.modelo.dao.impl;

import com.istte.biblioteca.modelo.dao.IPrestamoDao;
import com.istte.biblioteca.modelo.entidad.Prestamo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class PrestamoDaoImpl implements IPrestamoDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotecaPU");
    EntityManager em = emf.createEntityManager();
    
    @Override
    public void createPrestamo(Prestamo newPrestamo) {
        EntityTransaction etx = em.getTransaction();
        etx.begin();
        em.persist(newPrestamo);
        etx.commit();
    }

    @Override
    public List<Prestamo> listarAllPrestamo() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Prestamo> cq = cb.createQuery(Prestamo.class);
        Root<Prestamo> result = cq.from(Prestamo.class);
        cq.select(result);
        return em.createQuery(cq).getResultList();
    }
    
}
