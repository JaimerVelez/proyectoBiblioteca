package com.istte.biblioteca.modelo.dao.impl;

import com.istte.biblioteca.modelo.dao.IPrestamoDao;
import com.istte.biblioteca.modelo.entidad.Prestamo;

public class PrestamoDaoImpl extends GenericDaoImpl<Prestamo> implements IPrestamoDao {

    @Override
    public void createPrestamo(Prestamo newPrestamo) {
        this.beginTransaction();
        this.createPrestamo(newPrestamo);
        this.commit();
    }
    
}
