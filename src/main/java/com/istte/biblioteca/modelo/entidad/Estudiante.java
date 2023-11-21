package com.istte.biblioteca.modelo.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Estudiante")
public class Estudiante implements Serializable {
    @Id
    private int cedulaEstudiante;
    
    @Column(name = "estudiante_nombre")
    private String nombreEstudiante;
    @Column(name = "estudiante_apellidos")
    private String apellidosEstudiante;
    @Column(name = "estudiante_correo")
    private String correoEstudiante;
    @Column(name = "estudiante_telefono")
    private String telefonoEstudiante;
    @Column(name = "estudiante_direccion")
    private String direccionEstudiante;
    @Column(name = "estudiante_estado")
    private int estadoEstudiante;
    @Column(name = "estudiante_es")
    private int esEstudiante;
    
    //Un estudiante -> varios préstamos
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkEstudianteId")
    private List<Prestamo> fkPrestamoEstudianteId;

    public Estudiante() {
    }

    public Estudiante(int cedulaEstudiante, String nombreEstudiante,
            String apellidosEstudiante, String correoEstudiante,
            String telefonoEstudiante, String direccionEstudiante,
            int estadoEstudiante, int esEstudiante,
            List<Prestamo> fkPrestamoEstudianteId) {
        this.cedulaEstudiante = cedulaEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidosEstudiante = apellidosEstudiante;
        this.correoEstudiante = correoEstudiante;
        this.telefonoEstudiante = telefonoEstudiante;
        this.direccionEstudiante = direccionEstudiante;
        this.estadoEstudiante = estadoEstudiante;
        this.esEstudiante = esEstudiante;
        this.fkPrestamoEstudianteId = fkPrestamoEstudianteId;
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

    public List<Prestamo> getFkPrestamoEstudianteId() {
        return fkPrestamoEstudianteId;
    }

    public void setFkPrestamoEstudianteId(List<Prestamo> fkPrestamoEstudianteId) {
        this.fkPrestamoEstudianteId = fkPrestamoEstudianteId;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "cedulaEstudiante=" + cedulaEstudiante + ", nombreEstudiante=" + nombreEstudiante + ", apellidosEstudiante=" + apellidosEstudiante + ", correoEstudiante=" + correoEstudiante + ", telefonoEstudiante=" + telefonoEstudiante + ", direccionEstudiante=" + direccionEstudiante + ", estadoEstudiante=" + estadoEstudiante + ", esEstudiante=" + esEstudiante + ", fkPrestamoEstudianteId=" + fkPrestamoEstudianteId + '}';
    }
    
}
