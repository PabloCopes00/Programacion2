
public class BuscadorPorContenido extends Buscador {
	public BuscadorPorContenido(String contenido) {
		super(contenido);
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.getContenido().contains(getBusqueda());
	}

}
