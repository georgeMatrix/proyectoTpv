package com.formatoWebGx.tpv.model;

import java.util.Arrays;

public class ProductoModel {
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
    private byte activoInactivo;
    private Long provedorId;
    private Long categoriaId;
    private Long unidadMedidaId;

    public ProductoModel() {
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSkuVnpk() {
        return skuVnpk;
    }

    public void setSkuVnpk(String skuVnpk) {
        this.skuVnpk = skuVnpk;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getIvaCosto() {
        return ivaCosto;
    }

    public void setIvaCosto(Double ivaCosto) {
        this.ivaCosto = ivaCosto;
    }

    public Double getIepsCosto() {
        return iepsCosto;
    }

    public void setIepsCosto(Double iepsCosto) {
        this.iepsCosto = iepsCosto;
    }

    public Double getTotalCosto() {
        return totalCosto;
    }

    public void setTotalCosto(Double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public Double getPrecioMay() {
        return precioMay;
    }

    public void setPrecioMay(Double precioMay) {
        this.precioMay = precioMay;
    }

    public Double getIvaPrecioMay() {
        return ivaPrecioMay;
    }

    public void setIvaPrecioMay(Double ivaPrecioMay) {
        this.ivaPrecioMay = ivaPrecioMay;
    }

    public Double getIepsPrecioMay() {
        return iepsPrecioMay;
    }

    public void setIepsPrecioMay(Double iepsPrecioMay) {
        this.iepsPrecioMay = iepsPrecioMay;
    }

    public Double getTotalPrecioMay() {
        return totalPrecioMay;
    }

    public void setTotalPrecioMay(Double totalPrecioMay) {
        this.totalPrecioMay = totalPrecioMay;
    }

    public Double getPrecioMm() {
        return precioMm;
    }

    public void setPrecioMm(Double precioMm) {
        this.precioMm = precioMm;
    }

    public Double getIvaPrecioMm() {
        return ivaPrecioMm;
    }

    public void setIvaPrecioMm(Double ivaPrecioMm) {
        this.ivaPrecioMm = ivaPrecioMm;
    }

    public Double getIepsPrecioMm() {
        return iepsPrecioMm;
    }

    public void setIepsPrecioMm(Double iepsPrecioMm) {
        this.iepsPrecioMm = iepsPrecioMm;
    }

    public Double getTotalPrecioMm() {
        return totalPrecioMm;
    }

    public void setTotalPrecioMm(Double totalPrecioMm) {
        this.totalPrecioMm = totalPrecioMm;
    }

    public Double getPrecioRetail() {
        return precioRetail;
    }

    public void setPrecioRetail(Double precioRetail) {
        this.precioRetail = precioRetail;
    }

    public Double getIvaPrecioRetail() {
        return ivaPrecioRetail;
    }

    public void setIvaPrecioRetail(Double ivaPrecioRetail) {
        this.ivaPrecioRetail = ivaPrecioRetail;
    }

    public Double getIepsPrecioRetail() {
        return iepsPrecioRetail;
    }

    public void setIepsPrecioRetail(Double iepsPrecioRetail) {
        this.iepsPrecioRetail = iepsPrecioRetail;
    }

    public Double getTotalPrecioRetail() {
        return totalPrecioRetail;
    }

    public void setTotalPrecioRetail(Double totalPrecioRetail) {
        this.totalPrecioRetail = totalPrecioRetail;
    }

    public Double getExistencia() {
        return existencia;
    }

    public void setExistencia(Double existencia) {
        this.existencia = existencia;
    }

    public byte getActivoInactivo() {
        return activoInactivo;
    }

    public void setActivoInactivo(byte activoInactivo) {
        this.activoInactivo = activoInactivo;
    }

    public Long getProvedorId() {
        return provedorId;
    }

    public void setProvedorId(Long provedorId) {
        this.provedorId = provedorId;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Long getUnidadMedidaId() {
        return unidadMedidaId;
    }

    public void setUnidadMedidaId(Long unidadMedidaId) {
        this.unidadMedidaId = unidadMedidaId;
    }

    @Override
    public String toString() {
        return "ProductoModel{" +
                "idProducto=" + idProducto +
                ", clave='" + clave + '\'' +
                ", sku='" + sku + '\'' +
                ", skuVnpk='" + skuVnpk + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", descripcionE='" + descripcionE + '\'' +
                ", costo=" + costo +
                ", ivaCosto=" + ivaCosto +
                ", iepsCosto=" + iepsCosto +
                ", totalCosto=" + totalCosto +
                ", precioMay=" + precioMay +
                ", ivaPrecioMay=" + ivaPrecioMay +
                ", iepsPrecioMay=" + iepsPrecioMay +
                ", totalPrecioMay=" + totalPrecioMay +
                ", precioMm=" + precioMm +
                ", ivaPrecioMm=" + ivaPrecioMm +
                ", iepsPrecioMm=" + iepsPrecioMm +
                ", totalPrecioMm=" + totalPrecioMm +
                ", precioRetail=" + precioRetail +
                ", ivaPrecioRetail=" + ivaPrecioRetail +
                ", iepsPrecioRetail=" + iepsPrecioRetail +
                ", totalPrecioRetail=" + totalPrecioRetail +
                ", existencia=" + existencia +
                ", activoInactivo=" + activoInactivo +
                ", provedorId=" + provedorId +
                ", categoriaId=" + categoriaId +
                ", unidadMedidaId=" + unidadMedidaId +
                '}';
    }
}
