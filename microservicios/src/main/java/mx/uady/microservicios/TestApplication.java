package mx.uady.microservicios;

import mx.uady.microservicios.entity.Licenciatura;
import mx.uady.microservicios.entity.Materia;
import mx.uady.microservicios.entity.Usuario;
import mx.uady.microservicios.repository.UsuarioRepository;
import mx.uady.microservicios.service.LicenciaturaService;
import mx.uady.microservicios.service.MateriaService;
import mx.uady.microservicios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication implements CommandLineRunner  {

	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private MateriaService materiaService;
	@Autowired
	private LicenciaturaService licenciaturaService;

	public static void main(String[] args) {

		SpringApplication.run(TestApplication.class, args);

		System.out.println("Hola mundo");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("public void run");
		usuarioService.insertUsuario(new Usuario("Ricardo", "Grimaldo Patiño", 22, true));
		usuarioService.insertUsuario(new Usuario("Joshua", "Meza Magaña", 22, true));
		usuarioService.insertUsuario(new Usuario("Jonathan", "Gomez Benitez", 22, true));
		usuarioService.insertUsuario(new Usuario("Rodrigo", "Urtecho Quintal", 22, true));
		usuarioService.insertUsuario(new Usuario("David", "Paredes Coob", 23, true));
		usuarioService.insertUsuario(new Usuario("Audny", "Correa Ceballos", 21, false));
		usuarioService.insertUsuario(new Usuario("Fernando", "Chan Dzib", 22, true));
		usuarioService.insertUsuario(new Usuario("Andres", "Fuentes Castillo", 24, true));
		usuarioService.insertUsuario(new Usuario("Carla", "Garcia Gimenez", 20, false));
		usuarioService.insertUsuario(new Usuario("Laura", "Torres Rodriguez", 24, false));

		materiaService.insertMateria(new Materia("Mantenimiento de Software", 8, "Licenciatura en Ingenieria de Software"));
		materiaService.insertMateria(new Materia("Construccion de Software", 5, "Licenciatura en Ingenieria de Software"));
		materiaService.insertMateria(new Materia("Analisis Matematico", 6, "Licenciatura en Matematicas"));
		materiaService.insertMateria(new Materia("Electricidad y Magnetismo", 4, "Licenciatura en Ingenieria en Computacion"));

		licenciaturaService.insertLicenciatura(new Licenciatura("Licenciatura en Actuaría", 9, "Facultad de Matematicas"));
		licenciaturaService.insertLicenciatura(new Licenciatura("Licenciatura en Ciencias de la Computación", 9, "Facultad de Matematicas"));
		licenciaturaService.insertLicenciatura(new Licenciatura("Licenciatura en Enseñanza de las Matemáticas", 8, "Facultad de Matematicas"));
		licenciaturaService.insertLicenciatura(new Licenciatura("Licenciatura en Ingeniería en Computación", 9, "Facultad de Matematicas"));
		licenciaturaService.insertLicenciatura(new Licenciatura("Licenciatura en Ingeniería de Software", 9, "Facultad de Matematicas"));
		licenciaturaService.insertLicenciatura(new Licenciatura("Licenciatura en Matemáticas", 8, "Facultad de Matematicas"));

		System.out.println("Usuarios insertados: " + usuarioService.getAllUsuarios());
		System.out.println("Materias insertadas: " + materiaService.getAllMaterias());
		System.out.println("Licenciaturas insertadas: " + licenciaturaService.getAllLicenciaturas());
	}
}
