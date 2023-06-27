package edu.uady.academia.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "licenciaturas")
@Data
@NoArgsConstructor
public class Licenciatura {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private int total_semestres;
    private String facultad;
}
