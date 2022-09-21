package ejercicio2;

/*
 Crear una clase Electrodoméstico con las siguientes características:
Atributos son nombre, precio base, color, consumo energético y peso.
Valores por defecto:
● El color por defecto es gris plata.
● El consumo energético 10 Kw.
● Precio base 100 pesos.
● El peso es 2 kg.

Implementar todos los constructores.

La funcionalidad de la clase es la siguiente:
● Todos los métodos get y set.
● Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw)
● Calcular el balance, el mismo es el resultado de dividir el costo por el peso
● Indicar si un producto es de alta gama, el balance es mayor que 3*/


public class Electrodomestico {
	private String nombre;
	private double precioBase;
	private String color;
	private int consumoEnergetico;
	private double peso;

	private static int consumoMax = 45;
	private static int balanceMax = 3;

	// CONSTRUCTOR POR DEFECTO
	public Electrodomestico(String nombre, double precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.color = "Gris Plata";
		this.consumoEnergetico = 10;
		this.peso = 2;
	}

	public Electrodomestico(String nombre, double precioBase, String color) {
		this(nombre, precioBase, color, 10, 2);
	}

	public Electrodomestico(String nombre, double precioBase, String color, int consumoEnergetico) {
		this(nombre, precioBase, color, consumoEnergetico, 2);
	}

	// CONSTRUCTOR TOTAL
	public Electrodomestico(String nombre, double precioBase, String color, int consumoEnergetico, double peso) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public boolean comprobarBajoConsumo() {
		int consumo = this.consumoEnergetico;
		if (consumo < consumoMax) {
			return true;
		} else {
			return false;
		}
	}

	public double balanceElectrodomestico() {
		return this.precioBase / this.peso;
	}

	public boolean esAltaGama() {
		double balance = balanceElectrodomestico();
		if (balance > balanceMax) {
			return true;
		} else {
			return false;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public int getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public String getInfoElectrodomestico() {
		return "Nombre: " + nombre + "\nPrecio Base: $" + precioBase + "\nColor: " + color + "\nConsumo Energetico "
				+ consumoEnergetico + "kw." + "\nPeso: " + peso + "kg.";
	}

	public double getPeso() {
		return peso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setConsumoEnergetico(int consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public static void main(String[] args) {

		Electrodomestico e1 = new Electrodomestico("Heladera", 150000, "Plateada", 15, 85);
		System.out.println(e1.getInfoElectrodomestico());
		System.out.println("");
		System.out.println("Es de bajo consumo? " + e1.comprobarBajoConsumo());
		System.out.println("");
		System.out.println("Balance del electrodomestico? " + e1.balanceElectrodomestico());
		System.out.println("");
		System.out.println("Es alta gama? " + e1.esAltaGama());

	}

}
