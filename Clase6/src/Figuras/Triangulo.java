package Figuras;

public class Triangulo extends Figura {
	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		super("triangulo");
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double getArea() {
		return this.base * this.altura / 2;
	}
	@Override
	public double getPerimetro() {
		return this.base + this.altura + Math.sqrt(Math.pow(this.altura, this.altura) + Math.pow(this.base, this.base));
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}



}
