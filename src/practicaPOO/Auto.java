package practicaPOO;

public class Auto {

	private String marca;
	private String color;
	private int maxVel;
	private int km;

	public Auto(String marca, String color, int maxVel, int km) {
		this.marca = marca;
		this.color = color;
		this.maxVel = maxVel;
		this.km = km;

	}

	public String getMarca() {
		return marca;
	}

	public String getColor() {
		return color;
	}

	public int getMaxVel() {
		return maxVel;
	}

	public int getKm() {
		return km;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMaxVel(int maxVel) {
		this.maxVel = maxVel;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public boolean equals(Object o) {
		Auto otro = (Auto) o;

		return (this.getMarca().equals(otro.getMarca()) && this.getColor().equals(otro.getColor())
				&& this.getMaxVel() == otro.getMaxVel() && this.getKm() == otro.getKm());

	}

	public String toString() {
		return "----------------\nMarca: " + this.marca + "\nColor: " + this.color + "\nVelocidad Maxima: "
				+ this.maxVel + " Km/h" + "\nKilometraje: " + this.km;

	}

}
