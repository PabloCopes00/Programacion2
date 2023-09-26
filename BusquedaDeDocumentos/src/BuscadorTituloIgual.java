
public class BuscadorTituloIgual extends Buscador {

	public BuscadorTituloIgual(String titulo) {
		super(titulo);
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.getTitulo().equals(this.getBusqueda());
	}

}
