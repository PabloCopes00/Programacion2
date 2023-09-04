import java.time.LocalDate;

public class Employee extends User {

	private int employeeId;
	private static int id = 1;
	private int salary;
	private String title;

	public Employee(String name, String lastName, LocalDate birthDate, String user, String passwd, int salary,
			String title) {
		super(name, lastName, birthDate, user, passwd);
		this.salary = salary;
		this.title = title;
		this.employeeId = id;
		id++;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public static int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public boolean equals(Object o) {
		return this.employeeId == ((Employee) o).employeeId;
	}

	@Override
	public String toString() {
		return "\nTitle: " + this.getTitle() + "\nID: " + this.getEmployeeId() + super.toString() + "\nSalary: $"
				+ getSalary();
	}
}
