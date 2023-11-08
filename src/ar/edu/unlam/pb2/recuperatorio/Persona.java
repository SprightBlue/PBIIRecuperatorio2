package ar.edu.unlam.pb2.recuperatorio;

public class Persona {

	private String nombre;
	private Integer dni;
	private Integer edad;
	
	public Persona(String nombre, Integer dni, Integer edad) {
		this.setNombre(nombre);
		this.setDni(dni);
		this.setEdad(edad);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	private void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getEdad() {
		return edad;
	}

	private void setEdad(Integer edad) {
		this.edad = edad;
	}

}
