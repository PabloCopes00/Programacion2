import clase5.ejemploThis.A;
import clase5.ejemploThis.B;
import clase5.ejemploThis.C;
import clase5.ejemploThis.D;
import clase5otroEjemplo.Persona;
public class ejemploEjecutable {
	public static void main(String[] args) {
		A aux = new A();
		B aux2 = new B();
		System.out.println(aux2.a1());
		System.out.println(aux2.a2());
		System.out.println(aux2.a3());
		System.out.println(aux2.b1());
		System.out.println("--------");
		aux = aux2;
		System.out.println(aux.a1());
		System.out.println(aux.a2());
		// System.out.println(aux.b1());
		// si bien aux apunta a B esta declarado como A.
		// solo mensajes que esten en la clase A
		// porque es el tipo de variable.
		System.out.println("\n--------");
		Persona p1 = new Persona();
		System.out.println(p1.getNombre());
		System.out.println(p1.getApellido());
		p1.setApellido("Copes");
		p1.setNombre("Pablo");
		System.out.println("\n--------");
		System.out.println(p1.getNombre());
		System.out.println(p1.getApellido());
		Persona p2 = new Persona("Pablo","Copes");
		System.out.println(p2.getNombre());
		System.out.println(p2.getApellido());
		
		
		System.out.println("\n--------");
		C aux3 = new C();
		System.out.println(aux3.a1()); // 3
		System.out.println(aux3.a2()); // 100
		System.out.println(aux3.a3()); // 98 1+100-3
		System.out.println("\n--------");
		D aux4 = new D();
		System.out.println(aux4.a1()); // 3
		System.out.println(aux4.a2()); // 100
		System.out.println(aux4.a3()); // 100 3+100-3
	}

}
