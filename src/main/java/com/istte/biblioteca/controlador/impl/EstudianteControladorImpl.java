package com.istte.biblioteca.controlador.impl;

import com.istte.biblioteca.controlador.IEstudianteControlador;
import com.istte.biblioteca.modelo.dao.IEstudianteDao;
import com.istte.biblioteca.modelo.dao.impl.EstudianteDaoImpl;
import com.istte.biblioteca.modelo.entidad.Estudiante;
import java.util.List;

public class EstudianteControladorImpl implements IEstudianteControlador {

    @Override
    public void createEstudiante(Estudiante newEstudiante) {
        IEstudianteDao estudianteDao = new EstudianteDaoImpl();
        estudianteDao.createEstudiante(newEstudiante);
    }

    @Override
    public List<Estudiante> listarAllEstudiante() {
        IEstudianteDao estudianteDao = new EstudianteDaoImpl();
        return estudianteDao.listarAllEstudiante();
    }
}
