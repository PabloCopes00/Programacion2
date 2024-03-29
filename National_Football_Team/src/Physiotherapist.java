import java.time.LocalDate;

public class Physiotherapist extends Person {
	private int registrationNumber;
	private int yearsOfExperience;

	public Physiotherapist(String name, String lastName, int pasport, LocalDate birthDate, String status,
			String proffesion, int registrationNumber, int yearsOfExperience) {
		super(name, lastName, pasport, birthDate, status, proffesion);
		this.registrationNumber = registrationNumber;
		this.yearsOfExperience = yearsOfExperience;

	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

}
