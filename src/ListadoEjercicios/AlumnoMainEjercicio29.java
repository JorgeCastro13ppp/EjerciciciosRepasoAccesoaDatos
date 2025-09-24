package ListadoEjercicios;

public class AlumnoMainEjercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlumnoEjercicio29 alumno1 = new AlumnoEjercicio29(12345678, "Ana", "García López");

        alumno1.anadirNota(8.5);
        alumno1.anadirNota(7.0);
        alumno1.anadirNota(9.2);
        alumno1.anadirNota(10);
        //fffff
        System.out.println(alumno1);
        System.out.println("Nota media: " + alumno1.calcularNota());
	}

}
