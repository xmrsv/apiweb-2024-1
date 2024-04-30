package api.adrian.apiweb.entity;

import java.math.BigInteger;
import java.security.MessageDigest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registros")
public class Registros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idregistro;
    private String nombres;
    private String apellidos;
    private String email;
    private String cliente_id;
    private String llave_secreta;
    private Integer estado;

    public Registros() {
    }

    public Registros(Integer idregistro, String nombres, String apellidos, String email, String cliente_id,
            String llave_secreta, Integer estado) {
        this.idregistro = idregistro;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.cliente_id = cliente_id;
        this.llave_secreta = llave_secreta;
        this.estado = estado;
    }

    public Integer getIdregistro() {
        return idregistro;
    }

    public void setIdregistro(Integer idregistro) {
        this.idregistro = idregistro;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(String cliente_id) {
        String datos = nombres + apellidos + email;
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");            
        } catch (Exception e) {
            System.err.println(e);
        }
        md.update(datos.getBytes());
        byte[] digest = md.digest();
        String result = new BigInteger(1, digest).toString(16).toLowerCase();
        cliente_id = result;
        this.cliente_id = cliente_id;
    }

    public String getLlave_secreta() {
        return llave_secreta;
    }

    public void setLlave_secreta(String llave_secreta) {
        String datos = apellidos + email + nombres;
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-256");    
        } catch (Exception e) {
            System.err.println(e);
        }
        md.update(datos.getBytes());
        byte[] digest = md.digest();
        String result = new BigInteger(1, digest).toString(16).toLowerCase();
        llave_secreta = result;
        this.llave_secreta = llave_secreta;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Registros [idregistro=" + idregistro + ", nombres=" + nombres + ", apellidos=" + apellidos + ", email="
                + email + ", cliente_id=" + cliente_id + ", llave_secreta=" + llave_secreta + ", estado=" + estado
                + "]";
    }

}
