package api.adrian.apiweb.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
@SQLDelete(sql = "UPDATE clientes SET estado=0 WHERE idclientes=?")
@Where(clause = "estado = 1")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String correo;
    private String zip;
    private String telefono1;
    private String telefono2;
    private String pais;
    private String direccion;
    private Integer estado;

    public Clientes() {
    }

    public Clientes(Integer id, String nombre, String correo, String zip, String telefono1, String telefono2,
            String pais, String direccion, Integer estado) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.zip = zip;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.pais = pais;
        this.direccion = direccion;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Clientes [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", zip=" + zip + ", telefono1="
                + telefono1 + ", telefono2=" + telefono2 + ", pais=" + pais + ", direccion=" + direccion + ", estado="
                + estado + "]";
    }

}
