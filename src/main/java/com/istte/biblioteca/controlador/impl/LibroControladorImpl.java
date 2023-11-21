package com.istte.biblioteca.controlador.impl;

import com.istte.biblioteca.controlador.ILibroControlador;
import com.istte.biblioteca.modelo.dao.ILibroDao;
import com.istte.biblioteca.modelo.dao.impl.LibroDaoImpl;
import com.istte.biblioteca.modelo.entidad.Libro;

public class LibroControladorImpl implements ILibroControlador {

    @Override
    public void createLibro(Libro newLibro) {
        ILibroDao libroDao = new LibroDaoImpl();
        libroDao.createLibro(newLibro);
    }
    
}
