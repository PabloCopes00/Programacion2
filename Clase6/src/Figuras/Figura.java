package Figuras;

public abstract class Figura {
	private String nombre;

	public Figura(String nombre) {
		this.nombre = nombre;
	}

// metodo abstracto de esta forma, no lo implementamos.
	public abstract double getArea();
	public abstract double getPerimetro();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
