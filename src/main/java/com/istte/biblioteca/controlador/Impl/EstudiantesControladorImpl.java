/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istte.biblioteca.controlador.Impl;


import com.istte.biblioteca.modelo.dao.impl.EstudiantesDaoImpl;
import com.istte.biblioteca.modelo.entidad.Estudiantes;
import com.istte.biblioteca.modelo.dao.IEstudiantesDao;
import com.istte.biblioteca.controlador.IEstudiantesControlador;



/**
 *
 * @author jaime
 */
public class EstudiantesControladorImpl implements IEstudiantesControlador {

    @Override
    public void insertarEstudiantes(Estudiantes nuevoEstudiantes) {
        IEstudiantesDao estudiantesDao = new EstudiantesDaoImpl();
        estudiantesDao.insertarEstudiantes(nuevoEstudiantes);
    }
}