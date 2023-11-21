/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

/**
 *
 * @author jaime
 */
@Entity
@Table(name = "Prestamos")
public class Prestamos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idPrestamo;
    @Column(name = "prestamo_fechaInicio")
    private Date fechaPrestamo;
    @Column(name = "prestamos_devolucion")
    private Date fechaDevolución;
    @Column(name = "prestamo_estudiante_id")
    private int estudianteId;
    @Column(name = "prestamo_libro_id")
    private int libroId;
    //Varios prestamos un estudiante
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "fkEstudianteID")
    private Estudiantes fkEstudianteID;
    //varios Prestamos un libro
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "fkLibrosID")
    private Libros fkLibrosID;

    public Prestamos() {
    }

    public Prestamos(int idPrestamo, Date fechaPrestamo, Date fechaDevolución, int estudianteId, int libroId, Estudiantes fkEstudianteID, Libros fkLibrosID) {
        this.idPrestamo = idPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolución = fechaDevolución;
        this.estudianteId = estudianteId;
        this.libroId = libroId;
        this.fkEstudianteID = fkEstudianteID;
        this.fkLibrosID = fkLibrosID;
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

    public Date getFechaDevolución() {
        return fechaDevolución;
    }

    public void setFechaDevolución(Date fechaDevolución) {
        this.fechaDevolución = fechaDevolución;
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

    public Estudiantes getFkEstudianteID() {
        return fkEstudianteID;
    }

    public void setFkEstudianteID(Estudiantes fkEstudianteID) {
        this.fkEstudianteID = fkEstudianteID;
    }

    public Libros getFkLibrosID() {
        return fkLibrosID;
    }

    public void setFkLibrosID(Libros fkLibrosID) {
        this.fkLibrosID = fkLibrosID;
    }

    @Override
    public String toString() {
        return "Prestamos{" + "idPrestamo=" + idPrestamo + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevoluci\u00f3n=" + fechaDevolución + ", estudianteId=" + estudianteId + ", libroId=" + libroId + ", fkEstudianteID=" + fkEstudianteID + ", fkLibrosID=" + fkLibrosID + '}';
    }

}
