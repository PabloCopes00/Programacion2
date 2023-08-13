import java.time.LocalDate;

public class Person {

	private String name;
	private String lastName;
	private int dni;
	private LocalDate birthDate;

	public Person(String name, String lastName, int dni, LocalDate birthDate) {
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}
