package ListadoEjercicios;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio31 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> profesores= new ArrayList<>();
		// Añadimos 5 nombres (con duplicados)
        profesores.add("Soraya");
        profesores.add("Luis");
        profesores.add("Ramón");  
        profesores.add("Alberto");
        profesores.add("Candeleda");  
        
        System.out.println("Lista de profesores: ");
        
        for(String nombres:profesores) {
        	System.out.println(nombres);
        }

	}

}
