
public class Employee {
	/*
	 * Una empresa de informática posee tres tipos de empleados. Los empleados
	 * contratados reciben un salario fijo semanal, sin importar la cantidad de
	 * horas trabajadas. Los empleados por horas extras reciben un monto fijo
	 * semanal más un monto extra por cada hora trabajada. Finalmente, los empleados
	 * por comisión reciben un sueldo fijo, más un porcentaje por la cantidad de
	 * ventas realizadas. Implementar un sistema que permita saber cuánto se le debe
	 * pagar a un empleado al finalizar la semana.
	 */

	private String name;
	private String lastName;
	private int id;
	private static int idCount = 1;
	private int workedHour;
	private int saleQuantity;

	public Employee(String name, String lastName, int workedHour, int saleQuantity) {
		this.name = name;
		this.lastName = lastName;
		this.id = idCount;
		this.workedHour = workedHour;
		this.saleQuantity = saleQuantity;
		idCount++;
	}

	public int getSalary() {
		return 200000;
	}

	public String getFullName() {
		return name + " " + lastName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getWorkedHour() {
		return workedHour;
	}

	public void setWorkedHour(int workedHour) {
		this.workedHour = workedHour;
	}

	public int getSales() {
		return saleQuantity;
	}

	public void setSales(int saleQuantity) {
		this.saleQuantity = saleQuantity;
	}

	public int getId() {
		return this.id;
	}

}
