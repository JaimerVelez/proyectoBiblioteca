/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.istte.biblioteca.modelo.entidad;

/**
 *
 * @author jaime
 */
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name = "Libros")
public class Libros implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // (strategy = GemerationType.Auto)
    private int idLibros;
    @Column(name = "isbn")
    private String isbnLibro;
    @Column(name = "libro_categoría")
    private String categoriaLibro;
    @Column(name = "libro_titulo")
    private String tituloLibro;
    @Column(name = "libro_autor")
    private String autorLibro;
    @Column(name = "libro_editorial")
    private String editorialLibro;
    @Column(name = "libro_tema")
    private String temaLibro;
    @Column(name = "libro_cantidad")
    private String cantidadLibro;
    @Column(name = "libro_percha")
    private String perchaLibro;
    @Column(name = "libro_estado")
    private String estadoLibro;
    @Column(name = "libro_responsable")
    private String responsableLibro;

    //un libro varios prestamos
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkLibrosID")
    private List<Prestamos> fkPrestamosLibroId;

    public Libros() {
    }

    public Libros(int idLibros, String isbnLibro, String categoriaLibro, String tituloLibro, String autorLibro, String editorialLibro, String temaLibro, String cantidadLibro, String perchaLibro, String estadoLibro, String responsableLibro, List<Prestamos> fkPrestamosLibroId) {
        this.idLibros = idLibros;
        this.isbnLibro = isbnLibro;
        this.categoriaLibro = categoriaLibro;
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.editorialLibro = editorialLibro;
        this.temaLibro = temaLibro;
        this.cantidadLibro = cantidadLibro;
        this.perchaLibro = perchaLibro;
        this.estadoLibro = estadoLibro;
        this.responsableLibro = responsableLibro;
        this.fkPrestamosLibroId = fkPrestamosLibroId;
    }

    public int getIdLibros() {
        return idLibros;
    }

    public void setIdLibros(int idLibros) {
        this.idLibros = idLibros;
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

    public List<Prestamos> getFkPrestamosLibroId() {
        return fkPrestamosLibroId;
    }

    public void setFkPrestamosLibroId(List<Prestamos> fkPrestamosLibroId) {
        this.fkPrestamosLibroId = fkPrestamosLibroId;
    }

    @Override
    public String toString() {
        return "Libros{" + "idLibros=" + idLibros + ", isbnLibro=" + isbnLibro + ", categoriaLibro=" + categoriaLibro + ", tituloLibro=" + tituloLibro + ", autorLibro=" + autorLibro + ", editorialLibro=" + editorialLibro + ", temaLibro=" + temaLibro + ", cantidadLibro=" + cantidadLibro + ", perchaLibro=" + perchaLibro + ", estadoLibro=" + estadoLibro + ", responsableLibro=" + responsableLibro + ", fkPrestamosLibroId=" + fkPrestamosLibroId + '}';
    }

}
