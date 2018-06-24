package com.formatoWebGx.tpv.entity;

import javax.persistence.*;

@Entity
public class Estacion {
    private Long idEstaciones;
    private String nombreEstacion;
    private String volumenHhd;
    private Byte modulos01;
    private Byte modulos02;
    private Byte modulos03;
    private Byte modulos04;
    private Byte modulos05;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estaciones")
    public Long getIdEstaciones() {
        return idEstaciones;
    }

    public void setIdEstaciones(Long idEstaciones) {
        this.idEstaciones = idEstaciones;
    }

    @Basic
    @Column(name = "nombre_estacion")
    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    @Basic
    @Column(name = "volumen_HHD")
    public String getVolumenHhd() {
        return volumenHhd;
    }

    public void setVolumenHhd(String volumenHhd) {
        this.volumenHhd = volumenHhd;
    }

    @Basic
    @Column(name = "modulos_01")
    public Byte getModulos01() {
        return modulos01;
    }

    public void setModulos01(Byte modulos01) {
        this.modulos01 = modulos01;
    }

    @Basic
    @Column(name = "modulos_02")
    public Byte getModulos02() {
        return modulos02;
    }

    public void setModulos02(Byte modulos02) {
        this.modulos02 = modulos02;
    }

    @Basic
    @Column(name = "modulos_03")
    public Byte getModulos03() {
        return modulos03;
    }

    public void setModulos03(Byte modulos03) {
        this.modulos03 = modulos03;
    }

    @Basic
    @Column(name = "modulos_04")
    public Byte getModulos04() {
        return modulos04;
    }

    public void setModulos04(Byte modulos04) {
        this.modulos04 = modulos04;
    }

    @Basic
    @Column(name = "modulos_05")
    public Byte getModulos05() {
        return modulos05;
    }

    public void setModulos05(Byte modulos05) {
        this.modulos05 = modulos05;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Estacion estacion = (Estacion) o;

        if (idEstaciones != null ? !idEstaciones.equals(estacion.idEstaciones) : estacion.idEstaciones != null)
            return false;
        if (nombreEstacion != null ? !nombreEstacion.equals(estacion.nombreEstacion) : estacion.nombreEstacion != null)
            return false;
        if (volumenHhd != null ? !volumenHhd.equals(estacion.volumenHhd) : estacion.volumenHhd != null) return false;
        if (modulos01 != null ? !modulos01.equals(estacion.modulos01) : estacion.modulos01 != null) return false;
        if (modulos02 != null ? !modulos02.equals(estacion.modulos02) : estacion.modulos02 != null) return false;
        if (modulos03 != null ? !modulos03.equals(estacion.modulos03) : estacion.modulos03 != null) return false;
        if (modulos04 != null ? !modulos04.equals(estacion.modulos04) : estacion.modulos04 != null) return false;
        if (modulos05 != null ? !modulos05.equals(estacion.modulos05) : estacion.modulos05 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEstaciones != null ? idEstaciones.hashCode() : 0;
        result = 31 * result + (nombreEstacion != null ? nombreEstacion.hashCode() : 0);
        result = 31 * result + (volumenHhd != null ? volumenHhd.hashCode() : 0);
        result = 31 * result + (modulos01 != null ? modulos01.hashCode() : 0);
        result = 31 * result + (modulos02 != null ? modulos02.hashCode() : 0);
        result = 31 * result + (modulos03 != null ? modulos03.hashCode() : 0);
        result = 31 * result + (modulos04 != null ? modulos04.hashCode() : 0);
        result = 31 * result + (modulos05 != null ? modulos05.hashCode() : 0);
        return result;
    }
}
