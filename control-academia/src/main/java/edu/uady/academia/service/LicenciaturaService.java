package edu.uady.academia.service;

import edu.uady.academia.entity.Licenciatura;
import edu.uady.academia.repository.LicenciaturaRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class LicenciaturaService {
    @Autowired
    private LicenciaturaRepository licenciaturaRepository;

    public Licenciatura createLicenciatura(Licenciatura licenciatura){
        log.info("crea licenciatura: "+licenciatura.toString());
        return licenciaturaRepository.save(licenciatura);
    }

    public Licenciatura updateLicenciatura(Licenciatura licenciatura){
        log.info("actualiza licenciatura: "+licenciatura.toString());
        return licenciaturaRepository.save(licenciatura);
    }

    public List<Licenciatura> getAlllicenciaturas(){
        return licenciaturaRepository.findAll();
    }

    public void deleteLicenciatura(Long id){
        licenciaturaRepository.deleteById(id);
    }
}
