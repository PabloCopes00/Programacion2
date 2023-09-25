import java.util.ArrayList;

public class Evaluador {

	private String nombre;
	private ArrayList<String> conocimientos;
	private ArrayList<Trabajo> listaTrabajos;
	private int contador;

	public Evaluador(String nombre) {
		this.nombre = nombre;
		this.conocimientos = new ArrayList<String>();
		this.listaTrabajos = new ArrayList<Trabajo>();
		this.contador = 0;
	}

	public void addConocimiento(String s) {
		if (!conocimientos.contains(s))
			conocimientos.add(s);
	}

	public ArrayList<String> getConocimientos() {
		return new ArrayList<String>(this.conocimientos);
	}

	public void addTrabajo(Trabajo t) {
		if (!listaTrabajos.contains(t))
			listaTrabajos.add(t);
	}

	public ArrayList<Trabajo> getTrabajos() {
		return new ArrayList<>(this.listaTrabajos);
	}

	public boolean puedeEvaluar(Trabajo t) {
		for (int i = 0; i < conocimientos.size(); i++) {
			String conocimientoActual = conocimientos.get(i);
			if (t.tieneEstaPalabra(conocimientoActual)) {
				return true;
			}
		}
		return false;
	}

	public int cantidadTrabajos() {
		return this.listaTrabajos.size();
	}

}
