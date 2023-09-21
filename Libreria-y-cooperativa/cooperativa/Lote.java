package cooperativa;

import java.util.ArrayList;

public class Lote {
	
	private String nombre;
	private ArrayList<String> minerales;
	private double tamaño;
	public Lote(String nombre, double tamaño) {
		super();
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.minerales = new ArrayList<String>();
	}
	
	public boolean sePuedeSembrar(Cereal cereal) {
		
		return cereal.sePuedeSembrarEn(this);
				//this.minerales.containsAll(cereal.getMinerales()); // No delega la responsabilidad
		
		
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
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	
	
	
	

}
