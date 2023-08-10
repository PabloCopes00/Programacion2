package Ejercicio;

import java.util.ArrayList;

public abstract class Procesador {
	protected ArrayList<Tarea> tareas;

	public Procesador() {
		tareas = new ArrayList<Tarea>();
	}

	public ArrayList<Tarea> getTareas() {
		return tareas;
	}

	public void ejecutarPrimera() {
		if (tareas.size() > 0) {
			Tarea t1 = tareas.get(0);
			t1.ejecutarTarea();
			tareas.remove(0);
		}
	}

	public abstract boolean esMayor(Tarea t1, Tarea t2);

	// METODO TEMPLATE
	public void addTarea(Tarea t1) {

		boolean encontrado = false;

		int i = 0;

		while (!encontrado && i < tareas.size()) {
			if (this.esMayor(t1, tareas.get(i))) {
				encontrado = true;
				tareas.add(i, t1);
			}
			i++;
		}
		if (!encontrado) {
			tareas.add(t1);
		}

	}

	public String toString() {
		return "Procesador \n" + tareas.toString();
	}

}