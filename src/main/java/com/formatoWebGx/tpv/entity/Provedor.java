package com.formatoWebGx.tpv.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Provedor {
    private Long idProvedor;
    private String nombre;
    private String razonSocial;
    private String rfc;
    private String direccion;
    private String telefono;
    private String contacto;
    private List<Producto> productos;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_provedor")
    public Long getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(Long idProvedor) {
        this.idProvedor = idProvedor;
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
    @Column(name = "razon_social")
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
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
    @Column(name = "direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
    @Column(name = "contacto")
    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Provedor provedor = (Provedor) o;

        if (idProvedor != null ? !idProvedor.equals(provedor.idProvedor) : provedor.idProvedor != null) return false;
        if (nombre != null ? !nombre.equals(provedor.nombre) : provedor.nombre != null) return false;
        if (razonSocial != null ? !razonSocial.equals(provedor.razonSocial) : provedor.razonSocial != null)
            return false;
        if (rfc != null ? !rfc.equals(provedor.rfc) : provedor.rfc != null) return false;
        if (direccion != null ? !direccion.equals(provedor.direccion) : provedor.direccion != null) return false;
        if (telefono != null ? !telefono.equals(provedor.telefono) : provedor.telefono != null) return false;
        if (contacto != null ? !contacto.equals(provedor.contacto) : provedor.contacto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProvedor != null ? idProvedor.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (razonSocial != null ? razonSocial.hashCode() : 0);
        result = 31 * result + (rfc != null ? rfc.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (contacto != null ? contacto.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "provedor")
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
