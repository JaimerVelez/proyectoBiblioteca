/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istte.biblioteca.controlador.Impl;

import com.istte.biblioteca.controlador.ILibrosControlador;
import com.istte.biblioteca.modelo.dao.ILibrosDao;
import com.istte.biblioteca.modelo.dao.impl.LibrosDaoImpl;
import com.istte.biblioteca.modelo.entidad.Libros;

/**
 *
 * @author jaime
 */
public class LibrosControladorImpl implements ILibrosControlador {
    
    

    @Override
    public void insertLibros(Libros nuevoLibros) {
        ILibrosDao librosDao = new LibrosDaoImpl();
        librosDao.insertLibros(nuevoLibros);
    }
    
    
}
