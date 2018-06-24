package com.formatoWebGx.tpv.entity;

import javax.persistence.*;

@Entity
public class Clientes {
    private Long idCliente;
    private String nombreCliente;
    private String rfc;
    private String dCalle;
    private String dNumeroExt;
    private String dNumeroInt;
    private String dColonia;
    private String dMunicipio;
    private String dCiudad;
    private String dEstado;
    private String dCp;
    private String telefono;
    private String celular;
    private String eMail;
    private Double credito;
    private Double saldo;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    @Basic
    @Column(name = "nombre_cliente")
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Basic
    @Column(name = "rfc")
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Basic
    @Column(name = "d_calle")
    public String getdCalle() {
        return dCalle;
    }

    public void setdCalle(String dCalle) {
        this.dCalle = dCalle;
    }

    @Basic
    @Column(name = "d_numero_ext")
    public String getdNumeroExt() {
        return dNumeroExt;
    }

    public void setdNumeroExt(String dNumeroExt) {
        this.dNumeroExt = dNumeroExt;
    }

    @Basic
    @Column(name = "d_numero_int")
    public String getdNumeroInt() {
        return dNumeroInt;
    }

    public void setdNumeroInt(String dNumeroInt) {
        this.dNumeroInt = dNumeroInt;
    }

    @Basic
    @Column(name = "d_colonia")
    public String getdColonia() {
        return dColonia;
    }

    public void setdColonia(String dColonia) {
        this.dColonia = dColonia;
    }

    @Basic
    @Column(name = "d_municipio")
    public String getdMunicipio() {
        return dMunicipio;
    }

    public void setdMunicipio(String dMunicipio) {
        this.dMunicipio = dMunicipio;
    }

    @Basic
    @Column(name = "d_ciudad")
    public String getdCiudad() {
        return dCiudad;
    }

    public void setdCiudad(String dCiudad) {
        this.dCiudad = dCiudad;
    }

    @Basic
    @Column(name = "d_estado")
    public String getdEstado() {
        return dEstado;
    }

    public void setdEstado(String dEstado) {
        this.dEstado = dEstado;
    }

    @Basic
    @Column(name = "d_cp")
    public String getdCp() {
        return dCp;
    }

    public void setdCp(String dCp) {
        this.dCp = dCp;
    }

    @Basic
    @Column(name = "telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "celular")
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Basic
    @Column(name = "e-mail")
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Basic
    @Column(name = "credito")
    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    @Basic
    @Column(name = "saldo")
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clientes clientes = (Clientes) o;

        if (idCliente != null ? !idCliente.equals(clientes.idCliente) : clientes.idCliente != null) return false;
        if (nombreCliente != null ? !nombreCliente.equals(clientes.nombreCliente) : clientes.nombreCliente != null)
            return false;
        if (rfc != null ? !rfc.equals(clientes.rfc) : clientes.rfc != null) return false;
        if (dCalle != null ? !dCalle.equals(clientes.dCalle) : clientes.dCalle != null) return false;
        if (dNumeroExt != null ? !dNumeroExt.equals(clientes.dNumeroExt) : clientes.dNumeroExt != null) return false;
        if (dNumeroInt != null ? !dNumeroInt.equals(clientes.dNumeroInt) : clientes.dNumeroInt != null) return false;
        if (dColonia != null ? !dColonia.equals(clientes.dColonia) : clientes.dColonia != null) return false;
        if (dMunicipio != null ? !dMunicipio.equals(clientes.dMunicipio) : clientes.dMunicipio != null) return false;
        if (dCiudad != null ? !dCiudad.equals(clientes.dCiudad) : clientes.dCiudad != null) return false;
        if (dEstado != null ? !dEstado.equals(clientes.dEstado) : clientes.dEstado != null) return false;
        if (dCp != null ? !dCp.equals(clientes.dCp) : clientes.dCp != null) return false;
        if (telefono != null ? !telefono.equals(clientes.telefono) : clientes.telefono != null) return false;
        if (celular != null ? !celular.equals(clientes.celular) : clientes.celular != null) return false;
        if (eMail != null ? !eMail.equals(clientes.eMail) : clientes.eMail != null) return false;
        if (credito != null ? !credito.equals(clientes.credito) : clientes.credito != null) return false;
        if (saldo != null ? !saldo.equals(clientes.saldo) : clientes.saldo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCliente != null ? idCliente.hashCode() : 0;
        result = 31 * result + (nombreCliente != null ? nombreCliente.hashCode() : 0);
        result = 31 * result + (rfc != null ? rfc.hashCode() : 0);
        result = 31 * result + (dCalle != null ? dCalle.hashCode() : 0);
        result = 31 * result + (dNumeroExt != null ? dNumeroExt.hashCode() : 0);
        result = 31 * result + (dNumeroInt != null ? dNumeroInt.hashCode() : 0);
        result = 31 * result + (dColonia != null ? dColonia.hashCode() : 0);
        result = 31 * result + (dMunicipio != null ? dMunicipio.hashCode() : 0);
        result = 31 * result + (dCiudad != null ? dCiudad.hashCode() : 0);
        result = 31 * result + (dEstado != null ? dEstado.hashCode() : 0);
        result = 31 * result + (dCp != null ? dCp.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (celular != null ? celular.hashCode() : 0);
        result = 31 * result + (eMail != null ? eMail.hashCode() : 0);
        result = 31 * result + (credito != null ? credito.hashCode() : 0);
        result = 31 * result + (saldo != null ? saldo.hashCode() : 0);
        return result;
    }
}
