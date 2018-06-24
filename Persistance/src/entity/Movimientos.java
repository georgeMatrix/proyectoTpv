package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Movimientos {
    private Long idMovimiento;
    private Long caja;
    private Date fecha;
    private Time hora;
    private Long producto;
    private Double cantidadVenta;
    private Double importe;
    private Double ivaImporte;
    private Double iepsImporte;
    private Double totalImporteUnidad;
    private Double venta;
    private Double ivaVenta;
    private Double iepsVenta;
    private Double totalVenta;
    private Double utilidad;
    private Double logExistencia;

    @Id
    @Column(name = "id_movimiento")
    public Long getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(Long idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    @Basic
    @Column(name = "caja")
    public Long getCaja() {
        return caja;
    }

    public void setCaja(Long caja) {
        this.caja = caja;
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
    @Column(name = "producto")
    public Long getProducto() {
        return producto;
    }

    public void setProducto(Long producto) {
        this.producto = producto;
    }

    @Basic
    @Column(name = "cantidad_venta")
    public Double getCantidadVenta() {
        return cantidadVenta;
    }

    public void setCantidadVenta(Double cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
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
    @Column(name = "total_importe_unidad")
    public Double getTotalImporteUnidad() {
        return totalImporteUnidad;
    }

    public void setTotalImporteUnidad(Double totalImporteUnidad) {
        this.totalImporteUnidad = totalImporteUnidad;
    }

    @Basic
    @Column(name = "venta")
    public Double getVenta() {
        return venta;
    }

    public void setVenta(Double venta) {
        this.venta = venta;
    }

    @Basic
    @Column(name = "iva_venta")
    public Double getIvaVenta() {
        return ivaVenta;
    }

    public void setIvaVenta(Double ivaVenta) {
        this.ivaVenta = ivaVenta;
    }

    @Basic
    @Column(name = "ieps_venta")
    public Double getIepsVenta() {
        return iepsVenta;
    }

    public void setIepsVenta(Double iepsVenta) {
        this.iepsVenta = iepsVenta;
    }

    @Basic
    @Column(name = "total_venta")
    public Double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }

    @Basic
    @Column(name = "utilidad")
    public Double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(Double utilidad) {
        this.utilidad = utilidad;
    }

    @Basic
    @Column(name = "log_existencia")
    public Double getLogExistencia() {
        return logExistencia;
    }

    public void setLogExistencia(Double logExistencia) {
        this.logExistencia = logExistencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movimientos that = (Movimientos) o;

        if (idMovimiento != null ? !idMovimiento.equals(that.idMovimiento) : that.idMovimiento != null) return false;
        if (caja != null ? !caja.equals(that.caja) : that.caja != null) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;
        if (hora != null ? !hora.equals(that.hora) : that.hora != null) return false;
        if (producto != null ? !producto.equals(that.producto) : that.producto != null) return false;
        if (cantidadVenta != null ? !cantidadVenta.equals(that.cantidadVenta) : that.cantidadVenta != null)
            return false;
        if (importe != null ? !importe.equals(that.importe) : that.importe != null) return false;
        if (ivaImporte != null ? !ivaImporte.equals(that.ivaImporte) : that.ivaImporte != null) return false;
        if (iepsImporte != null ? !iepsImporte.equals(that.iepsImporte) : that.iepsImporte != null) return false;
        if (totalImporteUnidad != null ? !totalImporteUnidad.equals(that.totalImporteUnidad) : that.totalImporteUnidad != null)
            return false;
        if (venta != null ? !venta.equals(that.venta) : that.venta != null) return false;
        if (ivaVenta != null ? !ivaVenta.equals(that.ivaVenta) : that.ivaVenta != null) return false;
        if (iepsVenta != null ? !iepsVenta.equals(that.iepsVenta) : that.iepsVenta != null) return false;
        if (totalVenta != null ? !totalVenta.equals(that.totalVenta) : that.totalVenta != null) return false;
        if (utilidad != null ? !utilidad.equals(that.utilidad) : that.utilidad != null) return false;
        if (logExistencia != null ? !logExistencia.equals(that.logExistencia) : that.logExistencia != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMovimiento != null ? idMovimiento.hashCode() : 0;
        result = 31 * result + (caja != null ? caja.hashCode() : 0);
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (hora != null ? hora.hashCode() : 0);
        result = 31 * result + (producto != null ? producto.hashCode() : 0);
        result = 31 * result + (cantidadVenta != null ? cantidadVenta.hashCode() : 0);
        result = 31 * result + (importe != null ? importe.hashCode() : 0);
        result = 31 * result + (ivaImporte != null ? ivaImporte.hashCode() : 0);
        result = 31 * result + (iepsImporte != null ? iepsImporte.hashCode() : 0);
        result = 31 * result + (totalImporteUnidad != null ? totalImporteUnidad.hashCode() : 0);
        result = 31 * result + (venta != null ? venta.hashCode() : 0);
        result = 31 * result + (ivaVenta != null ? ivaVenta.hashCode() : 0);
        result = 31 * result + (iepsVenta != null ? iepsVenta.hashCode() : 0);
        result = 31 * result + (totalVenta != null ? totalVenta.hashCode() : 0);
        result = 31 * result + (utilidad != null ? utilidad.hashCode() : 0);
        result = 31 * result + (logExistencia != null ? logExistencia.hashCode() : 0);
        return result;
    }
}
