package ListadoEjercicios;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Map<Integer,AlumnoEjercicio29> listaAlumnosModificar= new LinkedHashMap<>(); 
		
        
        int opcion;
        
        do {
        	
        	// Menú
            System.out.println("\n=== MENÚ DE OPERACIONES ===");
            System.out.println("1. Añadir elemento");
            System.out.println("2. Buscar elemento");
            System.out.println("3. Borrar elemento");
            System.out.println("4. Listar");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            
            while(!sc.hasNextInt()) {
            	System.out.println("Error introduce un número del 1-5");
            	sc.next(); //Limpiar entrada
            	System.out.println("Vuelve a elegir una opción:");
            }
            
            opcion=sc.nextInt();
            sc.nextLine(); //Limpiamos el buffer
            
            switch(opcion) {
            	case 1: //añadir
            		System.out.println("Introduce expediente:");
            		int exp = sc.nextInt();
            		sc.nextLine();
            		if(listaAlumnosModificar.containsKey(exp)) {
            			System.out.println("Ya existe un alumno con ese expediente.");
            			break;
            		}
            		
            		System.out.println("Introduce nombre:");
            		String nombre = sc.nextLine();
            		System.out.println("Introduce apellido:");
            		String apellidos = sc.nextLine();
            		
            		AlumnoEjercicio29 nuevo = new AlumnoEjercicio29(exp,nombre,apellidos);
            		
            		listaAlumnosModificar.put(exp, nuevo);
            		
            		System.out.println("Alumno añadido correctamente");
            	break;
            	
            	case 2: //buscar
            		System.out.println("Introduce expediente a buscar:");
            		int expBuscar = sc.nextInt();
            		sc.nextLine();
            		
            		AlumnoEjercicio29 encontrado = listaAlumnosModificar.get(expBuscar);
            		
            		if(encontrado!=null) {
            			System.out.println("Alumno encontrado: "+encontrado.getNombre()+" "+encontrado.getApellidos());
            		}else {
            			System.out.println("No existe un alumno con ese expediente");
            		}
            		
            	break;
            	
            	case 3: //borrar
            		System.out.println("Introduce expediente a borrar:");
            		int expBorrar = sc.nextInt();
            		sc.nextLine();
            		
            		if(listaAlumnosModificar.remove(expBorrar)!=null) {
            			System.out.println("Alumno borrado correctamente.");
            		}else {
            			System.out.println("No existe un alumno con ese expediente.");
            		}
            		
            	break;
            	
            	case 4: //listar
            		if(listaAlumnosModificar.isEmpty()) {
            			System.out.println("No hay alumnos.");
            		}else {
            			System.out.println("Lista de alumnos");
            			for(Map.Entry<Integer, AlumnoEjercicio29> entrada: listaAlumnosModificar.entrySet()) {
            				System.out.println("Expediente: "+entrada.getKey()+" - "+entrada.getValue().getNombre()+ " "+entrada.getValue().getApellidos());
            			}
            		}
            	break;
            	
            	case 5: //salir
            		System.out.println("Saliendo...");
            	break;
            	
            	default:
            		System.out.println("Opción no válida, introduce de nuevo.");	
            
            }
        	
        }while(opcion!=5);
        
        sc.close();
	}

}


























