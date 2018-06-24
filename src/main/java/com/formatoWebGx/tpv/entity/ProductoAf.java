package com.formatoWebGx.tpv.entity;

import javax.persistence.*;

@Entity
@Table(name = "producto_af", schema = "TPV", catalog = "")
public class ProductoAf {
    private Long idProductoAf;
    private String nombrePackUno;
    private Double cantidadPackUno;
    private String nombrePackDos;
    private Double cantidadPackDos;
    private String nombrePackTres;
    private Double cantidadPackTres;
    private Double pesoPackUno;
    private Producto productoBy;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto_af")
    public Long getIdProductoAf() {
        return idProductoAf;
    }

    public void setIdProductoAf(Long idProductoAf) {
        this.idProductoAf = idProductoAf;
    }

    @Basic
    @Column(name = "nombre_pack_uno")
    public String getNombrePackUno() {
        return nombrePackUno;
    }

    public void setNombrePackUno(String nombrePackUno) {
        this.nombrePackUno = nombrePackUno;
    }

    @Basic
    @Column(name = "cantidad_pack_uno")
    public Double getCantidadPackUno() {
        return cantidadPackUno;
    }

    public void setCantidadPackUno(Double cantidadPackUno) {
        this.cantidadPackUno = cantidadPackUno;
    }

    @Basic
    @Column(name = "nombre_pack_dos")
    public String getNombrePackDos() {
        return nombrePackDos;
    }

    public void setNombrePackDos(String nombrePackDos) {
        this.nombrePackDos = nombrePackDos;
    }

    @Basic
    @Column(name = "cantidad_pack_dos")
    public Double getCantidadPackDos() {
        return cantidadPackDos;
    }

    public void setCantidadPackDos(Double cantidadPackDos) {
        this.cantidadPackDos = cantidadPackDos;
    }

    @Basic
    @Column(name = "nombre_pack_tres")
    public String getNombrePackTres() {
        return nombrePackTres;
    }

    public void setNombrePackTres(String nombrePackTres) {
        this.nombrePackTres = nombrePackTres;
    }

    @Basic
    @Column(name = "cantidad_pack_tres")
    public Double getCantidadPackTres() {
        return cantidadPackTres;
    }

    public void setCantidadPackTres(Double cantidadPackTres) {
        this.cantidadPackTres = cantidadPackTres;
    }

    @Basic
    @Column(name = "peso_pack_uno")
    public Double getPesoPackUno() {
        return pesoPackUno;
    }

    public void setPesoPackUno(Double pesoPackUno) {
        this.pesoPackUno = pesoPackUno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductoAf that = (ProductoAf) o;

        if (idProductoAf != null ? !idProductoAf.equals(that.idProductoAf) : that.idProductoAf != null) return false;
        if (nombrePackUno != null ? !nombrePackUno.equals(that.nombrePackUno) : that.nombrePackUno != null)
            return false;
        if (cantidadPackUno != null ? !cantidadPackUno.equals(that.cantidadPackUno) : that.cantidadPackUno != null)
            return false;
        if (nombrePackDos != null ? !nombrePackDos.equals(that.nombrePackDos) : that.nombrePackDos != null)
            return false;
        if (cantidadPackDos != null ? !cantidadPackDos.equals(that.cantidadPackDos) : that.cantidadPackDos != null)
            return false;
        if (nombrePackTres != null ? !nombrePackTres.equals(that.nombrePackTres) : that.nombrePackTres != null)
            return false;
        if (cantidadPackTres != null ? !cantidadPackTres.equals(that.cantidadPackTres) : that.cantidadPackTres != null)
            return false;
        if (pesoPackUno != null ? !pesoPackUno.equals(that.pesoPackUno) : that.pesoPackUno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProductoAf != null ? idProductoAf.hashCode() : 0;
        result = 31 * result + (nombrePackUno != null ? nombrePackUno.hashCode() : 0);
        result = 31 * result + (cantidadPackUno != null ? cantidadPackUno.hashCode() : 0);
        result = 31 * result + (nombrePackDos != null ? nombrePackDos.hashCode() : 0);
        result = 31 * result + (cantidadPackDos != null ? cantidadPackDos.hashCode() : 0);
        result = 31 * result + (nombrePackTres != null ? nombrePackTres.hashCode() : 0);
        result = 31 * result + (cantidadPackTres != null ? cantidadPackTres.hashCode() : 0);
        result = 31 * result + (pesoPackUno != null ? pesoPackUno.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "id_producto_af", referencedColumnName = "id_producto", nullable = false)
    public Producto getProductoBy() {
        return productoBy;
    }

    public void setProductoBy(Producto productoBy) {
        this.productoBy = productoBy;
    }
}
