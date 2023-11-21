package com.istte.biblioteca.controlador.impl;

import com.istte.biblioteca.controlador.IPrestamoControlador;
import com.istte.biblioteca.modelo.dao.IPrestamoDao;
import com.istte.biblioteca.modelo.dao.impl.PrestamoDaoImpl;
import com.istte.biblioteca.modelo.entidad.Prestamo;

public class PrestamoControladorImpl implements IPrestamoControlador {

    @Override
    public void createPrestamo(Prestamo newPrestamo) {
        IPrestamoDao prestamoDao = new PrestamoDaoImpl();
        prestamoDao.createPrestamo(newPrestamo);
    }
    
}
