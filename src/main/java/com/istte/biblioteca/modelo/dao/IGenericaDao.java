/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.istte.biblioteca.modelo.dao;

import java.util.List;

/**
 *
 * @author jaime
 */
public interface IGenericaDao <T>{
    public T create(T t);

    public T read(Object id);

    public T update(T t);

    public void delete(T t);

    public void beginTransaction();

    public void commit();

    public void rollback();

    public void closeTransaction();

    public void commitAndCloseTransaction();

    public void flush();

    public List<T> findAll();
    
}
