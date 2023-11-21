/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istte.biblioteca.modelo.dao.impl;

import com.istte.biblioteca.modelo.dao.IPrestamosDao;
import com.istte.biblioteca.modelo.entidad.Prestamos;

/**
 *
 * @author jaime
 */
public class PretamosDaoImpl extends GenericaDaoImpl<Prestamos> implements IPrestamosDao {

    @Override
    public void insertarPrestamo(Prestamos nuevoPrestamo) {
        this.beginTransaction();
        this.create(nuevoPrestamo);
        this.commit();
    }
    
}