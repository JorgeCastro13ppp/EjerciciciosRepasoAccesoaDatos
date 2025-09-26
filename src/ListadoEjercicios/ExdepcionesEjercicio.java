package ListadoEjercicios;
import java.util.*;

public class ExdepcionesEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Conversión inválida de String a int
		try {
			String invalido = "abc";
			int numero = Integer.parseInt(invalido); 
		}catch(NumberFormatException e) {
			System.out.println("Error: no se puede convertir el texto a número. -> "+e.getMessage());
		}
		
		//2.División por cero
		try {
			int resultado = 10/0;
			System.out.println("Resultado: "+resultado);
		}catch(ArithmeticException e) {
			System.out.println("Error, divisón por cero. -> "+e.getMessage());
		}
		
		//3.Operación sobre variable null
		try {
			String texto = null;
			int longitud = texto.length();
			System.out.println("Longitud: "+longitud);
		}catch(NullPointerException e) {
			System.out.println("Error, la variable es null. -> "+e.getMessage());
		}
		
		//4. Acceso a índice inválido en lista
		try {
			List<String> lista = new ArrayList<>();
			lista.add("A");
			String valor = lista.get(2);
			System.out.println("Valor: "+valor);
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Error, el índice está fuera de rango. -> "+e.getMessage());
		}
		
		//5. Modificación de colección durante iteración
		try {
			List<String>nombres = new ArrayList<>();
			nombres.add("Luis");
			nombres.add("Ana");
			
			for(String nombre: nombres) {
				if(nombre.equals("Luis"))
				nombres.remove(nombre);
			}
			
		}catch(ConcurrentModificationException e) {
			System.out.println("Error, no se puede modificar una listra mientras se recorre.");
		}
		
		System.out.println("Programa terminado correctamente.");
	
		
	}

}
