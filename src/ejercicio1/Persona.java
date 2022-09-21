package ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	// Atributos de nuestro objeto PERSONA

	private long dni;
	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fnac;
	private String sexo;
	private double peso;
	private double altura;

	private static double masaCorpMenor = 18.5;
	private static double masaCorpMayor = 25;
	private static int mayoriaEdad = 18;
	private static int edadVotar = 16;

	// CONSTRUCTOR TOTAL
	public Persona(long dni, String nombre, String apellido, int edad, LocalDate fnac, String sexo, double peso,
			double altura) {

		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fnac = fnac;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;

	}

	// CONSTRUCTOR PERSONA DNI
	public Persona(long dni) {

		this(dni, "N", "N", 10, LocalDate.of(2000, 1, 1), "Femenino", 1, 1);

	}

	public Persona(long dni, String nombre, String apellido) {
		this(dni, nombre, apellido, 10, LocalDate.of(2000, 1, 1), "Femenino", 1, 1);
	}

	public Persona(long dni, String nombre, String apellido, int edad) {
		this(dni, nombre, apellido, edad, LocalDate.of(2000, 1, 1), "Femenino", 1, 1);
	}

	public Persona(long dni, String nombre, String apellido, int edad, LocalDate fnac) {
		this(dni, nombre, apellido, edad, fnac, "Femenino", 1, 1);
	}

	public Persona(long dni, String nombre, String apellido, int edad, LocalDate fnac, String sexo) {
		this(dni, nombre, apellido, edad, fnac, sexo, 1, 1);
	}

	public Persona(long dni, String nombre, String apellido, int edad, LocalDate fnac, String sexo, double peso) {
		this(dni, nombre, apellido, edad, fnac, sexo, peso, 1);
	}

	public double calculoMasaCorporal() {
		double masaCorporal = peso / Math.pow(altura, 2);
		return masaCorporal;
	}

	public boolean estaEnForma() {
		double masaCorporal = this.calculoMasaCorporal();
		if (masaCorpMenor <= masaCorporal && masaCorporal <= masaCorpMayor) {
			return true;
		} else {
			return false;
		}
	}

	public boolean estaCumpliendoAnios() {
		Period diferencia = Period.between(fnac, LocalDate.now());
		if ((diferencia.getDays() == 0) && (diferencia.getMonths() == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean esMayorDeEdad() {
		Period difEdad = Period.between(fnac, LocalDate.now());
		if (difEdad.getYears() >= mayoriaEdad) {

			return true;

		} else {

			return false;
		}
	}

	public boolean puedeVotar() {
		Period difEdad = Period.between(fnac, LocalDate.now());
		if (difEdad.getYears() >= edadVotar) {
			return true;
		} else {
			return false;
		}

	}

	public int edadActual() {
		int edad;
		Period difEdad = Period.between(fnac, LocalDate.now());
		edad = difEdad.getYears();

		return edad;
	}

	public boolean esCoherente() {
		if (this.edad == edadActual()) {
			return true;
		} else {
			return false;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public LocalDate getFechaNacimiento() {
		return fnac;
	}

	public long getDni() {
		return dni;
	}

	public String getSexo() {
		return sexo;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setFechaNacimiento(LocalDate fnac) {
		this.fnac = fnac;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getInfoPersona() {
		return "Nombre: " + nombre + ". \nApellido: " + apellido + ". \nEdad: " + edad + ". \nFecha de nacimiento: "
				+ fnac + ". \nSexo: " + sexo + ". \nPeso: " + peso + "kgs. \nAltura: " + altura + "mts.";
	}

	public static void main(String[] args) {

		Persona persona1 = new Persona(32604191, "Pablo", "Copes", 36, LocalDate.of(1986, 6, 23), "Masculino", 98.5,
				1.80);
		Persona persona2 = new Persona(55676677, "Thiago", "Copes", 06, LocalDate.of(2016, 8, 2), "Masculino", 21, 1.1);
		
		System.out.println(persona1.getInfoPersona());
		System.out.println("");
		System.out.println(persona2.getInfoPersona());
		System.out.println("");
		System.out.println("Es " + persona1.getNombre() + " mayor de edad? " + persona1.esMayorDeEdad());
		System.out.println("Es " + persona2.getNombre() + " mayor de edad? " + persona2.esMayorDeEdad());
		System.out.println("");
		System.out.println("Es coherente la edad con la fecha de nacimiento? " + persona1.esCoherente());
		System.out.println("Es coherente la edad con la fecha de nacimiento? " + persona2.esCoherente());
		System.out.println("");
		System.out.println(
				"Cual es la masa corporal de " + persona1.getNombre() + " ?  " + persona1.calculoMasaCorporal());
		System.out.println(
				"Cual es la masa corporal de " + persona2.getNombre() + " ?  " + persona2.calculoMasaCorporal());
		System.out.println("");
		System.out.println("Esta " + persona1.getNombre() + " en forma? " + persona1.estaEnForma());
		System.out.println("Esta " + persona2.getNombre() + " en forma? " + persona2.estaEnForma());
		System.out.println("");
		System.out.println(persona1.getNombre() + " puede votar? " + persona1.puedeVotar());
		System.out.println(persona2.getNombre() + " puede votar? " + persona2.puedeVotar());
		System.out.println("");
		System.out.println("Es hoy el cumpleaños de " + persona1.getNombre() + "? " + persona1.estaCumpliendoAnios());
		System.out.println("Es hoy el cumpleaños de " + persona2.getNombre() + "? " + persona2.estaCumpliendoAnios());
		System.out.println("");

	}
}
