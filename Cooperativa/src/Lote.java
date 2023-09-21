import java.util.ArrayList;

public class Lote {

	private String nombre;
	private ArrayList<String> minerales;
	private double tamanio;

	public Lote(String nombre, double tamanio) {
		super();
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.minerales = new ArrayList<String>();
	}

	public boolean sePuedeSembrar(Cereal cereal) {

		return cereal.sePuedeSembrarEn(this);
		// this.minerales.containsAll(cereal.getMinerales()); // No delega la
		// responsabilidad

	}

	public boolean tieneMineral(String mineral) {
		return this.minerales.contains(mineral);
	}

	public void addMineral(String mineral) {
		this.minerales.add(mineral);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
}