import java.time.LocalDate;

public class Coach extends Person {
	private String federation;

	public Coach(String name, String lastName, int pasport, LocalDate birthDate, String status, String proffesion,
			String federation) {
		super(name, lastName, pasport, birthDate, status, proffesion);
		this.federation = federation;
	}

	public String getFederation() {
		return federation;
	}

	public void setFederation(String federation) {
		this.federation = federation;
	}

	@Override
	public String toString() {
		return this.getProffesion() + " - " + this.getName() + " " + this.getLastName();
	}

}
