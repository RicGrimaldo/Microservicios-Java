package mx.uady.microservicios.service;

import mx.uady.microservicios.entity.Materia;
import mx.uady.microservicios.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaService {
    @Autowired
    private MateriaRepository materiaRepository;

    public Materia insertMateria(Materia materia){
        System.out.println("Inserta materia");
        return materiaRepository.save(materia);
    }

    public List<Materia> getAllMaterias() {
        System.out.println("Materias existentes:");
        return materiaRepository.findAll();
    }
}
