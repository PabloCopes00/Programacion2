import java.time.LocalDate;

public class Person {

	private String name;
	private String lastName;
	private LocalDate birthDate;

	public Person(String name, String lastName, LocalDate birthDate) {
		this.name = name;
		this.lastName = lastName;
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

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public int getAge() {
		return LocalDate.now().getYear() - this.getBirthDate().getYear();
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "\nName: " + this.getName() + " " + this.getLastName() + "\nAge: " + getAge();
	}

}
