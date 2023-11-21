/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istte.biblioteca.vista;

import com.istte.biblioteca.controlador.ILibroControlador;
import com.istte.biblioteca.controlador.impl.LibroControladorImpl;
import com.istte.biblioteca.modelo.entidad.Libro;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

/**
 *
 * @author israe
 */
@ManagedBean (name = "librocore")
@ViewScoped
public class LibroVista implements Serializable{
    private int idLibro;
    private String isbnLibro;
    private String categoriaLibro;
    private String tituloLibro;
    private String autorLibro;
    private String editorialLibro;
    private String temaLibro;
    private String cantidadLibro;
    private String perchaLibro;
    private String estadoLibro;
    private String responsableLibro;
    
    private ILibroControlador libroControlador;
    private Libro nuevoLibro;
    private List<Libro> listarLibro;
    

    public LibroVista() {
    }
    
    @PostConstruct
    public void init() {
        listarAllLibro();
    }
    
    public void insertarLibros(){
        nuevoLibro = new Libro();
        nuevoLibro.setIdLibro(idLibro);
        nuevoLibro.setIsbnLibro(isbnLibro);
        nuevoLibro.setCategoriaLibro(categoriaLibro);
        nuevoLibro.setTituloLibro(tituloLibro);
        nuevoLibro.setAutorLibro(autorLibro);
        nuevoLibro.setEditorialLibro(editorialLibro);
        nuevoLibro.setTemaLibro(temaLibro);
        nuevoLibro.setCantidadLibro(cantidadLibro);
        nuevoLibro.setPerchaLibro(perchaLibro);
        nuevoLibro.setEstadoLibro(estadoLibro);
        nuevoLibro.setResponsableLibro(responsableLibro);
        libroControlador = new LibroControladorImpl();
        
        try {
            libroControlador.createLibro(nuevoLibro);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Estudiante Insertado", "registro Generado"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Estudiante Insertado", "Error" + e.getMessage()));
        }
        listarAllLibro();
    }
    
    public void listarAllLibro() {
        libroControlador = new LibroControladorImpl();
        listarLibro = libroControlador.listarAllLibro();
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getIsbnLibro() {
        return isbnLibro;
    }

    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    public String getCategoriaLibro() {
        return categoriaLibro;
    }

    public void setCategoriaLibro(String categoriaLibro) {
        this.categoriaLibro = categoriaLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public String getEditorialLibro() {
        return editorialLibro;
    }

    public void setEditorialLibro(String editorialLibro) {
        this.editorialLibro = editorialLibro;
    }

    public String getTemaLibro() {
        return temaLibro;
    }

    public void setTemaLibro(String temaLibro) {
        this.temaLibro = temaLibro;
    }

    public String getCantidadLibro() {
        return cantidadLibro;
    }

    public void setCantidadLibro(String cantidadLibro) {
        this.cantidadLibro = cantidadLibro;
    }

    public String getPerchaLibro() {
        return perchaLibro;
    }

    public void setPerchaLibro(String perchaLibro) {
        this.perchaLibro = perchaLibro;
    }

    public String getEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(String estadoLibro) {
        this.estadoLibro = estadoLibro;
    }

    public String getResponsableLibro() {
        return responsableLibro;
    }

    public void setResponsableLibro(String responsableLibro) {
        this.responsableLibro = responsableLibro;
    }

    public ILibroControlador getLibroControlador() {
        return libroControlador;
    }

    public void setLibroControlador(ILibroControlador libroControlador) {
        this.libroControlador = libroControlador;
    }

    public Libro getNuevoLibro() {
        return nuevoLibro;
    }

    public void setNuevoLibro(Libro nuevoLibro) {
        this.nuevoLibro = nuevoLibro;
    }

    public List<Libro> getListarLibro() {
        return listarLibro;
    }

    public void setListarLibro(List<Libro> listarLibro) {
        this.listarLibro = listarLibro;
    }
    
}
