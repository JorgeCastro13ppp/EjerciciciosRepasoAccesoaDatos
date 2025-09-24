package ListadoEjercicios;

import java.util.ArrayList;

public class AlumnoEjercicio29 {
	//ffff
	private int expediente;
	private String nombre;
	private String apellidos;
	
	
	//Con array simple
	// private double[] notas;  array de notas
    // private int numNotas;    contador de notas realmente guardadas
	
	private ArrayList<Double>notas;
	
	public AlumnoEjercicio29() {
		this.notas = new ArrayList<>();
		// this.notas = new double[100];  máximo 100 notas
        // this.numNotas = 0;
	}
	
	public AlumnoEjercicio29(int expediente, String nombre, String apellidos) {
		this.expediente = expediente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.notas = new ArrayList<>();
        
        // this.notas = new double[100];  máximo 100 notas
        // this.numNotas = 0;
	}
	
	public int getExpediente() {
		return expediente;
	}

	public void setExpediente(int expediente) {
		this.expediente = expediente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public ArrayList<Double> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}
	
	// Método para añadir nota
    public void anadirNota(double nota) {
        this.notas.add(nota);
    }

    // Método para calcular la nota media
    public double calcularNota() {
        if (notas.isEmpty()) {
            return 0.0; // si no hay notas, devolvemos 0
        }
        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        return suma / notas.size();
    }

    // toString
    @Override
    public String toString() {
        return "Alumno{" +
                "expediente='" + expediente + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", notas=" + notas +
                '}';
    }
    
/*
 * public double[] getNotas() {
        // devolvemos solo las notas usadas
        double[] usadas = new double[numNotas];
        for (int i = 0; i < numNotas; i++) {
            usadas[i] = notas[i];
        }
        return usadas;
    }

    public int getNumNotas() {
        return numNotas;
    }

    // Método para añadir nota
    public void anadirNota(double nota) {
        if (numNotas < notas.length) {
            notas[numNotas] = nota;
            numNotas++;
        } else {
            System.out.println("No se pueden añadir más notas (límite alcanzado).");
        }
    }

    // Método para calcular la nota media
    public double calcularNota() {
        if (numNotas == 0) {
            return 0.0; // si no hay notas, devolvemos 0
        }
        double suma = 0;
        for (int i = 0; i < numNotas; i++) {
            suma += notas[i];
        }
        return suma / numNotas;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alumno{expediente='").append(expediente)
          .append("', nombre='").append(nombre)
          .append("', apellidos='").append(apellidos)
          .append("', notas=[");
        for (int i = 0; i < numNotas; i++) {
            sb.append(notas[i]);
            if (i < numNotas - 1) sb.append(", ");
        }
        sb.append("]}");
        return sb.toString();
    }
 */
	
}
