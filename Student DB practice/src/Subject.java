
public class Subject {
	private String subject;
	private String professorName;
	private int weeklyHours;

	public Subject(String subject, String professorName, int weeklyHours) {
		this.subject = subject;
		this.professorName = professorName;
		this.weeklyHours = weeklyHours;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public int getWeeklyHours() {
		return weeklyHours;
	}

	public void setWeeklyHours(int weeklyHours) {
		this.weeklyHours = weeklyHours;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		} else {
			return false;
		}
	}
}
