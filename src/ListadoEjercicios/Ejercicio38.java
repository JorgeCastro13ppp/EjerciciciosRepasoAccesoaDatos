package ListadoEjercicios;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ejercicio38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mapa con orden de inserción con duplicados
		Map<Integer,AlumnoEjercicio29> listaAlumnos= new LinkedHashMap<>(); 
		
		// Crear alumnos (usamos la clase Alumno ya definida antes)
        AlumnoEjercicio29 a1 = new AlumnoEjercicio29(1, "Juan", "Pérez");
        AlumnoEjercicio29 a2 = new AlumnoEjercicio29(2, "María", "López");
        AlumnoEjercicio29 a3 = new AlumnoEjercicio29(3, "Luis", "Martínez");
        AlumnoEjercicio29 a4 = new AlumnoEjercicio29(4, "Ana", "Sánchez");
        AlumnoEjercicio29 a5 = new AlumnoEjercicio29(5, "Carlos", "García");
        
        listaAlumnos.put(a1.getExpediente(), a1);
        listaAlumnos.put(a2.getExpediente(), a2);
        listaAlumnos.put(a3.getExpediente(), a3);
        listaAlumnos.put(a4.getExpediente(), a4);
        listaAlumnos.put(a5.getExpediente(), a5);
        
        System.out.println("Listado de alumnos por orden de inserción");
        for(Map.Entry<Integer, AlumnoEjercicio29> entrada: listaAlumnos.entrySet()) {
        	System.out.println("Expediente: "+entrada.getKey()+" - "+ entrada.getValue().getNombre()+" "+entrada.getValue().getApellidos());
        }
	}

}
