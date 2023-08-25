//4 - Selección de fútbol
//El contingente de la selección de fútbol de un país está formado tanto por futbolistas 
//como por un cuerpo técnico. Cada integrante del contingente posee un 
//nombre, apellido, número de pasaporte y fecha de nacimiento. 
//Los futbolistas, además, poseen una posición, si es zurdo o derecho y la cantidad de goles convertidos. 
//Los entrenadores poseen un identificador de la federación a la que pertenecen y 
//los masajistas el título que poseen y la cantidad de años de experiencia.
//El sistema debe permitir conocer el estado de una persona. El estado puede ser “Viajando”, 
//“En concentración”, “En país de origen”. Se debe poder saber si una persona está disponible
//o no para un evento solidario para recaudar fondos. Una persona estará disponible si está en el país de origen 
//y no está concentrando para un partido. 
//Nota: Una misma persona no comparte dos roles distintos, por ejemplo un técnico no puede ser futbolista, ni masajista.

import java.time.LocalDate;

public class Person {
	private static final String HOMEBOUND = "Homebound";
	
	private String name;
	private String lastName;
	private int passport;
	private LocalDate birthDate;
	
	private String status;
	private String proffesion;

	public Person(String name, String lastName, int pasport, LocalDate birthDate, String status, String proffesion) {
		this.name = name;
		this.lastName = lastName;
		this.passport = pasport;
		this.birthDate = birthDate;
		this.status = status;
		this.proffesion = proffesion;
	}

	public String getName() {
		return this.name;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getFullName() {
		return this.name + " " + this.lastName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPassport() {
		return passport;
	}

	public void setPassport(int pasport) {
		this.passport = pasport;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getStatus() {
		return this.status;
	}

	public boolean checkAvailable() {
		return this.getStatus().equals(HOMEBOUND);
	}

	public String isAvailable() {
		if (this.checkAvailable()) {
			return "\n" + this.getFullName() + " Is available.";
		} else {
			return "\n" + this.getFullName() + " Is not available, he is " + this.getStatus();
		}
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProffesion() {
		return proffesion;
	}

	public void setProffesion(String proffesion) {
		this.proffesion = proffesion;
	}

	@Override
	public String toString() {
		return this.getProffesion() + " - " + this.getName() + " " + this.getLastName();
	}

}