
public class BuscadorContieneClave extends Buscador {

	public BuscadorContieneClave(String palabrasClave) {
		super(palabrasClave);
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.contieneClave(this.getBusqueda());
	}

}
