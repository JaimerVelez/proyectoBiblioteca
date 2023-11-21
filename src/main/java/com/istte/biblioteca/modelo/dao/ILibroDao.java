package com.istte.biblioteca.modelo.dao;

import com.istte.biblioteca.modelo.entidad.Libro;
import java.util.List;

public interface ILibroDao {
    public void createLibro(Libro newLibro);
    public List<Libro> listarAllLibro();
}
