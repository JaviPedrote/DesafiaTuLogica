package desafiaTuLogicaUd5;

import java.io.Serializable;

public class Persona implements Serializable{

	String nombre ;
	String apellido;
	int edad ;
	double altura ;
	
	public Persona(String nombre, String apellido, int edad, double altura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return   "--PERSONA--\nNombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nAltura: "+altura+"\n";
	}
	
	
}
