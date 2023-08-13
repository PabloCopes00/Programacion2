import java.time.LocalDate;
import java.time.Period;

public class Task {

	private String title;
	private String description;
	int priority;

	private Person user;

	boolean completed;

	LocalDate date;
	LocalDate dueDate;

	public Task(Person user, String title, String description, int priority, LocalDate dueDate) {
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.completed = false;
		this.dueDate = dueDate;
		this.date = LocalDate.now();
		this.user = user;
	}

	public Person getUser() {
		return user;
	}

	public Task(Person user, String description, int priority, LocalDate dueDate) {
		this(user, "New Task", description, priority, dueDate);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean taskStatus() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public LocalDate getDate() {
		return date;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void displayInfo() {

	}

	public String taskTimeRemaining() {
		String statement = "";
		LocalDate now = LocalDate.now();
		Period period = Period.between(now, dueDate);
		if (now.isBefore(this.dueDate)) {
			statement = "You still have " + period.getDays() + " days to complete the task.";
			return statement;
		} else if (now.isEqual(this.dueDate)) {
			statement = "Today is the due date! " + LocalDate.now() + " Complete the task now.";
			return statement;
		} else {
			statement = "The task has already expired. Hurry up!";
			return statement;
		}
	}

}
