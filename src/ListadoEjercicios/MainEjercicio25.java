package ListadoEjercicios;

public class MainEjercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear dos personas
        PersonaEjercicio25 persona1 = new PersonaEjercicio25("Ana", "García López", "12345678A", 30, "Soltera");
        PersonaEjercicio25 persona2 = new PersonaEjercicio25("Luis", "Martínez Pérez", "87654321B", 35, "Casado");

        // Mostrar las personas
        System.out.println("Persona 1: " + persona1);
        System.out.println("Persona 2: " + persona2);

        // Comparar edades
        if (persona1.getEdad() > persona2.getEdad()) {
            System.out.println("\nLa persona mayor es: " + persona1.getNombre() + " " + persona1.getApellidos());
        } else if (persona2.getEdad() > persona1.getEdad()) {
            System.out.println("\nLa persona mayor es: " + persona2.getNombre() + " " + persona2.getApellidos());
        } else {
            System.out.println("\nAmbas personas tienen la misma edad.");
        }
	}

}