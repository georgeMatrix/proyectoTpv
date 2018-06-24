package com.formatoWebGx.tpv.model;

public class UnidadMedidaModel {
    private Long idUnidadMedida;
    private String nombre;
    private String descripcion;
    private Byte decimal;

    public UnidadMedidaModel() {
    }

    public Long getIdUnidadMedida() {
        return idUnidadMedida;
    }

    public void setIdUnidadMedida(Long idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Byte getDecimal() {
        return decimal;
    }

    public void setDecimal(Byte decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        return "UnidadMedidaModel{" +
                "idUnidadMedida=" + idUnidadMedida +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", decimal=" + decimal +
                '}';
    }
}
