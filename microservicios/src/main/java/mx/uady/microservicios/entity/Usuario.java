package mx.uady.microservicios.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "usuarios")
public class Usuario {

    @Id
    @Column (name = "identificador")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column (name = "nombre")
    private String nombre;

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario {" +
                "id =" + id +
                ", nombre ='" + nombre + '\'' +
                '}';
    }
}
