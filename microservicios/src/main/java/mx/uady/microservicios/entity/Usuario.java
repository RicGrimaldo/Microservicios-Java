package mx.uady.microservicios.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "usuario")
    private List<Materia> materias;

    public Usuario(int id, String nombre, String apellidos, int edad, boolean sexo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.materias = new ArrayList<>();
    }

    public Usuario(String nombre, String apellidos, int edad, boolean sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.materias = new ArrayList<>();
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

    public String getApellidos() { return apellidos; }

    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public int getEdad() { return edad; }

    public void setEdad(int edad) { this.edad = edad; }

    public boolean isSexo() { return sexo; }

    public void setSexo(boolean sexo) { this.sexo = sexo; }

    public List<Materia> getMaterias() { return materias; }

    public void setMaterias(List<Materia> materias) { this.materias = materias; }

    public void addMateria(Materia materia){
        this.materias.add(materia);
    }

    public void showMateriasNames() {
        for (Materia materia : getMaterias()) {
            System.out.println(materia.toString());
        }
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
