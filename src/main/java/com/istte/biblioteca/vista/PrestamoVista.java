package com.istte.biblioteca.vista;

import com.istte.biblioteca.controlador.IPrestamoControlador;
import com.istte.biblioteca.controlador.impl.PrestamoControladorImpl;
import com.istte.biblioteca.modelo.entidad.Prestamo;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "prestamocore")
@ViewScoped
public class PrestamoVista implements Serializable {
    private int idPrestamo;
    private Date fechaPrestamo;
    private Date fechaDevolucionPrestamo;
    private int estudianteId;
    private int libroId;
    
    private IPrestamoControlador prestamoControlador;
    private Prestamo nuevoPrestamo;
    private List<Prestamo> listarPrestamo;

    public PrestamoVista() {
    }
    
    @PostConstruct
    public void init() {
        listarAllPrestamo();
    }
    
    public void insertarPrestamo() {
        nuevoPrestamo = new Prestamo();
        nuevoPrestamo.setIdPrestamo(idPrestamo);
        nuevoPrestamo.setFechaPrestamo(fechaPrestamo);
        nuevoPrestamo.setFechaDevolucionPrestamo(fechaDevolucionPrestamo);
        nuevoPrestamo.setEstudianteId(estudianteId);
        nuevoPrestamo.setLibroId(libroId);
        prestamoControlador = new PrestamoControladorImpl();
        
        try {
            prestamoControlador.createPrestamo(nuevoPrestamo);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Estudiante Insertado", "registro Generado"));
        } catch(Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Estudiante Insertado", "Error" + e.getMessage()));
        }
        listarAllPrestamo();
    }
    
    public void listarAllPrestamo() {
        prestamoControlador = new PrestamoControladorImpl();
        listarPrestamo = prestamoControlador.listarAllPrestamo();
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucionPrestamo() {
        return fechaDevolucionPrestamo;
    }

    public void setFechaDevolucionPrestamo(Date fechaDevolucionPrestamo) {
        this.fechaDevolucionPrestamo = fechaDevolucionPrestamo;
    }

    public int getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(int estudianteId) {
        this.estudianteId = estudianteId;
    }

    public int getLibroId() {
        return libroId;
    }

    public void setLibroId(int libroId) {
        this.libroId = libroId;
    }

    public IPrestamoControlador getPrestamoControlador() {
        return prestamoControlador;
    }

    public void setPrestamoControlador(IPrestamoControlador prestamoControlador) {
        this.prestamoControlador = prestamoControlador;
    }

    public Prestamo getNuevoPrestamo() {
        return nuevoPrestamo;
    }

    public void setNuevoPrestamo(Prestamo nuevoPrestamo) {
        this.nuevoPrestamo = nuevoPrestamo;
    }

    public List<Prestamo> getListarPrestamo() {
        return listarPrestamo;
    }

    public void setListarPrestamo(List<Prestamo> listarPrestamo) {
        this.listarPrestamo = listarPrestamo;
    }
    
}
