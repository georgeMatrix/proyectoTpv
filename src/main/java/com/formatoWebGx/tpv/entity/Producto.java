package com.formatoWebGx.tpv.entity;

import javax.persistence.*;

@Entity
public class Producto {
    private Long idProducto;
    private String clave;
    private String sku;
    private String skuVnpk;
    private String descripcion;
    private String descripcionE;
    private Double costo;
    private Double ivaCosto;
    private Double iepsCosto;
    private Double totalCosto;
    private Double precioMay;
    private Double ivaPrecioMay;
    private Double iepsPrecioMay;
    private Double totalPrecioMay;
    private Double precioMm;
    private Double ivaPrecioMm;
    private Double iepsPrecioMm;
    private Double totalPrecioMm;
    private Double precioRetail;
    private Double ivaPrecioRetail;
    private Double iepsPrecioRetail;
    private Double totalPrecioRetail;
    private Double existencia;
    private Byte activoInactivo;
    private Provedor provedor;
    private Categoria categoria;
    private UnidadMedida unidadMedida;
    private ProductoAf productoAf;
    private ProductoEe productoEe;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    @Basic
    @Column(name = "clave")
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Basic
    @Column(name = "sku")
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Basic
    @Column(name = "sku_vnpk")
    public String getSkuVnpk() {
        return skuVnpk;
    }

