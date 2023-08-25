import java.time.LocalDate;

public class AcademicTask extends Task {
	private String subject;
	private String proffesor;

	public AcademicTask(Person user, String title, String description, int priority, LocalDate dueDate) {
		super(user, title, description, priority, dueDate);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getProffesor() {
		return proffesor;
	}

	public void setProffesor(String proffesor) {
		this.proffesor = proffesor;
	}

	@Override
	public void displayInfo() {

	}

}
