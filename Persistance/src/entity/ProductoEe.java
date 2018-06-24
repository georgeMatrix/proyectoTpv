package entity;

import javax.persistence.*;

@Entity
@Table(name = "producto_ee", schema = "TPV", catalog = "")
public class ProductoEe {
    private Long idProductoEe;
    private Double existenciaUno;
    private Double existenciaDos;
    private Double existenciaTres;
    private Producto producto;

    @Id
    @Column(name = "id_producto_ee")
    public Long getIdProductoEe() {
        return idProductoEe;
    }

    public void setIdProductoEe(Long idProductoEe) {
        this.idProductoEe = idProductoEe;
    }

    @Basic
    @Column(name = "existencia_uno")
    public Double getExistenciaUno() {
        return existenciaUno;
    }

    public void setExistenciaUno(Double existenciaUno) {
        this.existenciaUno = existenciaUno;
    }

    @Basic
    @Column(name = "existencia_dos")
    public Double getExistenciaDos() {
        return existenciaDos;
    }

    public void setExistenciaDos(Double existenciaDos) {
        this.existenciaDos = existenciaDos;
    }

    @Basic
    @Column(name = "existencia_tres")
    public Double getExistenciaTres() {
        return existenciaTres;
    }

    public void setExistenciaTres(Double existenciaTres) {
        this.existenciaTres = existenciaTres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductoEe that = (ProductoEe) o;

        if (idProductoEe != null ? !idProductoEe.equals(that.idProductoEe) : that.idProductoEe != null) return false;
        if (existenciaUno != null ? !existenciaUno.equals(that.existenciaUno) : that.existenciaUno != null)
            return false;
        if (existenciaDos != null ? !existenciaDos.equals(that.existenciaDos) : that.existenciaDos != null)
            return false;
        if (existenciaTres != null ? !existenciaTres.equals(that.existenciaTres) : that.existenciaTres != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProductoEe != null ? idProductoEe.hashCode() : 0;
        result = 31 * result + (existenciaUno != null ? existenciaUno.hashCode() : 0);
        result = 31 * result + (existenciaDos != null ? existenciaDos.hashCode() : 0);
        result = 31 * result + (existenciaTres != null ? existenciaTres.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "id_producto_ee", referencedColumnName = "id_producto", nullable = false)
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
