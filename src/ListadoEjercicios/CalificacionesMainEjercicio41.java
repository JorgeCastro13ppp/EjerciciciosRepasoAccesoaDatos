package ListadoEjercicios;

import java.util.Scanner;

public class CalificacionesMainEjercicio41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CalificacionesAlumnosEjercicio40 gestorMain = new CalificacionesAlumnosEjercicio40();
		
		int opcion;
		
		do {
			System.out.println("------------------------");
			System.out.println("Menú de operaciones:");
			System.out.println("1.Añadir alumno.");
			System.out.println("2.Añadir nota a alumno.");
			System.out.println("3.Calcular nota de alumno.");
			System.out.println("4.Borrar alumno.");
			System.out.println("5.Listar alumnos.");
			System.out.println("6.Salir.");
			System.out.println("Elige una opción:");
			
			while(!sc.hasNextInt()) {
				System.out.println("Introduce un número del 1-6.");
				System.out.println("Elige una opción:");
			}
			
			opcion = sc.nextInt();
			sc.nextLine(); //Limpiar el buffer
			
			switch(opcion) {
				case 1: //Añadir
					System.out.println("Introduce expediente del alumno a añadir:");
					int expAnadir = sc.nextInt();
					sc.nextLine();
					System.out.println("Introduce nombre:");
					String nombreAnadir = sc.nextLine();
					System.out.println("Introduce apellidos:");
					String apellidosAnadir = sc.nextLine();
					
					AlumnoEjercicio29 nuevoAlumno = new AlumnoEjercicio29(expAnadir,nombreAnadir,apellidosAnadir);
					gestorMain.anadirAlumno(nuevoAlumno);
					
				break;
				
				case 2: //Añadir nota a alumno
					System.out.println("Introduce expediente del alumno (nota):");
					int expNota = sc.nextInt();
					sc.nextLine();
					
					AlumnoEjercicio29 alumnoNota = gestorMain.buscarAlumno(expNota);
					if(alumnoNota!=null) {
						System.out.println("Introduce la nota:");
						String nota = sc.nextLine();
						double notaParseada = Double.parseDouble(nota.replace(",",".")); //
						
						alumnoNota.anadirNota(notaParseada);
						System.out.println("Nota añadida.");
					}else {
						System.out.println("Alumno no encontrado.");
					}					
					
				break;
				
				case 3: // Calcular nota media
					System.out.println("Introduce expediente del alumno a calcular :");
					int expNotaMedia = sc.nextInt();
					sc.nextLine();
					
					AlumnoEjercicio29 alumnoNotaMedia = gestorMain.buscarAlumno(expNotaMedia);
					
					if(alumnoNotaMedia!=null) {
						double notaMedia = alumnoNotaMedia.calcularNota();
						System.out.println("Nota media del alumno expediente: "+expNotaMedia+" = "+ notaMedia);
					}else {
						System.out.println("Alumno no encontrado.");
					}
					
					
				break;
				
				case 4: //Borrar alumno
					System.out.println("Introduce expediente del alumno a borrar");
					int expBorrar = sc.nextInt();
					sc.nextLine();
					
					gestorMain.borrarAlumno(expBorrar);
					break;
				
				case 5: //Listar alumno
					gestorMain.listarAlumnos();
				break;
				
				case 6: // Salir
					System.out.println("Saliendo...");
				break;
				
				default:
					System.out.println("Opción no válida, introduce un número del 1-6.");
				
			
			}
				
				
			
		}while(opcion!=6);
		
		sc.close(); //Cerramos el scanner
	}

}





















