package ListadoEjercicios;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio34 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String>claveProfesor = new TreeMap<>();
		// Añadimos cinco pares clave-profesor
        claveProfesor.put("IFC02", "Juan Pérez");
        claveProfesor.put("FOL01", "María López");
        claveProfesor.put("IFC08", "Carlos Ruiz");
        claveProfesor.put("ING06", "Ana Torres");
        claveProfesor.put("FPIFC01", "Laura Gómez");

        // Intentamos meter duplicado en la clave "IFC02"
        claveProfesor.put("IFC02", "Profesor Duplicado"); 
        // Sobrescribe al profesor anterior en esa clave
        
        for(Map.Entry<String, String>entrada: claveProfesor.entrySet()) {
        	System.out.println(entrada.getKey()+" - "+entrada.getValue());
        }
	}

}
