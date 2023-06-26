package mx.uady.microservicios.service;

import mx.uady.microservicios.entity.Usuario;
import mx.uady.microservicios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario insertUsuario(Usuario usuario){
        System.out.println("Inserta usuario");
        System.out.println("Valida que ya haya pagado");
        System.out.println("Valida que tenga documentacion en orden");
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> getAllUsuarios(){
        System.out.println("Usuarios que hayan pagado");
        System.out.println("Usuarios que tengan su documentacion en orden");
        return usuarioRepository.findAll();
    }
}
