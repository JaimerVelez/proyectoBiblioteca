package com.istte.biblioteca.modelo.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Préstamo")
public class Prestamo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPrestamo;
    @Column(name = "prestamo_fecha")
    private Date fechaPrestamo;
    @Column(name = "prestamo_fechaDevolver")
    private Date fechaDevolucionPrestamo;
    @Column(name = "prestamo_estudiante_id")
    private int estudianteId;
    @Column(name = "prestamo_libro_id")
    private int libroId;
    
    //Varios préstamos -> un estudiante
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "fkEstudianteId")
    private Estudiante fkEstudianteId;
    
    //Varios préstamos -> un libro
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "fkLibroId")
    private Libro fkLibroId;

    public Prestamo() {
    }

    public Prestamo(int idPrestamo, Date fechaPrestamo, Date fechaDevolucionPrestamo, int estudianteId, int libroId, Estudiante fkEstudianteId, Libro fkLibroId) {
        this.idPrestamo = idPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucionPrestamo = fechaDevolucionPrestamo;
        this.estudianteId = estudianteId;
        this.libroId = libroId;
        this.fkEstudianteId = fkEstudianteId;
        this.fkLibroId = fkLibroId;
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

    public Estudiante getFkEstudianteId() {
        return fkEstudianteId;
    }

    public void setFkEstudianteId(Estudiante fkEstudianteId) {
        this.fkEstudianteId = fkEstudianteId;
    }

    public Libro getFkLibroId() {
        return fkLibroId;
    }

    public void setFkLibroId(Libro fkLibroId) {
        this.fkLibroId = fkLibroId;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "idPrestamo=" + idPrestamo + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucionPrestamo=" + fechaDevolucionPrestamo + ", estudianteId=" + estudianteId + ", libroId=" + libroId + ", fkEstudianteId=" + fkEstudianteId + ", fkLibroId=" + fkLibroId + '}';
    }

}
