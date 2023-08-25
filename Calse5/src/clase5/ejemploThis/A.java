package clase5.ejemploThis;

public class A {

	public int atributoPublico; // nunca usar public
	protected int atributoProtected;
	private int atributoPrivate;
	int atributoSolo;

	public int a1() {
		return 1;
	}
	public int a2() {
		return 2;
	}
	public int a3() {
		return this.a1()+this.a2();
	}
	public int getAtributoPrivate() {
		return this.atributoPrivate;
	}
	public void setAtributoPrivate(int x) {
		this.atributoPrivate = x;
	}

}
