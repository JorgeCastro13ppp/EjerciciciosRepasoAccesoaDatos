package ListadoEjercicios;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio30 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> alumnos= new ArrayList<>();
		// Añadimos 5 nombres (con duplicados)
        alumnos.add("Ana");
        alumnos.add("Luis");
        alumnos.add("Ana");   // duplicado
        alumnos.add("María");
        alumnos.add("Luis");  // duplicado
        
        System.out.println("Lista de alumnos: ");
        
        for(String nombres:alumnos) {
        	System.out.println(nombres);
        }

	}

}
