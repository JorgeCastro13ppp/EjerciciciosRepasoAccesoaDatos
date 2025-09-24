package ListadoEjercicios;

public class VehiculoEjercicio27 {
	// Atributos
    private String matricula;
    private String marca;
    private double precioCompra;

    // Constructor vacío
    public VehiculoEjercicio27() {
    }

    // Constructor con todos los atributos
    public VehiculoEjercicio27(String matricula, String marca, double precioCompra) {
        this.matricula = matricula;
        this.marca = marca;
        this.precioCompra = precioCompra;
    }

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    // Método propio: calcular PVP
    public double pvp(int beneficio) {
        if (beneficio < 0 || beneficio > 100) {
            throw new IllegalArgumentException("El beneficio debe estar entre 0 y 100.");
        }
        return precioCompra + ((precioCompra * beneficio) / 100.0);
    }

    // toString
    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", precioCompra=" + precioCompra +
                '}';
    }
}
