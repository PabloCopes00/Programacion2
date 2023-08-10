package Figuras;

public class Circulo extends Figura {
	private double radio;

	public Circulo(double radio) {
		super("Circulo");
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}
	public double getPerimetro() {
		return Math.pow(Math.PI * this.radio, 2);
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getArea() {
		return Math.PI * radio * radio;
	}

}
