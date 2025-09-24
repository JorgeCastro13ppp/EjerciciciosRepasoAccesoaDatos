package ListadoEjercicios;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> claveProfesor = new TreeMap<>();
        
     // Añadimos cinco pares clave-profesor
        claveProfesor.put("IFC02", "Juan Pérez");
        claveProfesor.put("FOL01", "María López");//
        claveProfesor.put("IFC08", "Carlos Ruiz");//
        claveProfesor.put("ING06", "Ana Torres");//
        claveProfesor.put("FPIFC01", "Laura Gómez");

        // Intentamos meter duplicado en la clave "IFC02"
        claveProfesor.put("IFC02", "Profesor Duplicado"); 
        // Sobrescribe al profesor anterior en esa clave

        int opcion;
        do {
        	 // Menú
            System.out.println("\n=== MENÚ DE OPERACIONES ===");
            System.out.println("1. Añadir elemento");
            System.out.println("2. Borrar elemento");
            System.out.println("3. Listar");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            while(sc.hasNextInt()) {
            	System.out.println("Error, introduce un número del 1-4.");
            	sc.next(); //Limpiamos la entrada
            	System.out.println("Elige una opción: ");
            }
            opcion=sc.nextInt();
            sc.nextLine(); //Limpiamos el buffer
            
            switch(opcion){
            	case 1: //Añadir
            		System.out.println("Introduce la clave:");
            		String clave = sc.nextLine().toUpperCase();
            		System.out.println("Introduce el profesor:");
            		String profesor = sc.nextLine();
            		
            		claveProfesor.put(clave, profesor);
            		System.out.println("Elemento añadido con éxito.");
            		break;
            		
            	case 2: //Borrar
            		System.out.println("Introduce una clave a borrar");
            		String claveBorrar = sc.nextLine().toUpperCase();
            		if(claveProfesor.remove(claveBorrar)!=null) {
            			System.out.println("Elemento borrado con éxito.");
            		}else {
            			System.out.println("La clave introducida no existe.");
            		}
            		break;
            	
            	case 3: //Listar
            		System.out.println("Lista:");
            		for(Map.Entry<String, String> entrada: claveProfesor.entrySet()) {
            			System.out.println(entrada.getKey()+" - "+entrada.getValue());
            		}
            	
            	case 4: //Salir
            		System.out.println("Saliendo...");
            		break;
            		
            	default:
            		System.out.println("Opción no válida, introduce de nuevo.");
            		
            }
        	
        }while(opcion!=4);
        sc.close();
    }
}

