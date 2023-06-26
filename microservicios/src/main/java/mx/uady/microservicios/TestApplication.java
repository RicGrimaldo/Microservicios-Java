package mx.uady.microservicios;

import mx.uady.microservicios.entity.Usuario;
import mx.uady.microservicios.repository.UsuarioRepository;
import mx.uady.microservicios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication implements CommandLineRunner  {

	@Autowired
	private UsuarioService usuarioService;
	public static void main(String[] args) {

		SpringApplication.run(TestApplication.class, args);

		System.out.println("Hola mundo");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("public void run");
		Usuario usuario = new Usuario("Grimaldo");
		System.out.println(usuarioService.insertUsuario(usuario));

		Usuario usuario2 = new Usuario("Ricardo");
		System.out.println(usuarioService.insertUsuario(usuario2));
		System.out.println("Registros insertados: " + usuarioService.getAllUsuarios());
	}
}
