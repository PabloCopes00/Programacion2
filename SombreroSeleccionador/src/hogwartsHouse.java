import java.lang.reflect.Array;
import java.util.ArrayList;

public class hogwartsHouse {

	// Gryffindor: Valor - Fuerza - Audacia
	// Gryffindor values courage, bravery, nerve, and chivalry

	// Hufflepuff: Justicia - Lealtad - Paciencia
	// Hufflepuff values hard work, patience, justice, and loyalty

	// Ravenclaw: Creatividad - Erudición - inteligencia
	// Ravenclaw values intelligence, learning, wisdom and wit.

	// Slytherin: Ambición - Determinacion - Astucia
	// Slytherin values ambition, cunning, leadership, and resourcefulness
	private String name;
	private int maxStudent;
	private ArrayList<String> attributes;
	private ArrayList<Student> students;

	public hogwartsHouse(String name, int maxStudent) {
		this.name = name;
		this.maxStudent = maxStudent;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxStudent() {
		return this.maxStudent;
	}

	public void setMaxStudent(int maxStudent) {
		this.maxStudent = maxStudent;
	}

	public void addStudent(Student s) {
		if (this.students.size() < this.getMaxStudent() && !this.students.contains(s)) {
			this.students.add(s);
		}
	}

	public void addAttribute(String s) {
		if (!this.attributes.contains(s)) {
			this.attributes.add(s);
		}
	}

	public void removeAttribute(String s) {
		if (this.attributes.contains(s)) {
			this.attributes.remove(s);
		}
	}

	public String getAttributes() {
		String statement = "";
		for (String string : this.attributes) {
			statement += "\nAttribute: " + string;
		}
		return statement;
	}

}
