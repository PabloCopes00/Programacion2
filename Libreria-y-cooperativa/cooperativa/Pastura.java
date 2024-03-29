package cooperativa;

public class Pastura extends Cereal {

	private double tamaņoMinimo;
	
	public Pastura(String nombre, double tamaņoMinimo) {
		super(nombre);
		this.tamaņoMinimo = tamaņoMinimo;

	}
	
	@Override
	public boolean sePuedeSembrarEn(Lote lote) {
		if (lote.getTamaņo() > this.tamaņoMinimo)
			return super.sePuedeSembrarEn(lote);
		else
			return false;
	}
	
	

}
