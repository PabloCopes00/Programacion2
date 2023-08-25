package clase5.ejemploThis;

public class C extends A {

	public int c2() {
		atributoProtected = 8;
		atributoPublico = 5;
		return 10;
	}

	public int a3() {
		return super.a3() - 3;
	}

	public int a2() {
		return 100;
	}

	public static void main(String[] args) {
		// A a1 = new A();

	}

}
