public class BuscadorNoContieneClave extends Buscador {

	public BuscadorNoContieneClave(String palabrasClave) {
		super(palabrasClave);
	}

	@Override
	public boolean cumple(Documento documento) {
		return !documento.contieneClave(this.getBusqueda());
	}

}