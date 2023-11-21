package com.istte.biblioteca.modelo.dao.impl;

import com.istte.biblioteca.modelo.dao.IGenericDao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenericDaoImpl<T> implements IGenericDao<T> {
    private Class<T> entityClass;
    
    protected static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("BIBLIOTECAPU");
    protected EntityManager entityManager;

    public GenericDaoImpl() 
    {
        entityManager = emf.createEntityManager();
    }
    
    public GenericDaoImpl(Class<T>entityClass)
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
