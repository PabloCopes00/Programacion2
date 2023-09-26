import java.util.ArrayList;

public class Documento {

	private String titulo;
	private String contenido;
	private ArrayList<String> autores;
	private ArrayList<String> palabrasClave;

	public Documento(String titulo, String contenido) {
		this.titulo = titulo;
		this.contenido = contenido;
		this.autores = new ArrayList<String>();
		this.palabrasClave = new ArrayList<String>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public ArrayList<String> getAutores() {
		return new ArrayList<String>(this.autores);
	}

	public ArrayList<String> getPalabrasClave() {
		return new ArrayList<String>(this.palabrasClave);
	}

	public void addAutor(String s) {
		autores.add(s);
	}

	public void addPalabra(String s) {
		palabrasClave.add(s);
	}

	public boolean contieneClave(String c) {
		for (String clave : this.palabrasClave) {
			if (clave.contains(c)) {
				return true;
			}
		}
		return false;
	}

	public boolean contieneAutor(String a) {

		if (this.autores.contains(a)) {
			return true;
		}
		return false;

	}

	public boolean contenidoMasDe(String s, int num) {
		int contador = 0;
		String[] contenidoArr = s.split(" ");
		String[] contenidoo = contenido.split(" ");

		for (String str : contenidoo) {
			for (String string : contenidoArr) {
				if (str.equals(string)) {
					contador++;
				}
			}
		}
		System.out.println(
				"esa o esas palabras se encontraron: " + contador + " veces en el documento: " + this.getTitulo());
		if (contador >= num) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "\nDocumento: '" + this.getTitulo() + "' - Autor/es: " + this.getAutores();
	}

}
