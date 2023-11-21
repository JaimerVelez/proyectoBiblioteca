package com.istte.biblioteca.modelo.dao.impl;

import com.istte.biblioteca.modelo.dao.ILibroDao;
import com.istte.biblioteca.modelo.entidad.Libro;

public class LibroDaoImpl extends GenericDaoImpl<Libro> implements ILibroDao {

    @Override
    public void createLibro(Libro newLibro) {
        this.beginTransaction();
        this.createLibro(newLibro);
        this.commit();
    }
    
}
