/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istte.biblioteca.modelo.dao.impl;

import com.istte.biblioteca.modelo.dao.ILibrosDao;
import com.istte.biblioteca.modelo.entidad.Libros;

/**
 *
 * @author jaime
 */
public class LibrosDaoImpl extends GenericaDaoImpl<Libros> implements ILibrosDao {
    
    

    @Override
    public void insertLibros(Libros nuevoLibro) {
        this.beginTransaction();
        this.create(nuevoLibro);
        this.commit();
    }
}
