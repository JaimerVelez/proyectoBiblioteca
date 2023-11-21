package com.istte.biblioteca.controlador;

import com.istte.biblioteca.modelo.entidad.Estudiante;
import java.util.List;

public interface IEstudianteControlador {
    public void createEstudiante(Estudiante newEstudiante);
    public List<Estudiante> listarAllEstudiante();
}
