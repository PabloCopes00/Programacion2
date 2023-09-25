/*
 Un centro de cómputos se encarga de ejecutar procesos utilizando algunas de las computadoras que dispone. 
 Si no hay computadoras disponibles los procesos a ejecutar deben esperar en una cola de espera que los ordena 
 teniendo en cuenta sus requerimientos de memoria (los procesos con mayor requerimiento de memoria serán atendidos 
 en primer lugar). Las computadoras disponibles para ejecutar procesos se ordenan en una cola que prioriza la selección 
 de las computadoras más rápidas.
 */

import java.util.ArrayList;
import java.util.Collections;

public class CentroComputo {
	private String nombre;
	private ArrayList<CPU> computadoras;
	private ArrayList<Proceso> procesos;
	private ArrayList<Proceso> cola;

	public CentroComputo() {
		this.computadoras = new ArrayList<CPU>();
		this.procesos = new ArrayList<Proceso>();
		this.cola = new ArrayList<Proceso>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void addCPU(CPU c) { // necesitaria entender bien este metodo.
		int i = 0;
		while (i < computadoras.size() && this.comparar(c, computadoras.get(i))) {
			i++;
		}
		if (i < computadoras.size()) {
			computadoras.add(i, c);
		} else {
			computadoras.add(c);
		}
	}

	public boolean comparar(CPU c1, CPU c2) {
		return c1.getMemoria() < c2.getMemoria();
	}

	public void removeCPU(CPU c) {
		computadoras.remove(c);
	}

	public ArrayList<CPU> getCPU() {
		return new ArrayList<CPU>(this.computadoras);
	}

	public void addProceso(Proceso p) {
		if (!procesos.contains(p)) {
			procesos.add(p);
		}
	}

	public void removeProceso(Proceso p) {
		procesos.remove(p);
	}

	public ArrayList<Proceso> getProcesos() {
		return new ArrayList<Proceso>(this.procesos);
	}

	public ArrayList<Proceso> getCola() {
		return new ArrayList<Proceso>(this.cola);
	}

	public void ordenarProcesos() { // despues de quemarme la cabeza horas, encontre esta forma de ordenar, puedo
									// usarla?
		this.cola = new ArrayList<Proceso>(this.procesos);
		Collections.sort(cola);
	}

	public void ejecutar() {
		if (!computadoras.isEmpty()) {   //si tengo computadoras para procesar procesos empiezo a procesar y los elimino
			while (!this.procesos.isEmpty()) {
				this.procesos.remove(0);
			}
			while (!this.cola.isEmpty()) {
				this.cola.remove(0);
			}
		} else { //si no tengo computadoras los ordeno
			ordenarProcesos();
		}
	}

}
