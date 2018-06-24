package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Caja {
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

    @Id
    @Column(name = "id_caja")
    public Long getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Long idCaja) {
        this.idCaja = idCaja;
    }

    @Basic
    @Column(name = "fecha")
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Basic
    @Column(name = "hora")
    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    @Basic
    @Column(name = "cliente")
    public Long getCliente() {
        return cliente;
    }

    public void setCliente(Long cliente) {
        this.cliente = cliente;
    }

    @Basic
    @Column(name = "usuario")
    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }

    @Basic
    @Column(name = "estacion")
    public Long getEstacion() {
        return estacion;
    }

    public void setEstacion(Long estacion) {
        this.estacion = estacion;
    }

    @Basic
    @Column(name = "importe")
    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    @Basic
    @Column(name = "iva_importe")
    public Double getIvaImporte() {
        return ivaImporte;
    }

    public void setIvaImporte(Double ivaImporte) {
        this.ivaImporte = ivaImporte;
    }

    @Basic
    @Column(name = "ieps_importe")
    public Double getIepsImporte() {
        return iepsImporte;
    }

    public void setIepsImporte(Double iepsImporte) {
        this.iepsImporte = iepsImporte;
    }

    @Basic
    @Column(name = "total_importe")
    public Double getTotalImporte() {
        return totalImporte;
    }

    public void setTotalImporte(Double totalImporte) {
        this.totalImporte = totalImporte;
    }

    @Basic
    @Column(name = "comision")
    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    @Basic
    @Column(name = "iva_comision")
    public Double getIvaComision() {
        return ivaComision;
    }

    public void setIvaComision(Double ivaComision) {
        this.ivaComision = ivaComision;
    }

    @Basic
    @Column(name = "total_comision")
    public Double getTotalComision() {
        return totalComision;
    }

    public void setTotalComision(Double totalComision) {
        this.totalComision = totalComision;
    }

    @Basic
    @Column(name = "importe_global")
    public Double getImporteGlobal() {
        return importeGlobal;
    }

    public void setImporteGlobal(Double importeGlobal) {
        this.importeGlobal = importeGlobal;
    }

    @Basic
    @Column(name = "corte")
    public Long getCorte() {
        return corte;
    }

    public void setCorte(Long corte) {
        this.corte = corte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Caja caja = (Caja) o;

        if (idCaja != null ? !idCaja.equals(caja.idCaja) : caja.idCaja != null) return false;
        if (fecha != null ? !fecha.equals(caja.fecha) : caja.fecha != null) return false;
        if (hora != null ? !hora.equals(caja.hora) : caja.hora != null) return false;
        if (cliente != null ? !cliente.equals(caja.cliente) : caja.cliente != null) return false;
        if (usuario != null ? !usuario.equals(caja.usuario) : caja.usuario != null) return false;
        if (estacion != null ? !estacion.equals(caja.estacion) : caja.estacion != null) return false;
        if (importe != null ? !importe.equals(caja.importe) : caja.importe != null) return false;
        if (ivaImporte != null ? !ivaImporte.equals(caja.ivaImporte) : caja.ivaImporte != null) return false;
        if (iepsImporte != null ? !iepsImporte.equals(caja.iepsImporte) : caja.iepsImporte != null) return false;
        if (totalImporte != null ? !totalImporte.equals(caja.totalImporte) : caja.totalImporte != null) return false;
        if (comision != null ? !comision.equals(caja.comision) : caja.comision != null) return false;
        if (ivaComision != null ? !ivaComision.equals(caja.ivaComision) : caja.ivaComision != null) return false;
        if (totalComision != null ? !totalComision.equals(caja.totalComision) : caja.totalComision != null)
            return false;
        if (importeGlobal != null ? !importeGlobal.equals(caja.importeGlobal) : caja.importeGlobal != null)
            return false;
        if (corte != null ? !corte.equals(caja.corte) : caja.corte != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCaja != null ? idCaja.hashCode() : 0;
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (hora != null ? hora.hashCode() : 0);
        result = 31 * result + (cliente != null ? cliente.hashCode() : 0);
        result = 31 * result + (usuario != null ? usuario.hashCode() : 0);
        result = 31 * result + (estacion != null ? estacion.hashCode() : 0);
        result = 31 * result + (importe != null ? importe.hashCode() : 0);
        result = 31 * result + (ivaImporte != null ? ivaImporte.hashCode() : 0);
        result = 31 * result + (iepsImporte != null ? iepsImporte.hashCode() : 0);
        result = 31 * result + (totalImporte != null ? totalImporte.hashCode() : 0);
        result = 31 * result + (comision != null ? comision.hashCode() : 0);
        result = 31 * result + (ivaComision != null ? ivaComision.hashCode() : 0);
        result = 31 * result + (totalComision != null ? totalComision.hashCode() : 0);
        result = 31 * result + (importeGlobal != null ? importeGlobal.hashCode() : 0);
        result = 31 * result + (corte != null ? corte.hashCode() : 0);
        return result;
    }
}
