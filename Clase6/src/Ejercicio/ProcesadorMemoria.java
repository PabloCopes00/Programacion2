package Ejercicio;

public class ProcesadorMemoria extends Procesador {

	@Override
	public boolean esMayor(Tarea t1, Tarea t2) {

		return t1.getMemoria() > t2.getMemoria();
	}

}
