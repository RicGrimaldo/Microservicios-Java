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

    @Column (name = "apellidos")
    private String apellidos;

    @Column (name = "edad")
    private int edad;

    @Column (name = "sexo")
    private boolean sexo;

    public Usuario(int id, String nombre, String apellidos, int edad, boolean sexo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Usuario(String nombre, String apellidos, int edad, boolean sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
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
        String sexoString = (sexo) ? "masculino" : "femenino";
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexoString +
                "}\n";
    }
}
