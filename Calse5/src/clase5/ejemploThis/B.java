package clase5.ejemploThis;

public class B extends A {

	public int a1() {
		return 10;
	}

	public int b1() {
		return 5;
	}

	public int b2() {
		this.atributoProtected = 4;
		this.atributoPublico = 5;
		this.atributoSolo = 3;
		return this.atributoSolo;
	}

}
