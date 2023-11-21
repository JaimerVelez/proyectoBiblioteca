package com.istte.biblioteca.controlador;

import com.istte.biblioteca.modelo.entidad.Libro;
import java.util.List;

public interface ILibroControlador {
    public void createLibro(Libro newLibro);
    public List<Libro> listarAllLibro();
}
