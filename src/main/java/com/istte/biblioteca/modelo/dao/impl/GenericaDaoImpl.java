/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istte.biblioteca.modelo.dao.impl;

import com.istte.biblioteca.modelo.dao.IGenericaDao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jaime
 */
public class GenericaDaoImpl  <T>  implements IGenericaDao<T>{
    
     private Class<T> entityClass;
    
    protected static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("BibliotecaPU");
    protected EntityManager entityManager;

    public GenericaDaoImpl() 
    {
        entityManager = emf.createEntityManager();
    }
    
    public GenericaDaoImpl(Class<T>entityClass)
    {
        this.entityClass = entityClass;
        entityManager = emf.createEntityManager();
    }

//Definimos el CRUD
    @Override
    public T create(T t)
    {
        this.entityManager.persist(t);
        return t;
    }
    
    @Override
    public T read (Object id)
    {
        return this.entityManager.find(entityClass, id);
    }
    
    @Override
    public T update (T t)
    {
        return this.entityManager.merge(t);
    }
    
    @Override
    public void delete(T t)
    {
        t = this.entityManager.merge(t);
        this.entityManager.remove(t);
    }
    
    
    //Definir los parámetros
    @Override
    public void beginTransaction()
    {
        if(!entityManager.getTransaction().isActive())
            entityManager = emf.createEntityManager();
        
        entityManager.getTransaction().begin();    
    }
    
    @Override
    public void commit()
    {
        if(entityManager.getTransaction().isActive())
            entityManager.getTransaction().commit();
    }
    
    @Override
    public void rollback()
    {
         if(entityManager.getTransaction().isActive())
            entityManager.getTransaction().rollback();
    }
    
    @Override
    public void closeTransaction()
    {
        entityManager.close();
    }
    
    @Override
    public void commitAndCloseTransaction()
    {
        commit();
        closeTransaction();
    }
    
    @Override
    public void flush()
    {
        entityManager.flush();
    }
    
    @Override
    public List<T> findAll()
    {
        javax.persistence.criteria.CriteriaQuery cq = this.entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return this.entityManager.createQuery(cq).getResultList();
    }

    

}
