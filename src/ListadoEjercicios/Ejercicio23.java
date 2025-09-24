package ListadoEjercicios;

// 23. Recorre un array de cinco objetos

public class Ejercicio23 {
	
	public static void main(String[] args) {
		
		// Crear un array de 5 Personas
        PersonaEjercicio25[] personas = new PersonaEjercicio25[5];

        // Inicializar el array con objetos Persona
        personas[0] = new PersonaEjercicio25("Ana", "García López", "12345678A", 30, "Soltera");
        personas[1] = new PersonaEjercicio25("Luis", "Martínez Pérez", "87654321B", 35, "Casado");
        personas[2] = new PersonaEjercicio25("María", "Sánchez Ruiz", "11223344C", 28, "Soltera");
        personas[3] = new PersonaEjercicio25("Carlos", "Fernández Gómez", "22334455D", 40, "Divorciado");
        personas[4] = new PersonaEjercicio25("Elena", "Díaz Torres", "33445566E", 22, "Soltera");
		
        //Recorrer el array con un for-each
        System.out.println("=== Recorriendo con for-each ===");
		for(PersonaEjercicio25 p:personas){
			System.out.println(p);
		}
		
		// Recorrer el array con un bucle for clásico
        System.out.println("=== Recorriendo con for ===");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona " + (i + 1) + ": " + personas[i]);
        }
	}

}
