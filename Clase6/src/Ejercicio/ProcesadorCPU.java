package Ejercicio;

public class ProcesadorCPU extends Procesador {

	@Override
	public boolean esMayor(Tarea t1, Tarea t2) {
		return t1.getCpu() > t2.getCpu();
	}

	
}
