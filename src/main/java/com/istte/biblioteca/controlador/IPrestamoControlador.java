package com.istte.biblioteca.controlador;

import com.istte.biblioteca.modelo.entidad.Prestamo;
import java.util.List;

public interface IPrestamoControlador {
    public void createPrestamo(Prestamo newPrestamo);
    public List<Prestamo> listarAllPrestamo();
}
