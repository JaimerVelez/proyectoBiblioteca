/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istte.biblioteca.modelo.dao.impl;

import com.istte.biblioteca.modelo.entidad.Estudiantes;
import com.istte.biblioteca.modelo.dao.IEstudiantesDao;

/**
 *
 * @author jaime
 */
public class EstudiantesDaoImpl extends GenericaDaoImpl<Estudiantes> implements IEstudiantesDao {

    @Override
    public void insertarEstudiantes(Estudiantes nuevoEstudiantes) {
        this.beginTransaction();
        this.create(nuevoEstudiantes);
        this.commit();
        }

   


    
}