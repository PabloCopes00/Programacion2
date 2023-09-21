import java.util.ArrayList;

public class Articulo {
	private String nombre;
	private String autor;
	private String resumen;
	private double precio;
	private int cantPaginas;
	private ArrayList<String> generos;

	public Articulo(String nombre, String autor, String resumen, double precio, int cantPaginas) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.resumen = resumen;
		this.precio = precio;
		this.cantPaginas = cantPaginas;
		this.generos = new ArrayList<>();
	}

	public void addGenero(String genero) {
		if (!this.generos.contains(genero))
			this.generos.add(genero); // Lo agrego si no existe
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantPaginas() {
		return cantPaginas;
	}

	public void setCantPaginas(int cantPaginas) {
		this.cantPaginas = cantPaginas;
	}

	public boolean equals(Object o) {
		try {
			Articulo otro = (Articulo) o;
			return this.getNombre().equals(otro.getNombre()) && this.getAutor().equals(otro.getAutor());
		} catch (Exception e) {
			return false;
		}
	}

	public ArrayList<String> getGeneros() {
		// Solo como valido como ultima instancia
		return new ArrayList<>(this.generos); // Retorna una copia del arraylist
	}

	public boolean tieneGenero(String genero) {
		return this.generos.contains(genero);

	}

}
