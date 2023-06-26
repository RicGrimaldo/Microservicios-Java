package mx.uady.microservicios.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "licenciaturas")
public class Licenciatura {

    @Id
    @Column (name = "identificador")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column (name = "nombre_lic")
    private String nombre_lic;

    @Column (name = "total_semestres")
    private int total_semestres;

    @Column (name = "facultad")
    private String facultad;

    public Licenciatura(int id) {
        this.id = id;
    }

    public Licenciatura(String nombre_lic, int total_semestres, String facultad) {
        this.nombre_lic = nombre_lic;
        this.total_semestres = total_semestres;
        this.facultad = facultad;
    }

    public Licenciatura() { }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getNombre_lic() { return nombre_lic; }

    public void setNombre_lic(String nombre_lic) { this.nombre_lic = nombre_lic; }

    public int getTotal_semestres() { return total_semestres; }

    public void setTotal_semestres(int total_semestres) { this.total_semestres = total_semestres; }

    public String getFacultad() { return facultad; }

    public void setFacultad(String facultad) { this.facultad = facultad; }

    @Override
    public String toString() {
        return "Licenciatura: {" +
                "id=" + id +
                ", nombre='" + nombre_lic + '\'' +
                ", total de semestres=" + total_semestres +
                ", facultad='" + facultad + '\'' +
                "}\n";
    }
}
