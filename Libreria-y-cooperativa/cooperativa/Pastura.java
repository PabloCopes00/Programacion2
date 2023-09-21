package cooperativa;

public class Pastura extends Cereal {

	private double tamañoMinimo;
	
	public Pastura(String nombre, double tamañoMinimo) {
		super(nombre);
		this.tamañoMinimo = tamañoMinimo;

	}
	
	@Override
	public boolean sePuedeSembrarEn(Lote lote) {
		if (lote.getTamaño() > this.tamañoMinimo)
			return super.sePuedeSembrarEn(lote);
		else
			return false;
	}
	
	

}
