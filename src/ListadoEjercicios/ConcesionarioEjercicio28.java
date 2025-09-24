package ListadoEjercicios;

public class ConcesionarioEjercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehiculoEjercicio27 c1 = new VehiculoEjercicio27("8011FFL","BMW",10000);
		
		VehiculoEjercicio27 m1 = new VehiculoEjercicio27();
		
		m1.setMatricula("1444FFL");
		m1.setMarca("Yamaha");
		m1.setPrecioCompra(1000);
		
		// Mostrar los datos de coche1 usando getters
        System.out.println("=== Datos del coche 1 ===");
        System.out.println("Matrícula: " + c1.getMatricula());
        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Precio de compra: " + c1.getPrecioCompra());

        // Mostrar los datos de moto1 usando toString
        System.out.println("\n=== Datos de la moto 1 ===");
        System.out.println(m1.toString());
        
        //Calcular pvp con beneficio
        
        int beneficioC1=30;
        int beneficioM1=5;
        
       System.out.println("Datos del beneficio coche 1:");
       System.out.println(c1.pvp(beneficioC1));
       
       System.out.println("Datos del beneficio moto 1:");
       System.out.println(m1.pvp(beneficioM1));

	}

}
