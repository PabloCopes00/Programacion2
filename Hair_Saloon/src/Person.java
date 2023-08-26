public class Person {
	private String name;
	private String lastName;
	private String role;
	private boolean member;
	private int appointmentCount;

	public Person(String name, String lastName, String role) {
		this.name = name;
		this.lastName = lastName;
		this.role = role;
		this.member = false;
		this.appointmentCount = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public int getAppointmentCount() {
		return appointmentCount;
	}

	public void setAppointmentCount() {
		this.appointmentCount++;
	}

	@Override
	public String toString() {
		return this.getRole() + " " + this.getName() + " " + this.getLastName();
	}
}
