package com.istte.biblioteca.modelo.dao;

import com.istte.biblioteca.modelo.entidad.Estudiante;
import java.util.List;

public interface IEstudianteDao {
    public void createEstudiante(Estudiante newEstudiante);
    public List<Estudiante> listarAllEstudiante();
}
