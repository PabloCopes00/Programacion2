import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TaskManagementSystem {
	private ArrayList<Task> taskManagement;

	public TaskManagementSystem() {
		this.taskManagement = new ArrayList<Task>();
	}

	public void getTask() {
		for (Task task : taskManagement) {
			System.out.println(task.getTitle() + " - " + task.getDescription());
		}
		System.out.println("\n");
	}

	public void addTask(Task t) {
		taskManagement.add(t);
	}

	public void remove(int t) {
		if (t >= 0 && t < taskManagement.size()) {
			taskManagement.remove(t);
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

}
