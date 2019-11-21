package Laboral;

public class Persona {
	
	public String nombre;
	public String dni;
	public char sexo;
	

	public Persona(String nombre, String dni, char sexo) {
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
	}

	
	public Persona(String nombre, char sexo) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
	}
	

	public void setDni(String dni) {
		this.dni = dni;
	}
	

	public String imprime() {
		return "nombre:" + nombre + ", dni:" + dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public String getDni() {
		return dni;
	}
	
	

}
