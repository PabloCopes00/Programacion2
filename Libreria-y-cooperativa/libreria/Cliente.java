package libreria;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private int dni;
	private String direccion;
	protected ArrayList<String> generosFav;
	private ArrayList<String> autoresFav;
	private ArrayList<Articulo> compras;
	private double descuento;
	
	public Cliente(String nombre, int dni, String direccion, double descuento) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.descuento = descuento;
		this.generosFav = new ArrayList<>();
		this.autoresFav = new ArrayList<>();
		this.compras = new ArrayList<>();
	}
	
	public void addCompra(Articulo articulo) {
		this.compras.add(articulo);
	}
	
	public void addGenero(String genero) {
		if (!this.generosFav.contains(genero))
			this.generosFav.add(genero); // Lo agrego si no existe
	}
	
	public void addAutor(String autor) {
		if (!this.autoresFav.contains(autor))
			this.autoresFav.add(autor); // Lo agrego si no existe
	}
	
	public boolean yaCompro(Articulo articulo) {
		return this.compras.contains(articulo);
	}
	
	public boolean leGusta(Articulo articulo) {
		return this.autoresFav.contains(articulo.getAutor());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	@Override
	public String toString() {
			return this.getNombre();
	}
	
	
	
	
	

}
