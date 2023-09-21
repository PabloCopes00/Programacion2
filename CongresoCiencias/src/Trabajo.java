import java.util.ArrayList;

public class Trabajo {
	private String nombre;
	private ArrayList<String> palabras;

	public Trabajo(String nombre) {
		this.nombre = nombre;
		this.palabras = new ArrayList<>();
	}

	public void addTrabajo(String s) {
		if (!palabras.contains(s))
			palabras.add(s);
	}

	public ArrayList<String> getTrabajo() {
		return new ArrayList<>(this.palabras);
	}

	public boolean tieneEstaPalabra(String s) {
		return this.palabras.contains(s);
	}

	public boolean puedeSerEvaluadoPor(Evaluador e) {
		return e.puedeEvaluar(this);
	}

}
