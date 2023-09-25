
public class Proceso implements Comparable<Proceso> {
	public String nombre;
	public int memoria;

	public Proceso(String nombre, int memoria) {
		this.nombre = nombre;
		this.memoria = memoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		return "\nProceso: " + this.getNombre() + " - " + this.getMemoria();
	}
	@Override
	public int compareTo(Proceso o) {
		return Integer.compare(o.getMemoria(), this.getMemoria());
	}

}
