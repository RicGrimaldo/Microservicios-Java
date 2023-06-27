package edu.uady.academia.controller;

import edu.uady.academia.entity.Licenciatura;
import edu.uady.academia.service.LicenciaturaService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/licenciatura")
@Log4j2
public class LicenciaturaController {
    @Autowired
    private LicenciaturaService licenciaturaService;

    @GetMapping
    public List<Licenciatura> getAllLicenciaturas() {
        return licenciaturaService.getAlllicenciaturas();
    }

    @PostMapping
    public Licenciatura createLicenciatura(@RequestBody Licenciatura licenciatura){
        log.info("Licenciatura  a guardar: "+licenciatura.toString());
        return licenciaturaService.createLicenciatura(licenciatura);
    }

    @PutMapping
    public Licenciatura updateLicenciatura(@RequestBody Licenciatura licenciatura) {
        log.info("Licenciatura a actualizar :"+licenciatura.toString());
        return licenciaturaService.updateLicenciatura(licenciatura);
    }

    @DeleteMapping("/{id}")
    public void deleteLicenciatura(@PathVariable (value = "id") Long id){
        licenciaturaService.deleteLicenciatura(id);
    }
}
