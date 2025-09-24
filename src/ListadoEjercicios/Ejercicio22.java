package ListadoEjercicios;

//Ejercicio 22. Crea un array con cinco números enteros y muestra después su contenido

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = {10, 20,30, 40, 50}; //Array de 5 números enteros
		
		//Usando un for 
		System.out.println("Usando un for clásico: ");
		for(int i = 0; i< numeros.length;i++) {
			System.out.println("Elemento en posición '"+i+"' :"+numeros[i]);
		}
		
		//Usando un for-each
		System.out.println("\n Usando un for-each:");         
		for(int num : numeros) {
			System.out.println(num);
		}
	}

}
