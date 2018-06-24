package com.formatoWebGx.tpv.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Categoria {
    private Long idCategoria;
    private String nombre;
    private String descripcion;
    private List<Producto> productos;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Categoria categoria = (Categoria) o;

        if (idCategoria != null ? !idCategoria.equals(categoria.idCategoria) : categoria.idCategoria != null)
            return false;
        if (nombre != null ? !nombre.equals(categoria.nombre) : categoria.nombre != null) return false;
        if (descripcion != null ? !descripcion.equals(categoria.descripcion) : categoria.descripcion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCategoria != null ? idCategoria.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "categoria")
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
