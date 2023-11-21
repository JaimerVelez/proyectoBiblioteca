package com.istte.biblioteca.modelo.dao;

import com.istte.biblioteca.modelo.entidad.Prestamo;
import java.util.List;

public interface IPrestamoDao {
    public void createPrestamo(Prestamo newPrestamo);
    public List<Prestamo> listarAllPrestamo();
}
