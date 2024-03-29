package Laboral;

public class Empleado extends Persona {
	
	
	private int categoria = 1;
	public int anyos = 0;
	

	public Empleado(String nombre, String dni, char sexo, int categoria, int anyos) throws DatosNoCorrectoException {
		super(nombre, dni, sexo);
		setCategoria(categoria);
		if (anyos > -1) {
			this.anyos = anyos;
		}else {
			throw new DatosNoCorrectoException("Datos no correctos");
		}
	}
	

	public Empleado(String nombre, String dni, char sexo) {
		super(nombre, dni, sexo);
	}

	public void setCategoria(int categoria) throws DatosNoCorrectoException {
		if (categoria > 0 && categoria <=10) {
			this.categoria = categoria;
		} else {
			throw new DatosNoCorrectoException("Datos no correctos");
		}
	}
	
	public int getCategoria() {
		return categoria;
	}

	
	public void incAnyo() {
		anyos++;
	}

 	@Override
	public String imprime() {
		return nombre + " "+ dni + " " + categoria + " " + anyos;
	}
 	
 	public int getAnyos() {
		return anyos;
	}

}
