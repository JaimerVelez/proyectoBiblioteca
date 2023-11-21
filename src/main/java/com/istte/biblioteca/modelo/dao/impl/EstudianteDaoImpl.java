package com.istte.biblioteca.modelo.dao.impl;

import com.istte.biblioteca.modelo.dao.IEstudianteDao;
import com.istte.biblioteca.modelo.entidad.Estudiante;

public class EstudianteDaoImpl extends GenericDaoImpl<Estudiante> implements IEstudianteDao {

    @Override
    public void createEstudiante(Estudiante newEstudiante) {
        this.beginTransaction();
        this.createEstudiante(newEstudiante);
        this.commit();
    }
    
}
