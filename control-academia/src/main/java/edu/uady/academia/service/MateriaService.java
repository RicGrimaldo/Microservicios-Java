package edu.uady.academia.service;

import edu.uady.academia.entity.Materia;
import edu.uady.academia.repository.MateriaRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class MateriaService {
    @Autowired
    private MateriaRepository materiaRepository;

    public Materia createMateria(Materia materia){
        log.info("Crea materia " + materia.toString());
        return materiaRepository.save(materia);
    }

    public Materia updateMateria(Materia materia){
        log.info("Actualiza materia: "+materia.toString());
        return materiaRepository.save(materia);
    }

    public void deleteMateria(Long id){
        materiaRepository.deleteById(id);
    }

    public List<Materia> getAllMaterias(){
        return materiaRepository.findAll();
    }
}
