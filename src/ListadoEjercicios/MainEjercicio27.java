package ListadoEjercicios;

public class MainEjercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehiculoEjercicio27 v1 = new VehiculoEjercicio27("1234ABC", "Toyota", 15000);

        System.out.println(v1);
        System.out.println("PVP con 20% de beneficio: " + v1.pvp(20));
	}

}