    public void setSkuVnpk(String skuVnpk) {
        this.skuVnpk = skuVnpk;
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
    @Column(name = "descripcion_e")
    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    @Basic
    @Column(name = "costo")
    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    @Basic
    @Column(name = "iva_costo")
    public Double getIvaCosto() {
        return ivaCosto;
    }

    public void setIvaCosto(Double ivaCosto) {
        this.ivaCosto = ivaCosto;
    }

    @Basic
    @Column(name = "ieps_costo")
    public Double getIepsCosto() {
        return iepsCosto;
    }

    public void setIepsCosto(Double iepsCosto) {
        this.iepsCosto = iepsCosto;
    }

    @Basic
    @Column(name = "total_costo")
    public Double getTotalCosto() {
        return totalCosto;
    }

    public void setTotalCosto(Double totalCosto) {
        this.totalCosto = totalCosto;
    }

    @Basic
    @Column(name = "precio_may")
    public Double getPrecioMay() {
        return precioMay;
    }

    public void setPrecioMay(Double precioMay) {
        this.precioMay = precioMay;
    }

    @Basic
    @Column(name = "iva_precio_may")
    public Double getIvaPrecioMay() {
        return ivaPrecioMay;
    }

    public void setIvaPrecioMay(Double ivaPrecioMay) {
        this.ivaPrecioMay = ivaPrecioMay;
    }

    @Basic
    @Column(name = "ieps_precio_may")
    public Double getIepsPrecioMay() {
        return iepsPrecioMay;
    }

    public void setIepsPrecioMay(Double iepsPrecioMay) {
        this.iepsPrecioMay = iepsPrecioMay;
    }

    @Basic
    @Column(name = "total_precio_may")
    public Double getTotalPrecioMay() {
        return totalPrecioMay;
    }

    public void setTotalPrecioMay(Double totalPrecioMay) {
        this.totalPrecioMay = totalPrecioMay;
    }

    @Basic
    @Column(name = "precio_mm")
    public Double getPrecioMm() {
        return precioMm;
    }

    public void setPrecioMm(Double precioMm) {
        this.precioMm = precioMm;
    }

    @Basic
    @Column(name = "iva_precio_mm")
    public Double getIvaPrecioMm() {
        return ivaPrecioMm;
    }

    public void setIvaPrecioMm(Double ivaPrecioMm) {
        this.ivaPrecioMm = ivaPrecioMm;
    }

    @Basic
    @Column(name = "ieps_precio_mm")
    public Double getIepsPrecioMm() {
        return iepsPrecioMm;
    }

    public void setIepsPrecioMm(Double iepsPrecioMm) {
        this.iepsPrecioMm = iepsPrecioMm;
    }

    @Basic
    @Column(name = "total_precio_mm")
    public Double getTotalPrecioMm() {
        return totalPrecioMm;
    }

    public void setTotalPrecioMm(Double totalPrecioMm) {
        this.totalPrecioMm = totalPrecioMm;
    }

    @Basic
    @Column(name = "precio_retail")
    public Double getPrecioRetail() {
        return precioRetail;
    }

    public void setPrecioRetail(Double precioRetail) {
        this.precioRetail = precioRetail;
    }

    @Basic
    @Column(name = "iva_precio_retail")
    public Double getIvaPrecioRetail() {
        return ivaPrecioRetail;
    }

    public void setIvaPrecioRetail(Double ivaPrecioRetail) {
        this.ivaPrecioRetail = ivaPrecioRetail;
    }

    @Basic
    @Column(name = "ieps_precio_retail")
    public Double getIepsPrecioRetail() {
        return iepsPrecioRetail;
    }

    public void setIepsPrecioRetail(Double iepsPrecioRetail) {
        this.iepsPrecioRetail = iepsPrecioRetail;
    }

    @Basic
    @Column(name = "total_precio_retail")
    public Double getTotalPrecioRetail() {
        return totalPrecioRetail;
    }

    public void setTotalPrecioRetail(Double totalPrecioRetail) {
        this.totalPrecioRetail = totalPrecioRetail;
    }

    @Basic
    @Column(name = "existencia")
    public Double getExistencia() {
        return existencia;
    }

    public void setExistencia(Double existencia) {
        this.existencia = existencia;
    }

    @Basic
    @Column(name = "activo_inactivo")
    public Byte getActivoInactivo() {
        return activoInactivo;
    }

    public void setActivoInactivo(Byte activoInactivo) {
        this.activoInactivo = activoInactivo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Producto producto = (Producto) o;

        if (idProducto != null ? !idProducto.equals(producto.idProducto) : producto.idProducto != null) return false;
        if (clave != null ? !clave.equals(producto.clave) : producto.clave != null) return false;
        if (sku != null ? !sku.equals(producto.sku) : producto.sku != null) return false;
        if (skuVnpk != null ? !skuVnpk.equals(producto.skuVnpk) : producto.skuVnpk != null) return false;
        if (descripcion != null ? !descripcion.equals(producto.descripcion) : producto.descripcion != null)
            return false;
        if (descripcionE != null ? !descripcionE.equals(producto.descripcionE) : producto.descripcionE != null)
            return false;
        if (costo != null ? !costo.equals(producto.costo) : producto.costo != null) return false;
        if (ivaCosto != null ? !ivaCosto.equals(producto.ivaCosto) : producto.ivaCosto != null) return false;
        if (iepsCosto != null ? !iepsCosto.equals(producto.iepsCosto) : producto.iepsCosto != null) return false;
        if (totalCosto != null ? !totalCosto.equals(producto.totalCosto) : producto.totalCosto != null) return false;
        if (precioMay != null ? !precioMay.equals(producto.precioMay) : producto.precioMay != null) return false;
        if (ivaPrecioMay != null ? !ivaPrecioMay.equals(producto.ivaPrecioMay) : producto.ivaPrecioMay != null)
            return false;
        if (iepsPrecioMay != null ? !iepsPrecioMay.equals(producto.iepsPrecioMay) : producto.iepsPrecioMay != null)
            return false;
        if (totalPrecioMay != null ? !totalPrecioMay.equals(producto.totalPrecioMay) : producto.totalPrecioMay != null)
            return false;
        if (precioMm != null ? !precioMm.equals(producto.precioMm) : producto.precioMm != null) return false;
        if (ivaPrecioMm != null ? !ivaPrecioMm.equals(producto.ivaPrecioMm) : producto.ivaPrecioMm != null)
            return false;
        if (iepsPrecioMm != null ? !iepsPrecioMm.equals(producto.iepsPrecioMm) : producto.iepsPrecioMm != null)
            return false;
        if (totalPrecioMm != null ? !totalPrecioMm.equals(producto.totalPrecioMm) : producto.totalPrecioMm != null)
            return false;
        if (precioRetail != null ? !precioRetail.equals(producto.precioRetail) : producto.precioRetail != null)
            return false;
        if (ivaPrecioRetail != null ? !ivaPrecioRetail.equals(producto.ivaPrecioRetail) : producto.ivaPrecioRetail != null)
            return false;
        if (iepsPrecioRetail != null ? !iepsPrecioRetail.equals(producto.iepsPrecioRetail) : producto.iepsPrecioRetail != null)
            return false;
        if (totalPrecioRetail != null ? !totalPrecioRetail.equals(producto.totalPrecioRetail) : producto.totalPrecioRetail != null)
            return false;
        if (existencia != null ? !existencia.equals(producto.existencia) : producto.existencia != null) return false;
        if (activoInactivo != null ? !activoInactivo.equals(producto.activoInactivo) : producto.activoInactivo != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProducto != null ? idProducto.hashCode() : 0;
        result = 31 * result + (clave != null ? clave.hashCode() : 0);
        result = 31 * result + (sku != null ? sku.hashCode() : 0);
        result = 31 * result + (skuVnpk != null ? skuVnpk.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (descripcionE != null ? descripcionE.hashCode() : 0);
        result = 31 * result + (costo != null ? costo.hashCode() : 0);
        result = 31 * result + (ivaCosto != null ? ivaCosto.hashCode() : 0);
        result = 31 * result + (iepsCosto != null ? iepsCosto.hashCode() : 0);
        result = 31 * result + (totalCosto != null ? totalCosto.hashCode() : 0);
        result = 31 * result + (precioMay != null ? precioMay.hashCode() : 0);
        result = 31 * result + (ivaPrecioMay != null ? ivaPrecioMay.hashCode() : 0);
        result = 31 * result + (iepsPrecioMay != null ? iepsPrecioMay.hashCode() : 0);
        result = 31 * result + (totalPrecioMay != null ? totalPrecioMay.hashCode() : 0);
        result = 31 * result + (precioMm != null ? precioMm.hashCode() : 0);
        result = 31 * result + (ivaPrecioMm != null ? ivaPrecioMm.hashCode() : 0);
        result = 31 * result + (iepsPrecioMm != null ? iepsPrecioMm.hashCode() : 0);
        result = 31 * result + (totalPrecioMm != null ? totalPrecioMm.hashCode() : 0);
        result = 31 * result + (precioRetail != null ? precioRetail.hashCode() : 0);
        result = 31 * result + (ivaPrecioRetail != null ? ivaPrecioRetail.hashCode() : 0);
        result = 31 * result + (iepsPrecioRetail != null ? iepsPrecioRetail.hashCode() : 0);
        result = 31 * result + (totalPrecioRetail != null ? totalPrecioRetail.hashCode() : 0);
        result = 31 * result + (existencia != null ? existencia.hashCode() : 0);
        result = 31 * result + (activoInactivo != null ? activoInactivo.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "provedor", referencedColumnName = "id_provedor", nullable = false)
    public Provedor getProvedor() {
        return provedor;
    }

    public void setProvedor(Provedor provedor) {
        this.provedor = provedor;
    }

    @ManyToOne
    @JoinColumn(name = "categoria", referencedColumnName = "id_categoria", nullable = false)
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @ManyToOne
    @JoinColumn(name = "unidad_medida", referencedColumnName = "id_unidad_medida", nullable = false)
    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    @OneToOne(mappedBy = "productoBy")
    public ProductoAf getProductoAf() {
        return productoAf;
    }

    public void setProductoAf(ProductoAf productoAf) {
        this.productoAf = productoAf;
    }

    @OneToOne(mappedBy = "producto")
    public ProductoEe getProductoEe() {
        return productoEe;
    }

    public void setProductoEe(ProductoEe productoEe) {
        this.productoEe = productoEe;
    }
}
