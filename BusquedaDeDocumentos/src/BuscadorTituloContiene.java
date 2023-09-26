
public class BuscadorTituloContiene extends Buscador {

	public BuscadorTituloContiene(String titulo) {
		super(titulo);
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.getTitulo().contains(this.getBusqueda());
	}

}
