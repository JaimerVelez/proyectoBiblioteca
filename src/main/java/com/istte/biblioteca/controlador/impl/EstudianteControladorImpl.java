package com.istte.biblioteca.controlador.impl;

import com.istte.biblioteca.controlador.IEstudianteControlador;
import com.istte.biblioteca.modelo.dao.IEstudianteDao;
import com.istte.biblioteca.modelo.dao.impl.EstudianteDaoImpl;
import com.istte.biblioteca.modelo.entidad.Estudiante;

public class EstudianteControladorImpl implements IEstudianteControlador {

    @Override
    public void createEstudiante(Estudiante newEstudiante) {
        IEstudianteDao estudianteDao = new EstudianteDaoImpl();
        estudianteDao.createEstudiante(newEstudiante);
    }
}
