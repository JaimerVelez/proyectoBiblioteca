/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istte.biblioteca.controlador.Impl;

import com.istte.biblioteca.controlador.IPrestamosControlador;
import com.istte.biblioteca.modelo.dao.IPrestamosDao;
import com.istte.biblioteca.modelo.dao.impl.PretamosDaoImpl;
import com.istte.biblioteca.modelo.entidad.Prestamos;

/**
 *
 * @author jaime
 */
public class PrestamosControladorImpl implements IPrestamosControlador {

    @Override
    public void insertarPrestamo(Prestamos nuevoPrestamo) {
        IPrestamosDao prestamosDao = new PretamosDaoImpl();
        prestamosDao.insertarPrestamo(nuevoPrestamo);
    }
    
}
