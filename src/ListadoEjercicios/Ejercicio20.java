package ListadoEjercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 20. Escribe un programa que permita al usuario adivinar un número
 *  entre 1 y 100. El programa debe guiar al usuario diciéndole si el número es mayor o menor que el que ingresó.
 */

public class Ejercicio20 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intento = -1;
        int contador = 0;

        System.out.println("He pensado un número entre 1 y 100. ¡Adivínalo!");

        do {
            System.out.print("Introduce tu número: ");

            try {
                intento = sc.nextInt();
                contador++;

                if (intento < numeroSecreto) {
                    System.out.println("El número secreto es MAYOR.");
                } else if (intento > numeroSecreto) {
                    System.out.println("El número secreto es MENOR.");
                } else {
                    System.out.println("¡Correcto! Has adivinado el número en " + contador + " intentos.");
                }

            } catch (InputMismatchException e) {
                System.out.println("⚠ Error: Debes introducir un número entero.");
                sc.nextLine(); // limpiar el buffer para evitar bucle infinito
            }

        } while (intento != numeroSecreto);

        sc.close();
    }
}