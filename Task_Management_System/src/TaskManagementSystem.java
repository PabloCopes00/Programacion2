import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TaskManagementSystem {
	private ArrayList<Task> taskManagement;

	public TaskManagementSystem() {
		this.taskManagement = new ArrayList<Task>();
	}

	public void getTask() {
		System.out.println("\nTask List:");
		for (Task task : taskManagement) {
			String statement = (task.taskStatus()) ? "Completed" : "Incomplete";
			System.out.println("[" + task.getDate() + "] " + task.getTitle() + " - " + task.getDescription()
					+ " - Due Date: " + task.getDueDate() + " - " + statement);
		}
	}

	public void taskGet(Task t) {
		String statement = (t.taskStatus()) ? "Completed" : "Incomplete";
		System.out.println("[" + t.getDate() + "] " + t.getTitle() + " - " + t.getDescription() + " - Due Date: "
				+ t.getDueDate() + " - " + statement);
	}

	public void getExpiredTask() {
		System.out.println("\nExpired Task:");
		for (Task task : taskManagement) {
			if (task.ExpiredTask()) {
				taskGet(task);
			}
		}
	}

	public void getUnexpiredTask() {
		System.out.println("\nUnexpired Task:");
		for (Task task : taskManagement) {
			if (!task.ExpiredTask()) {
				taskGet(task);
			}
		}
	}

	public void getTaskCompleted() {
		System.out.println("\nTask Completed:");
		for (Task task : taskManagement) {
			boolean check = task.taskStatus();
			String statement = (check) ? "Completed" : "Incomplete";
			if (check) {
				System.out.println("[" + task.getDate() + "] " + task.getTitle() + " - " + task.getDescription()
						+ " - Due Date: " + task.getDueDate() + " - " + statement);
			}
		}
	}

	public void getTaskIncompleted() {
		System.out.println("\nTask Incompleted:");
		for (Task task : taskManagement) {
			boolean check = task.taskStatus();
			String statement = (check) ? "Completed" : "Incomplete";
			if (!check) {
				System.out.println("[" + task.getDate() + "] " + task.getTitle() + " - " + task.getDescription()
						+ " - Due Date: " + task.getDueDate() + " - " + statement);
			}
		}
	}

	public void addTask(Task t) {
		taskManagement.add(t);
	}

	public void editTask(Task t, String s) {
		boolean spotted = false;
		int i = 0;
		while (i < taskManagement.size() && !spotted) {
			Task actual = taskManagement.get(i);
			while (!spotted & actual == t) {
				actual.setDescription(s);
				spotted = true;
			}
			i++;
		}
	}

	public void removeT(Task t) {
		if (taskManagement.contains(t)) {
			int check = JOptionPane.showConfirmDialog(null, "Do you wish to remove the task?", "Remove Task",
					JOptionPane.YES_NO_OPTION);
			if (check == JOptionPane.YES_OPTION) {
				taskManagement.remove(t);
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"The task " + t.getTitle() + " has either been removed or is not present in the task list.",
					"Alert", JOptionPane.WARNING_MESSAGE);
		}
	}

	public void removeCompleted() {
		for (Task task : taskManagement) {
			if (task.taskStatus()) {
				taskManagement.remove(task);
			}
		}
	}

}
