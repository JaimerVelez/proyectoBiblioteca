/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istte.biblioteca.vista;

import com.istte.biblioteca.controlador.IEstudianteControlador;
import com.istte.biblioteca.modelo.entidad.Estudiante;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean (name = "estudiantecore")
@ViewScoped

public class EstudianteVista implements Serializable {

    private int cedulaEstudiante;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private String correoEstudiante;
    private String telefonoEstudiante;
    private String direccionEstudiante;
    private int estadoEstudiante;
    private int esEstudiante;
    private Estudiante nuevoEstudiante;
    private IEstudianteControlador iEstudianteControlador;

    public EstudianteVista() {
    }

    public void init() {
        System.out.println("acceso al servidor");
    }
    
    public void insertarEstudiante() {
        nuevoEstudiante = new Estudiante();
        nuevoEstudiante.setCedulaEstudiante(cedulaEstudiante);
        nuevoEstudiante.setNombreEstudiante(nombreEstudiante);
        nuevoEstudiante.setApellidosEstudiante(apellidoEstudiante);
        nuevoEstudiante.setCorreoEstudiante(correoEstudiante);
        nuevoEstudiante.setTelefonoEstudiante(telefonoEstudiante);
        nuevoEstudiante.setDireccionEstudiante(direccionEstudiante);
        nuevoEstudiante.setEstadoEstudiante(1);
        nuevoEstudiante.setEsEstudiante(esEstudiante);
        
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

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
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

    public Estudiante getNuevoEstudiante() {
        return nuevoEstudiante;
    }

    public void setNuevoEstudiante(Estudiante nuevoEstudiante) {
        this.nuevoEstudiante = nuevoEstudiante;
    }

    public IEstudianteControlador getEstudianteControlador() {
        return iEstudianteControlador;
    }

    public void setEstudianteControlador(IEstudianteControlador estudianteControlador) {
        this.iEstudianteControlador = estudianteControlador;
    }
    
}

