package com.formatoWebGx.tpv.model;

import java.sql.Date;
import java.sql.Time;

public class CajaModel {
    private Long idCaja;
    private Date fecha;
    private Time hora;
    private Long cliente;
    private Long usuario;
    private Long estacion;
    private Double importe;
    private Double ivaImporte;
    private Double iepsImporte;
    private Double totalImporte;
    private Double comision;
    private Double ivaComision;
    private Double totalComision;
    private Double importeGlobal;
    private Long corte;

    public CajaModel() {
    }

    public Long getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Long idCaja) {
        this.idCaja = idCaja;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Long getCliente() {
        return cliente;
    }

    public void setCliente(Long cliente) {
        this.cliente = cliente;
    }

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }

    public Long getEstacion() {
        return estacion;
    }

    public void setEstacion(Long estacion) {
        this.estacion = estacion;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getIvaImporte() {
        return ivaImporte;
    }

    public void setIvaImporte(Double ivaImporte) {
        this.ivaImporte = ivaImporte;
    }

    public Double getIepsImporte() {
        return iepsImporte;
    }

    public void setIepsImporte(Double iepsImporte) {
        this.iepsImporte = iepsImporte;
    }

    public Double getTotalImporte() {
        return totalImporte;
    }

    public void setTotalImporte(Double totalImporte) {
        this.totalImporte = totalImporte;
    }

    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    public Double getIvaComision() {
        return ivaComision;
    }

    public void setIvaComision(Double ivaComision) {
        this.ivaComision = ivaComision;
    }

    public Double getTotalComision() {
        return totalComision;
    }

    public void setTotalComision(Double totalComision) {
        this.totalComision = totalComision;
    }

    public Double getImporteGlobal() {
        return importeGlobal;
    }

    public void setImporteGlobal(Double importeGlobal) {
        this.importeGlobal = importeGlobal;
    }

    public Long getCorte() {
        return corte;
    }

    public void setCorte(Long corte) {
        this.corte = corte;
    }

    @Override
    public String toString() {
        return "CajaModel{" +
                "idCaja=" + idCaja +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", cliente=" + cliente +
                ", usuario=" + usuario +
                ", estacion=" + estacion +
                ", importe=" + importe +
                ", ivaImporte=" + ivaImporte +
                ", iepsImporte=" + iepsImporte +
                ", totalImporte=" + totalImporte +
                ", comision=" + comision +
                ", ivaComision=" + ivaComision +
                ", totalComision=" + totalComision +
                ", importeGlobal=" + importeGlobal +
                ", corte=" + corte +
                '}';
    }
}
