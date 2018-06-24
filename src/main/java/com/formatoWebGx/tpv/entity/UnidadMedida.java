package com.formatoWebGx.tpv.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "unidad_medida", schema = "TPV", catalog = "")
public class UnidadMedida {
    private Long idUnidadMedida;
    private String nombre;
    private String descripcion;
    private Byte valorDecimal;
    private List<Producto> productosByIdUnidadMedida;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_unidad_medida")
    public Long getIdUnidadMedida() {
        return idUnidadMedida;
    }

    public void setIdUnidadMedida(Long idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
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

    @Basic
    @Column(name = "valor_decimal")
    public Byte getValorDecimal() {
        return valorDecimal;
    }

    public void setValorDecimal(Byte valorDecimal) {
        this.valorDecimal = valorDecimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UnidadMedida that = (UnidadMedida) o;

        if (idUnidadMedida != null ? !idUnidadMedida.equals(that.idUnidadMedida) : that.idUnidadMedida != null)
            return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (valorDecimal != null ? !valorDecimal.equals(that.valorDecimal) : that.valorDecimal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUnidadMedida != null ? idUnidadMedida.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (valorDecimal != null ? valorDecimal.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "unidadMedida")
    public List<Producto> getProductosByIdUnidadMedida() {
        return productosByIdUnidadMedida;
    }

    public void setProductosByIdUnidadMedida(List<Producto> productosByIdUnidadMedida) {
        this.productosByIdUnidadMedida = productosByIdUnidadMedida;
    }
}
