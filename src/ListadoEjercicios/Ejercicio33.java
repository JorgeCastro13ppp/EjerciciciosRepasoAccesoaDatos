package ListadoEjercicios;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> grupos=new TreeSet<>();
		
		// Añadimos 5 grupos
        grupos.add("1ESOA");
        grupos.add("4ESOC");
        grupos.add("2DAM");
        grupos.add("1FPB");
        grupos.add("2BACHB");
        grupos.add("2DAM"); // duplicado, no se añade
        
        for(String curso:grupos) {
        	System.out.println(curso);
        }
	}

}
