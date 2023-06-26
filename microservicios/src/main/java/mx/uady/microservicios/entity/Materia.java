package mx.uady.microservicios.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "materias")
public class Materia {

    @Id
    @Column (name = "identificador")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column (name = "nombre_materia")
    private String nombre_materia;

    @Column (name = "semestre")
    private int semestre;

    @Column (name = "licenciatura")
    private String licenciatura;

    public Materia() {
    }

    public Materia(int id) {
        this.id = id;
    }

    public Materia(String nombre_materia, int semestre, String licenciatura) {
        this.nombre_materia = nombre_materia;
        this.semestre = semestre;
        this.licenciatura = licenciatura;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getNombre_materia() { return nombre_materia; }

    public void setNombre_materia(String nombre_materia) { this.nombre_materia = nombre_materia; }

    public int getSemestre() { return semestre; }

    public void setSemestre(int semestre) { this.semestre = semestre; }

    public String getLicenciatura() { return licenciatura; }

    public void setLicenciatura(String licenciatura) { this.licenciatura = licenciatura; }

    @Override
    public String toString() {
        return "Materia {" +
                "id=" + id +
                ", nombre de materia='" + nombre_materia + '\'' +
                ", semestre=" + semestre +
                ", licenciatura='" + licenciatura + '\'' +
                "}\n";
    }
}
