package edu.uady.academia.service;

import edu.uady.academia.entity.Alumno;
import edu.uady.academia.repository.AlumnoRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    public Alumno createAlumno(Alumno alumno){
        log.info("Crea alumno " + alumno.toString());
        return alumnoRepository.save(alumno);
    }

    public Alumno updateAlumno(Alumno alumno){
        log.info("actualiza alumno: "+alumno.toString());
        return alumnoRepository.save(alumno);
    }

    public void deleteAlumno(Long id){
        alumnoRepository.deleteById(id);
    }

    public List<Alumno> getAllAlumnos() {
        return alumnoRepository.findAll();
    }
}
