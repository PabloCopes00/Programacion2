import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.time.LocalDate;

public class Student extends Person {
	private int id;
	private static int idCount = 1;
	private String email;
	private ArrayList<Subject> subject;

	public Student(String name, String lastName, int dni, LocalDate birthDate, String email) {
		super(name, lastName, dni, birthDate);
		this.id = idCount;
		this.subject = new ArrayList<Subject>();
		this.email = email;
		idCount++;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void enrolledSubject() {
		for (int i = 0; i < subject.size(); i++) {
			Subject actualS = this.subject.get(i);
			System.out.println("[" + i + "]" + actualS.getSubject());
		}
	}

	public void addSubject(Subject s) {
		if (subject.contains(s)) {
			JOptionPane.showMessageDialog(null,
					this.getName() + " " + this.getLastName() + " is currently taking this subject.", "Alert",
					JOptionPane.WARNING_MESSAGE);
		} else {
			subject.add(s);
		}
	}

	public void drop(int s) {
		if (s > 0 && s < subject.size()) {
			subject.remove(s);
		}
	}

	public void dropSubject(Subject s) {

		for (int i = 0; i < subject.size(); i++) {
			Subject actSub = subject.get(i);
			if (actSub.equals(s)) {
				drop(i);
			}
		}
	}

	public String highestWorkload() {
		int aux = 0;
		String subj = "";
		String prof = "";
		for (int i = 0; i < subject.size(); i++) {
			if (subject.get(i).getWeeklyHours() > aux) {
				aux = subject.get(i).getWeeklyHours();
				subj = subject.get(i).getSubject();
				prof = subject.get(i).getProfessorName();
			}
		}
		return this.getName() + " " + this.getLastName() + ": The subject with the highest workload is " + subj + ", "
				+ aux + "hs. with Proffesor: " + prof;
	}

	@Override
	public boolean equals(Object o) {
		Person p = (Person) o;
		if (this.getDni() == p.getDni()) {
			return true;
		} else {
			return false;
		}
	}

}
