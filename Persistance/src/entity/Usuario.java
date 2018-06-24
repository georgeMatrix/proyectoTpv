package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
    private Long idUsuario;
    private String nombre;
    private String nombreCorto;
    private Byte modulo01;
    private Byte modulo02;
    private Byte modulo03;
    private Byte modulo04;
    private Byte modulo05;

    @Id
    @Column(name = "id_usuario")
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
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
    @Column(name = "nombre_corto")
    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    @Basic
    @Column(name = "modulo_01")
    public Byte getModulo01() {
        return modulo01;
    }

    public void setModulo01(Byte modulo01) {
        this.modulo01 = modulo01;
    }

    @Basic
    @Column(name = "modulo_02")
    public Byte getModulo02() {
        return modulo02;
    }

    public void setModulo02(Byte modulo02) {
        this.modulo02 = modulo02;
    }

    @Basic
    @Column(name = "modulo_03")
    public Byte getModulo03() {
        return modulo03;
    }

    public void setModulo03(Byte modulo03) {
        this.modulo03 = modulo03;
    }

    @Basic
    @Column(name = "modulo_04")
    public Byte getModulo04() {
        return modulo04;
    }

    public void setModulo04(Byte modulo04) {
        this.modulo04 = modulo04;
    }

    @Basic
    @Column(name = "modulo_05")
    public Byte getModulo05() {
        return modulo05;
    }

    public void setModulo05(Byte modulo05) {
        this.modulo05 = modulo05;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        if (idUsuario != null ? !idUsuario.equals(usuario.idUsuario) : usuario.idUsuario != null) return false;
        if (nombre != null ? !nombre.equals(usuario.nombre) : usuario.nombre != null) return false;
        if (nombreCorto != null ? !nombreCorto.equals(usuario.nombreCorto) : usuario.nombreCorto != null) return false;
        if (modulo01 != null ? !modulo01.equals(usuario.modulo01) : usuario.modulo01 != null) return false;
        if (modulo02 != null ? !modulo02.equals(usuario.modulo02) : usuario.modulo02 != null) return false;
        if (modulo03 != null ? !modulo03.equals(usuario.modulo03) : usuario.modulo03 != null) return false;
        if (modulo04 != null ? !modulo04.equals(usuario.modulo04) : usuario.modulo04 != null) return false;
        if (modulo05 != null ? !modulo05.equals(usuario.modulo05) : usuario.modulo05 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuario != null ? idUsuario.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (nombreCorto != null ? nombreCorto.hashCode() : 0);
        result = 31 * result + (modulo01 != null ? modulo01.hashCode() : 0);
        result = 31 * result + (modulo02 != null ? modulo02.hashCode() : 0);
        result = 31 * result + (modulo03 != null ? modulo03.hashCode() : 0);
        result = 31 * result + (modulo04 != null ? modulo04.hashCode() : 0);
        result = 31 * result + (modulo05 != null ? modulo05.hashCode() : 0);
        return result;
    }
}
