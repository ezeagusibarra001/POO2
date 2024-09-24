package model;

/**
 * 
 * Esta clase modela una persona, la cual sabe responder su nombre. Las personas
 * tambien tienen perros, de los cuales solo se quiere conocer la cantidad.
 * 
 * @author ezeag
 * 
 */
public class Persona {

	private String nombre;
	private int cantidadDePerros;

	public Persona(String nombre) {
		this.nombre = nombre;
		this.cantidadDePerros = 0;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getCantidadDePerros() {
		return this.cantidadDePerros;
	}

	public void sumarPerros(int cantidadDePerros) {
		this.cantidadDePerros += cantidadDePerros;
	}

}
