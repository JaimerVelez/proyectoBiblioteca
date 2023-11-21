/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istte.biblioteca.modelo.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jaime
 */
@Entity
@Table(name = "Estudiantes")
public class Estudiantes implements Serializable {

    @Id

    private int cedula;
    @Column(name = "estudiante_nombre")
    private String nombreEstudiante;
    @Column(name = "estudiante_apellido")
    private String apellidoEstudiante;
    @Column(name = "estudiante_correo")
    private String correoEstudiante;
    @Column(name = "estudiante_telefono")
    private String telefonoEstudiante;
    @Column(name = "estudiante_estado")
    private String direccionEstudiante;
    @Column(name = "estudiante_direccion")
    private int estadoEstudiante;
    @Column(name = "estudiante_es")
    private int esEstudiante;
    //Un estudiante Varios prestamos
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkEstudianteID")
    private List<Prestamos> fkPrestamoId;

    public Estudiantes() {
    }

    public Estudiantes(int cedula, String nombreEstudiante, String apellidoEstudiante, String correoEstudiante, String telefonoEstudiante, String direccionEstudiante, int estadoEstudiante, int esEstudiante, List<Prestamos> fkPrestamoId) {
        this.cedula = cedula;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.correoEstudiante = correoEstudiante;
        this.telefonoEstudiante = telefonoEstudiante;
        this.direccionEstudiante = direccionEstudiante;
        this.estadoEstudiante = estadoEstudiante;
        this.esEstudiante = esEstudiante;
        this.fkPrestamoId = fkPrestamoId;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
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

    public List<Prestamos> getFkPrestamoId() {
        return fkPrestamoId;
    }

    public void setFkPrestamoId(List<Prestamos> fkPrestamoId) {
        this.fkPrestamoId = fkPrestamoId;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "cedula=" + cedula + ", nombreEstudiante=" + nombreEstudiante + ", apellidoEstudiante=" + apellidoEstudiante + ", correoEstudiante=" + correoEstudiante + ", telefonoEstudiante=" + telefonoEstudiante + ", direccionEstudiante=" + direccionEstudiante + ", estadoEstudiante=" + estadoEstudiante + ", esEstudiante=" + esEstudiante + ", fkPrestamoId=" + fkPrestamoId + '}';
    }

}
