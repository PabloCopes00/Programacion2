import java.time.LocalDate;

public abstract class Task {

	private String title;
	private String description;
	int priority;

	boolean completed;

	LocalDate date;
	LocalDate dueDate;

	public Task(String title, String description, int priority, LocalDate dueDate) {
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.completed = false;
		this.dueDate = dueDate;
		this.date = LocalDate.now();
	}

	public Task(String description, int priority, LocalDate dueDate) {
		this("New Task", description, priority, dueDate);
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

	public boolean isCompleted() {
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

	public abstract void displayInfo();

	public void getTaskStatus() {

	}

	public void taskTimeRemaining() {

	}

}
