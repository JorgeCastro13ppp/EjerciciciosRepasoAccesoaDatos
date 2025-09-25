package ListadoEjercicios;

import java.util.HashMap;
import java.util.Map;

public class CalificacionesAlumnosEjercicio40 {

	private Map<Integer,AlumnoEjercicio29> listaAlumnosCalificaciones ;
	
	public CalificacionesAlumnosEjercicio40() {
		listaAlumnosCalificaciones = new HashMap<>();
	}
	
	//Añadir un alumno
	
	public void anadirAlumno(AlumnoEjercicio29 alumnoCalificaciones) {
		if(listaAlumnosCalificaciones.containsKey(alumnoCalificaciones.getExpediente())) {
			System.out.println("Ya existe un alumno con expediente: "+alumnoCalificaciones.getExpediente());
		}else {
			listaAlumnosCalificaciones.put(alumnoCalificaciones.getExpediente(), alumnoCalificaciones);
			System.out.println("Alumno añadido con éxito. -> "+alumnoCalificaciones);
		}
	}
	
	//Buscar alumno por expediente
	
	public AlumnoEjercicio29 buscarAlumno(int exp) {
		return listaAlumnosCalificaciones.get(exp); //null si no existe
	}
	
	//Borrar alumno
	
	public void borrarAlumno(int exp ) {
		if(listaAlumnosCalificaciones.remove(exp)!=null) {
			System.out.println("Alumno con expediente: "+exp+" borrado.");
		}else {
			System.out.println("No existe un alumno con ese expediente.");
			
		}
	}
	//Listar todos los alumnos
	
	public void listarAlumnos() {
		if(listaAlumnosCalificaciones.isEmpty()) {
			System.out.println("No existen alumnos.");
		}else {
			System.out.println("Lista de alumnos");
			for(AlumnoEjercicio29 alumno: listaAlumnosCalificaciones.values()) {
				System.out.println(alumno);
			}
		}
	}

}























