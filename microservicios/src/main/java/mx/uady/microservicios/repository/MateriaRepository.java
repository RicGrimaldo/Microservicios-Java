package mx.uady.microservicios.repository;

import mx.uady.microservicios.entity.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository<Materia, Integer> {
}
