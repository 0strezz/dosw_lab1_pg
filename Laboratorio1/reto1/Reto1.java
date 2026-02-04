import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Estudiante{
	private String nombre;
	private int edad;
	private int semestre;
	private String correo;

	public Estudiante(String nombre, int edad, int semestre, String correo) {
		this.nombre = nombre;
		this.edad = edad;
		this.semestre = semestre;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getSemestre() {
		return semestre;
	}

	public String getCorreo() {
		return correo;
	}
}

public class Reto1 {
	public static void main(String[] args){
		Estudiante estudiante1 = new Estudiante("Juan Diego", 20, 6, "juan.patino-m@mail.escuelaing.edu.co");
		Estudiante estudiante2 = new Estudiante("Gina Sofia", 20, 6, "gina.garcia-z@mail.esucleaing.edu.co");

		List<Estudiante> estudiantes = new ArrayList<>();
		estudiantes.add(estudiante1);
		estudiantes.add(estudiante2);

		String mensaje = "¡Hola, bienvenidos! Nosotros somos el trio conformado por\n" +
			estudiantes.stream()
			.map(s -> String.format(
					"%s, estudiante de la escuela, %d semestre, %d años, %s, \r\n",
					s.getNombre(),
					s.getSemestre(),
					s.getEdad(),
					s.getCorreo()
			)).collect(Collectors.joining()) + " Nuestros correos\n" + estudiantes.stream() .map(Estudiante::getCorreo) .collect(Collectors.joining(" y \n")) + ".\n";
		System.out.println(mensaje);
	}
}
