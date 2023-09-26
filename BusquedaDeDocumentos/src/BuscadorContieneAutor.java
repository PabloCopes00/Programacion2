
public class BuscadorContieneAutor extends Buscador {
	public BuscadorContieneAutor(String autor) {
		super(autor);
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.contieneAutor(this.getBusqueda());
	}
}
