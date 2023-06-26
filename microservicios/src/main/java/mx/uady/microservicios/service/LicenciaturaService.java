package mx.uady.microservicios.service;

import mx.uady.microservicios.entity.Licenciatura;
import mx.uady.microservicios.repository.LicenciaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenciaturaService {
    @Autowired
    private LicenciaturaRepository licenciaturaRepository;

    public Licenciatura insertLicenciatura(Licenciatura licenciatura){
        System.out.println("Inserta materia");
        return licenciaturaRepository.save(licenciatura);
    }

    public List<Licenciatura> getAllLicenciaturas(){
        System.out.println("Licenciaturas existentes: ");
        return licenciaturaRepository.findAll();
    }
}
