package ListadoEjercicios;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>niveles=new LinkedHashSet<>();
		
		niveles.add("ESO");
		niveles.add("GM-SMR");
		niveles.add("GS-DAM");
		niveles.add("GS-ASIR");
		niveles.add("BACH");
		
		for(String curso:niveles) {
			System.out.println(curso);
		}
	}

}
