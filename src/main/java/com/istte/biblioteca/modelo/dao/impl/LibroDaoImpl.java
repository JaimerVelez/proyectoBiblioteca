package com.istte.biblioteca.modelo.dao.impl;

import com.istte.biblioteca.modelo.dao.ILibroDao;
import com.istte.biblioteca.modelo.entidad.Libro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class LibroDaoImpl implements ILibroDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotecaPU");
    EntityManager em = emf.createEntityManager();
    
    @Override
    public void createLibro(Libro newLibro) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(newLibro);
        et.commit();
    }

    @Override
    public List<Libro> listarAllLibro() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Libro> cq = cb.createQuery(Libro.class);
        Root<Libro> result = cq.from(Libro.class);
        cq.select(result);
        return em.createQuery(cq).getResultList();
    }
    
}
