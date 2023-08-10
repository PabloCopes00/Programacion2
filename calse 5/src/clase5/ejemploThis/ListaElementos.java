package clase5.ejemploThis;

import java.util.Iterator;

public class ListaElementos {
	private Object[] elementos;
	private int contador;
	private int capacidad;

	public ListaElementos(int capacidad) {
		// crear lista
		this.elementos = new Object[capacidad];
		this.contador = 0;

	}

	public int getCantidadElementos() {
		return contador;
	}

	// pedir elemento posicion

	public Object getElementoen(int pos) {
		if (pos > capacidad) {
			return elementos[pos];
		} else {
			return null;
		}
	}

	// agregar elemento
	public void agregar(Object o) {
		elementos[contador] = o;
		contador++;
		if (contador == capacidad) {
			// se lleno de objetos el arreglo
			Object[] auxiliar = new Object[capacidad * 2];
			for (int i = 0; i < contador; i++) {
				auxiliar[i] = elementos[i];
			}
			elementos = auxiliar;
			capacidad = capacidad * 2;
		}
	}

	// eliminar elemento
	public void eliminar(int pos) {
		if (pos > 0 && pos < contador) {
			for (int i = pos; i < elementos.length; i++) {
				elementos[i] = elementos[i + 1];

			}
			contador--;
		}
	}

	public void eliminarObject(Object o) {
		for (int i = 0; i < elementos.length; i++) {
			if (elementos[i].equals(o)) {
				this.eliminar(i);
				return;
			}

		}
		contador--;
	}

}
