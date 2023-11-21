package com.istte.biblioteca.vistas;

import com.istte.biblioteca.controlador.IEstudianteControlador;
import com.istte.biblioteca.controlador.impl.EstudianteControladorImpl;
import com.istte.biblioteca.modelo.entidad.Estudiante;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "estudiantecore")
@ViewScoped
public class EstudianteVista implements Serializable {
    private int cedulaEstudiante;
    private String nombreEstudiante;
    private String apellidosEstudiante;
    private String correoEstudiante;
    private String telefonoEstudiante;
    private String direccionEstudiante;
    private int estadoEstudiante;
    private int esEstudiante;
    
    private IEstudianteControlador estudianteControlador;
    private Estudiante nuevoEstudiante;

    public EstudianteVista() {
    }

    public void insertarEstudiante() {
        nuevoEstudiante = new Estudiante();
        nuevoEstudiante.setCedulaEstudiante(cedulaEstudiante);
        nuevoEstudiante.setNombreEstudiante(nombreEstudiante);
        nuevoEstudiante.setApellidosEstudiante(apellidosEstudiante);
        nuevoEstudiante.setCorreoEstudiante(correoEstudiante);
        nuevoEstudiante.setTelefonoEstudiante(telefonoEstudiante);
        nuevoEstudiante.setDireccionEstudiante(direccionEstudiante);
        nuevoEstudiante.setEstadoEstudiante(1);
        nuevoEstudiante.setEsEstudiante(esEstudiante);
        
        estudianteControlador = new EstudianteControladorImpl();
        estudianteControlador.createEstudiante(nuevoEstudiante);
    }

    public int getCedulaEstudiante() {
        return cedulaEstudiante;
    }

    public void setCedulaEstudiante(int cedulaEstudiante) {
        this.cedulaEstudiante = cedulaEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidosEstudiante() {
        return apellidosEstudiante;
    }

    public void setApellidosEstudiante(String apellidosEstudiante) {
        this.apellidosEstudiante = apellidosEstudiante;
    }

    public String getCorreoEstudiante() {
        return correoEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        this.correoEstudiante = correoEstudiante;
    }

    public String getTelefonoEstudiante() {
        return telefonoEstudiante;
    }

    public void setTelefonoEstudiante(String telefonoEstudiante) {
        this.telefonoEstudiante = telefonoEstudiante;
    }

    public String getDireccionEstudiante() {
        return direccionEstudiante;
    }

    public void setDireccionEstudiante(String direccionEstudiante) {
        this.direccionEstudiante = direccionEstudiante;
    }

    public int getEstadoEstudiante() {
        return estadoEstudiante;
    }

    public void setEstadoEstudiante(int estadoEstudiante) {
        this.estadoEstudiante = estadoEstudiante;
    }

    public int getEsEstudiante() {
        return esEstudiante;
    }

    public void setEsEstudiante(int esEstudiante) {
        this.esEstudiante = esEstudiante;
    }

    public IEstudianteControlador getEstudianteControlador() {
        return estudianteControlador;
    }

    public void setEstudianteControlador(IEstudianteControlador estudianteControlador) {
        this.estudianteControlador = estudianteControlador;
    }

    public Estudiante getNuevoEstudiante() {
        return nuevoEstudiante;
    }

    public void setNuevoEstudiante(Estudiante nuevoEstudiante) {
        this.nuevoEstudiante = nuevoEstudiante;
    }
    
}
