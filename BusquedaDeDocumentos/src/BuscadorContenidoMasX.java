
public class BuscadorContenidoMasX extends BuscadorPorContenido {
	private int cantidad;

	public BuscadorContenidoMasX(String contenido, int cantidad) {
		super(contenido);
		this.cantidad = cantidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.contenidoMasDe(this.getBusqueda(), cantidad);
	}
}
