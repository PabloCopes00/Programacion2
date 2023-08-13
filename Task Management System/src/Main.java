import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		TaskManagementSystem agenda = new TaskManagementSystem();
		Person pablo = new Person("Pablo", "Copes", 32604191, LocalDate.of(1986, 06, 23));
		Task t1 = new Task(pablo, "Compras", "Recordar comprar todo para la fiesta", 4, LocalDate.of(2023, 8, 16));
		Task t2 = new Task(pablo, "Peluqueria", "Llevar a Thiago a la peluqueria", 5, LocalDate.of(2023, 8, 18));
		Task t3 = new Task(pablo, "Trabajo", "Terminar aplicaciones", 3, LocalDate.of(2023, 8, 23));
		Task t4 = new Task(pablo, "Nueva nota sin titulo", 1, LocalDate.of(2023, 8, 8));
		agenda.addTask(t1);
		agenda.addTask(t2);
		agenda.addTask(t3);
		agenda.addTask(t4);
		agenda.getTask();
		agenda.removeT(t4);
		agenda.getTask();
	}

}
