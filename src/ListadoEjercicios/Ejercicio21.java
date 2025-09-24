package ListadoEjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String respuesta;

        do {
            int numero = 0;
            boolean numeroValido = false;

            // Bucle para asegurar que el usuario introduce un número correcto
            while (!numeroValido) {
                try {
                    System.out.print("Introduce un número para ver su tabla de multiplicar: ");
                    numero = sc.nextInt();
                    numeroValido = true; // si llega aquí, el número es válido
                } catch (InputMismatchException e) {
                    System.out.println("⚠ Error: Debes introducir un número entero.");
                    sc.nextLine(); // limpiar buffer y volver a pedir número
                }
            }

            // Mostrar tabla de multiplicar
            System.out.println("Tabla del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

            // Preguntar si quiere continuar (sí/no) con validación
            do {
                System.out.print("¿Quieres calcular otra tabla? (sí/no): ");
                respuesta = sc.next().toLowerCase();
                respuesta = respuesta.replace("í", "i"); // manejar tilde

                if (!respuesta.equals("si") && !respuesta.equals("no")) {
                    System.out.println("⚠ Respuesta no válida. Escribe 'sí' o 'no'.");
                }
            } while (!respuesta.equals("si") && !respuesta.equals("no"));

        } while (respuesta.equals("si"));

        System.out.println("Programa terminado. ¡Hasta pronto!");
        sc.close();
    }
   }
    


