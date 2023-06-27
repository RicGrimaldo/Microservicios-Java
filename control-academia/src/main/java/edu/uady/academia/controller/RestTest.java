package edu.uady.academia.controller;

import jakarta.websocket.server.PathParam;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
@Log4j2
public class RestTest {
    @GetMapping(value = "/materia/{nombre}")
    public String Saludo2(@PathVariable(name = "nombre") String nombre,
                          @PathParam("semestre") int semestre,
                          @PathParam("licenciatura") String licenciatura){
        log.info("nombre: " + nombre);
        log.info("semestre: " + semestre);
        log.info("licenciatura: " + licenciatura);
        return "Materia " + nombre + " del semestre " + semestre + " de la licenciatura " + licenciatura;
    }
}
