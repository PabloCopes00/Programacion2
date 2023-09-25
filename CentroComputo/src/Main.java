import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		CentroComputo centro = new CentroComputo();
		CPU cpu1 = new CPU("Celeron", 1024);
		CPU cpu2 = new CPU("Celeron", 512);
		CPU cpu3 = new CPU("Celeron", 2048);
		Proceso p1 = new Proceso("Proceso1", 512);
		Proceso p2 = new Proceso("Proceso2", 1024);
		Proceso p3 = new Proceso("Proceso3", 2048);
		Proceso p4 = new Proceso("Proceso4", 128);
		centro.addProceso(p1);
		centro.addProceso(p2);
		centro.addProceso(p3);
		centro.addProceso(p4);
//		System.out.println(centro.getProcesos());
//		System.out.println(centro.getCola());
//		centro.ordenarProcesos();
//		System.out.println(centro.getCola());
		centro.addCPU(cpu1);
//		System.out.println(centro.getCPU());
//		centro.ejecutar();
//		System.out.println(centro.getProcesos());
//		System.out.println(centro.getCola());
		centro.addCPU(cpu2);
		centro.addCPU(cpu3);
		System.out.println(centro.getCPU());

	}
}
