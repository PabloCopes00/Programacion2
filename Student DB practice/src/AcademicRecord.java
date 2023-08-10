import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AcademicRecord {
	ArrayList<Student> aRecord;

	public AcademicRecord() {
		aRecord = new ArrayList<Student>();
	}

	public void addStudent(Student s) {

		if (aRecord.contains(s)) {
			JOptionPane.showMessageDialog(null,
					s.getName() + " " + s.getLastName() + " is already enrolled in the university.", "Alert",
					JOptionPane.WARNING_MESSAGE);
		} else {
			aRecord.add(s);
		}
	}

	public void drop(int s) {
		if (s > 0 && s < aRecord.size()) {
			aRecord.remove(s);
		}
	}

	public void dropSubject(Student s) {
		for (int i = 0; i < aRecord.size(); i++) {
			if (aRecord.get(i).equals(s)) {
				drop(i);
				String statement = "The student " + s.getName() + " " + s.getLastName() + " was removed";
				System.out.println(statement);
			}
		}
	}

	public void enrolledSubject() {
		for (int i = 0; i < aRecord.size(); i++) {
			Student actStudent = aRecord.get(i);
			System.out.println("\nSubjects in which " + actStudent.getName() + " " + actStudent.getLastName()
					+ " is currently enrolled:");
			actStudent.enrolledSubject();

		}
	}

}
