import java.time.LocalDate;
import java.util.ArrayList;

public class Supervisor extends Employee {

	private ArrayList<Employee> employee;

	public Supervisor(String name, String lastName, LocalDate birthDate, String user, String passwd, int salary,
			String title) {
		super(name, lastName, birthDate, user, passwd, salary, title);
		this.employee = new ArrayList<>();
	}

	public void addEmployee(Employee e) {
		if (!employee.contains(e)) {
			employee.add(e);
		}
	}

	public void removeEmployee(Employee e) {
		if (employee.contains(e)) {
			employee.remove(e);
		}
	}

	@Override
	public String toString() {
		String statement = super.toString() + "\n";
		for (Employee employee2 : employee) {

			statement += "\nSubordinate:" + employee2 + "\nUser: " + employee2.getUser() + "\nPassword: "
					+ employee2.getPasswd() + "\n";
		}
		return statement;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Juan", "Pelotas", LocalDate.of(1989, 02, 21), "asdf", "1234", 120000, "Employee");
		Employee e2 = new Employee("Luke", "Skywalker", LocalDate.of(1977, 12, 25), "asdf", "1234", 300000, "Employee");
		Employee e3 = new Employee("Lionel", "Messi", LocalDate.of(1987, 06, 24), "asdf", "1234", 360000, "Employee");
		Employee e4 = new Employee("Juana", "De Arco", LocalDate.of(1412, 01, 01), "asdf", "1234", 250000, "Employee");
		Supervisor s1 = new Supervisor("Pablo", "Copes", LocalDate.of(1986, 06, 23), "fdsa", "4321", 400000,
				"Supervisor");
		s1.addEmployee(e1);
		s1.addEmployee(e2);
		s1.addEmployee(e3);
		s1.addEmployee(e3); // probando que no agrega repetidos.
		s1.addEmployee(e3);
		s1.addEmployee(e4);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(s1);
		s1.removeEmployee(e4); // probando que borra.
		System.out.println(s1);

	}

}
