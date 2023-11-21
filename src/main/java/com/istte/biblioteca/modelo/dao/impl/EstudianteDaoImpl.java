package com.istte.biblioteca.modelo.dao.impl;

import com.istte.biblioteca.modelo.dao.IEstudianteDao;
import com.istte.biblioteca.modelo.entidad.Estudiante;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class EstudianteDaoImpl implements IEstudianteDao {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotecaPU");
    EntityManager em = emf.createEntityManager();

    @Override
    public void createEstudiante(Estudiante newEstudiante) {
        EntityTransaction etx = em.getTransaction();
        etx.begin();
        em.persist(newEstudiante);
        etx.commit();
    }

    @Override
    public List<Estudiante> listarAllEstudiante() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Estudiante> cq = cb.createQuery(Estudiante.class);
        Root<Estudiante> result = cq.from(Estudiante.class);
        cq.select(result);
        return em.createQuery(cq).getResultList();
    }

}
