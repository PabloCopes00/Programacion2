package Ejercicio;

public class Main {

	public static void main(String[] args) {
		//Procesador p1 = new ProcesadorCPU();
		Procesador p1 = new ProcesadorMemoria();
		//Procesador p1 = new ProcesadorPrioridad();
		Tarea t1 = new Tarea(0, 10, 2, "T1");
		Tarea t2 = new Tarea(4, 1, 4, "T2");
		Tarea t3 = new Tarea(1, 4, 7, "T3");
		Tarea t4 = new Tarea(10, 0, 9, "T4");

		p1.addTarea(t1);
		p1.addTarea(t2);
		p1.addTarea(t3);
		p1.addTarea(t4);
		System.out.println(p1);
	}

}
