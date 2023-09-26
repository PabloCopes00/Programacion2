
public abstract class Buscador {
	public String busqueda;

	public Buscador(String busqueda) {
		this.busqueda = busqueda;
	}

	public String getBusqueda() {
		return busqueda;
	}

	public void setBusqueda(String busqueda) {
		this.busqueda = busqueda;
	}

	public abstract boolean cumple(Documento documento);
}
