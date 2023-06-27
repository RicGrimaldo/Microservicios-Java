package edu.uady.academia.controller;

import edu.uady.academia.entity.Materia;
import edu.uady.academia.service.MateriaService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/materia")
@Log4j2
public class MateriaController {
    @Autowired
    private MateriaService materiaService;

    @GetMapping
    public List<Materia> getAllMaterias(){
        return materiaService.getAllMaterias();
    }

    @PostMapping
    public Materia createMateria(@RequestBody Materia materia){
        log.info("Materia a guardar: " + materia.toString());
        return materiaService.createMateria(materia);
    }

    @PutMapping
    public Materia updateMateria(@RequestBody Materia materia) {
        log.info("Materia a actualizar :"+materia.toString());
        return materiaService.updateMateria(materia);
    }

    @DeleteMapping("/{id}")
    public void deleteMateria(@PathVariable (value = "id") Long id){
        materiaService.deleteMateria(id);
    }
}
