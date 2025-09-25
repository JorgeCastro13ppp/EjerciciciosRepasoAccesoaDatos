package ListadoEjercicios;

public class MainEjercicio40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalificacionesAlumnosEjercicio40 gestor = new CalificacionesAlumnosEjercicio40();
		
		    //Crear algunos alumnos
	        AlumnoEjercicio29 a1 = new AlumnoEjercicio29(1, "Juan", "Pérez");
	        AlumnoEjercicio29 a2 = new AlumnoEjercicio29(2, "María", "López");
	        AlumnoEjercicio29 a3 = new AlumnoEjercicio29(3, "Ana", "Martínez");

	        // Añadir
	        gestor.anadirAlumno(a1);
	        gestor.anadirAlumno(a2);
	        gestor.anadirAlumno(a3);

	        // Intentar añadir duplicado
	        gestor.anadirAlumno(new AlumnoEjercicio29(2, "Otro", "Alumno"));
	        
	        // Buscar
	        System.out.println("🔎 Buscar expediente 2:");
	        System.out.println(gestor.buscarAlumno(2));

	        // Listar
	        gestor.listarAlumnos();

	        // Borrar
	        gestor.borrarAlumno(3);
	        gestor.borrarAlumno(99); // inexistente

	        // Listar otra vez
	        gestor.listarAlumnos();
	}

}
