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

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TestApplication implements CommandLineRunner  {

	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private LicenciaturaService licenciaturaService;
	@Autowired
	private MateriaService materiaService;

	public static void main(String[] args) {

		SpringApplication.run(TestApplication.class, args);

		System.out.println("Hola mundo");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("public void run");
		List<Materia> materias = new ArrayList<>();

		Usuario usuario1 = new Usuario("Ricardo", "Grimaldo Patiño", 22, true);

		Materia materia1 = new Materia("Mantenimiento de Software", 8, "Licenciatura en Ingenieria de Software");
		Materia materia2 = new Materia("Sistemas Distribuidos", 8, "Licenciatura en Ingenieria de Software");
		Materia materia3 = new Materia("Administracion de proyectos I", 8, "Licenciatura en Ingenieria de Software");
		Materia materia4 = new Materia("Inteligencia Artificial", 8, "Licenciatura en Ingenieria de Software");

		materia1.setUsuario(usuario1);
		materia2.setUsuario(usuario1);
		materia3.setUsuario(usuario1);
		materia4.setUsuario(usuario1);

		materias.add(materia1);
		materias.add(materia2);
		materias.add(materia3);
		materias.add(materia4);

		usuario1.setMaterias(materias);

		usuarioService.insertUsuario(usuario1);

		materiaService.insertMateria(materia1);
		materiaService.insertMateria(materia2);
		materiaService.insertMateria(materia3);
		materiaService.insertMateria(materia4);

		materias.clear();

		System.out.println(usuario1.toString());
		usuario1.showMateriasNames();

		Usuario usuario2 = new Usuario("Joshua", "Meza Magaña", 22, true);

		materia1 = new Materia("Experimentacion en Ingenieria de Software", 7, "Licenciatura en Ingenieria de Software");
		materia2 = new Materia("Verificacion y Validacion de Software", 7, "Licenciatura en Ingenieria de Software");
		materia3 = new Materia("Redes y Seguridad de Computadoras", 7, "Licenciatura en Ingenieria de Software");
		materia4 = new Materia("Innovacion Tecnologica", 7, "Licenciatura en Ingenieria de Software");

		materia1.setUsuario(usuario2);
		materia2.setUsuario(usuario2);
		materia3.setUsuario(usuario2);
		materia4.setUsuario(usuario2);

		materias.add(materia1);
		materias.add(materia2);
		materias.add(materia3);
		materias.add(materia4);

		usuario2.setMaterias(materias);

		usuarioService.insertUsuario(usuario2);
		materiaService.insertMateria(materia1);
		materiaService.insertMateria(materia2);
		materiaService.insertMateria(materia3);
		materiaService.insertMateria(materia4);

		System.out.println(usuario2.toString());
		usuario2.showMateriasNames();
		materias.clear();

		Usuario usuario3 = new Usuario("Jonathan", "Gomez Benitez", 22, true);

		materia1 = new Materia("Metricas de Software", 6, "Licenciatura en Ingenieria de Software");
		materia2 = new Materia("Aseguramiento de la Calidad de Software", 6, "Licenciatura en Ingenieria de Software");
		materia3 = new Materia("Requisitos de Software", 6, "Licenciatura en Ingenieria de Software");
		materia4 = new Materia("Interaccion Humano-Computadora", 6, "Licenciatura en Ingenieria de Software");

		materia1.setUsuario(usuario3);
		materia2.setUsuario(usuario3);
		materia3.setUsuario(usuario3);
		materia4.setUsuario(usuario3);

		materias.add(materia1);
		materias.add(materia2);
		materias.add(materia3);
		materias.add(materia4);

		usuario3.setMaterias(materias);

		usuarioService.insertUsuario(usuario3);
		materiaService.insertMateria(materia1);
		materiaService.insertMateria(materia2);
		materiaService.insertMateria(materia3);
		materiaService.insertMateria(materia4);

		System.out.println(usuario3.toString());
		usuario3.showMateriasNames();
		materias.clear();

		Usuario usuario4 = new Usuario("Rodrigo", "Marin Garcia", 19, true);

		materia1 = new Materia("Calculo Vectorial", 4, "Licenciatura en Ingenieria en Computacion");
		materia2 = new Materia("Probabilidad", 4, "Licenciatura en Ingenieria en Computacion");
		materia3 = new Materia("Electricidad y Magnetismo", 4, "Licenciatura en Ingenieria en Computacion");
		materia4 = new Materia("Software a pequeña escala", 4, "Licenciatura en Ingenieria en Computacion");

		materia1.setUsuario(usuario4);
		materia2.setUsuario(usuario4);
		materia3.setUsuario(usuario4);
		materia4.setUsuario(usuario4);

		materias.add(materia1);
		materias.add(materia2);
		materias.add(materia3);
		materias.add(materia4);

		usuario4.setMaterias(materias);

		usuarioService.insertUsuario(usuario4);
		materiaService.insertMateria(materia1);
		materiaService.insertMateria(materia2);
		materiaService.insertMateria(materia3);
		materiaService.insertMateria(materia4);

		System.out.println(usuario4.toString());
		usuario4.showMateriasNames();
		materias.clear();

		Usuario usuario5 = new Usuario("David", "Perez Diaz", 19, true);

		materia1 = new Materia("Calculo Diferencial", 2, "Licenciatura en Ingenieria en Computacion");
		materia2 = new Materia("Algebra lineal", 2, "Licenciatura en Ingenieria en Computacion");
		materia3 = new Materia("Matematicas Discretas", 2, "Licenciatura en Ingenieria en Computacion");
		materia4 = new Materia("Programacion", 2, "Licenciatura en Ingenieria en Computacion");

		materia1.setUsuario(usuario5);
		materia2.setUsuario(usuario5);
		materia3.setUsuario(usuario5);
		materia4.setUsuario(usuario5);

		materias.add(materia1);
		materias.add(materia2);
		materias.add(materia3);
		materias.add(materia4);

		usuario5.setMaterias(materias);

		usuarioService.insertUsuario(usuario5);
		materiaService.insertMateria(materia1);
		materiaService.insertMateria(materia2);
		materiaService.insertMateria(materia3);
		materiaService.insertMateria(materia4);

		System.out.println(usuario5.toString());
		usuario5.showMateriasNames();
		materias.clear();

		Usuario usuario6 = new Usuario("Maria", "Campos Gutierrez", 21, false);

		materia1 = new Materia("Herramientas Computacionales", 6, "Licenciatura en Actuaría");
		materia2 = new Materia("Introduccion a la Seguridad social", 6, "Licenciatura en Actuaría");
		materia3 = new Materia("Metodos Numericos", 6, "Licenciatura en Actuaría");
		materia4 = new Materia("Demografía", 6, "Licenciatura en Actuaría");

		materia1.setUsuario(usuario6);
		materia2.setUsuario(usuario6);
		materia3.setUsuario(usuario6);
		materia4.setUsuario(usuario6);

		materias.add(materia1);
		materias.add(materia2);
		materias.add(materia3);
		materias.add(materia4);

		usuario6.setMaterias(materias);

		usuarioService.insertUsuario(usuario6);
		materiaService.insertMateria(materia1);
		materiaService.insertMateria(materia2);
		materiaService.insertMateria(materia3);
		materiaService.insertMateria(materia4);

		System.out.println(usuario6.toString());
		usuario6.showMateriasNames();
		materias.clear();

		Usuario usuario7 = new Usuario("Fernando", "Chan Tsuyub", 18, true);

		materia1 = new Materia("Algebra Lineal", 3, "Licenciatura en Enseñanza de las Matematicas");
		materia2 = new Materia("Calculo Diferencial", 3, "Licenciatura de las Enseñanza en Matematicas");
		materia3 = new Materia("Informatica Educativa", 3, "Licenciatura de las Enseñanza en Matematicas");
		materia4 = new Materia("Paradigmas educativos", 3, "Licenciatura de las Enseñanza en Matematicas");

		materia1.setUsuario(usuario7);
		materia2.setUsuario(usuario7);
		materia3.setUsuario(usuario7);
		materia4.setUsuario(usuario7);

		materias.add(materia1);
		materias.add(materia2);
		materias.add(materia3);
		materias.add(materia4);

		usuario7.setMaterias(materias);

		usuarioService.insertUsuario(usuario7);
		materiaService.insertMateria(materia1);
		materiaService.insertMateria(materia2);
		materiaService.insertMateria(materia3);
		materiaService.insertMateria(materia4);

		System.out.println(usuario7.toString());
		usuario7.showMateriasNames();
		materias.clear();

		Usuario usuario8 = new Usuario("Andres", "Fuentes Castillo", 24, true);

		materia1 = new Materia("Algebra Abstracta II", 7, "Licenciatura en Matematicas");
		materia2 = new Materia("Teoria de la Medida e Integracion", 7, "Licenciatura en Matematicas");
		materia3 = new Materia("Variable Compleja", 7, "Licenciatura en Matematicas");
		materia4 = new Materia("Servicio Social", 7, "Licenciatura en Matematicas");

		materia1.setUsuario(usuario8);
		materia2.setUsuario(usuario8);
		materia3.setUsuario(usuario8);
		materia4.setUsuario(usuario8);

		materias.add(materia1);
		materias.add(materia2);
		materias.add(materia3);
		materias.add(materia4);

		usuario8.setMaterias(materias);

		usuarioService.insertUsuario(usuario8);
		materiaService.insertMateria(materia1);
		materiaService.insertMateria(materia2);
		materiaService.insertMateria(materia3);
		materiaService.insertMateria(materia4);

		System.out.println(usuario8.toString());
		usuario8.showMateriasNames();
		materias.clear();

		Usuario usuario9 = new Usuario("Carla", "Garcia Gimenez", 20, false);

		materia1 = new Materia("Algebra Lineal II", 5, "Licenciatura en Matematicas");
		materia2 = new Materia("Calculo Avanzado", 5, "Licenciatura en Matematicas");
		materia3 = new Materia("Inferencia Estadistica", 5, "Licenciatura en Matematicas");
		materia4 = new Materia("Ecuaciones Diferenciales Ordinarias", 5, "Licenciatura en Matematicas");

		materia1.setUsuario(usuario9);
		materia2.setUsuario(usuario9);
		materia3.setUsuario(usuario9);
		materia4.setUsuario(usuario9);

		materias.add(materia1);
		materias.add(materia2);
		materias.add(materia3);
		materias.add(materia4);

		usuario9.setMaterias(materias);

		usuarioService.insertUsuario(usuario9);
		materiaService.insertMateria(materia1);
		materiaService.insertMateria(materia2);
		materiaService.insertMateria(materia3);
		materiaService.insertMateria(materia4);

		System.out.println(usuario9.toString());
		usuario9.showMateriasNames();
		materias.clear();

		Usuario usuario10 = new Usuario("Laura", "Torres Rodriguez", 24, false);

		materia1 = new Materia("Metodologia de la Investigacion", 7, "Licenciatura en Ciencias de la Computación");
		materia2 = new Materia("Metodos Numericos", 7, "Licenciatura en Ciencias de la Computación");
		materia3 = new Materia("Desarrollo y Mantenimiento de Software", 7, "Licenciatura en Ciencias de la Computación");
		materia4 = new Materia("Redes de Computadoras", 7, "Licenciatura en Ciencias de la Computación");

		materia1.setUsuario(usuario10);
		materia2.setUsuario(usuario10);
		materia3.setUsuario(usuario10);
		materia4.setUsuario(usuario10);

		materias.add(materia1);
		materias.add(materia2);
		materias.add(materia3);
		materias.add(materia4);

		usuario10.setMaterias(materias);

		usuarioService.insertUsuario(usuario10);
		materiaService.insertMateria(materia1);
		materiaService.insertMateria(materia2);
		materiaService.insertMateria(materia3);
		materiaService.insertMateria(materia4);

		System.out.println(usuario10.toString());
		usuario10.showMateriasNames();
		materias.clear();

		licenciaturaService.insertLicenciatura(new Licenciatura("Licenciatura en Actuaría", 9, "Facultad de Matematicas"));
		licenciaturaService.insertLicenciatura(new Licenciatura("Licenciatura en Ciencias de la Computación", 9, "Facultad de Matematicas"));
		licenciaturaService.insertLicenciatura(new Licenciatura("Licenciatura en Enseñanza de las Matemáticas", 8, "Facultad de Matematicas"));
		licenciaturaService.insertLicenciatura(new Licenciatura("Licenciatura en Ingeniería en Computación", 9, "Facultad de Matematicas"));
		licenciaturaService.insertLicenciatura(new Licenciatura("Licenciatura en Ingeniería de Software", 9, "Facultad de Matematicas"));
		licenciaturaService.insertLicenciatura(new Licenciatura("Licenciatura en Matemáticas", 8, "Facultad de Matematicas"));

		System.out.println("Licenciaturas insertadas: " + licenciaturaService.getAllLicenciaturas());
	}
}
