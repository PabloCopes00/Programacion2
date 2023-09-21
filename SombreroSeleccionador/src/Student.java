/*2- Modernizando el sombrero seleccionador
La Escuela Hogwarts de Magia y Hechicería decidió que era momento de reemplazar el sombrero seleccionador 
en la tradicional ceremonia de comienzo de año y ahora requiere de un sistema que permita realizar 
la asignación de alumnos a las diferentes casas. Cada una de las casas cuenta con un conjunto de cualidades 
que deben tener los alumnos para poder pertenecer a dicha casa y una cantidad máxima de alumnos que pueden aceptar. 
De esta forma, si la casa se encuentra llena, ya no puede recibir nuevos alumnos. De un alumno se conoce su nombre, 
su conjunto de cualidades y el conjunto de familiares que asisten a la escuela. 
Para que una casa pueda aceptar a un nuevo alumno, además de haber lugar, el alumno tiene que poseer todas 
las cualidades que la casa requiera. Es importante destacar que los alumnos pueden ser asignados como máximo a una única casa.
Algunas casas no se contentan con que los alumnos tengan todas las cualidades que requieren, 
sino que además en un afán de conservar los linajes de sangre pura, también exigen que el alumno cuente 
con un familiar que pertenezca en este momento a la misma casa. Y por último, hay casas que a lo largo de su historia 
se han encontrado enemistadas. En el caso en el que la casa tenga una enemistad con otra, además de exigir al alumno 
tener todas las cualidades, se debe controlar que dicho alumno no pueda ser aceptado por la casa enemiga.
Defina las clases para implementar una solución orientada a objetos para el problema e implemente en Java 
todos los métodos involucrados en asignar un alumno a una casa.
*/

import java.util.ArrayList;

public class Student {
	// De un alumno se conoce su nombre,
	// su conjunto de cualidades y el conjunto de familiares que asisten a la
	// escuela.
	private String name;
	private ArrayList<String> attribute;
	private ArrayList<Student> schoolRelative;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addAttribute(String s) {
		if (!this.attribute.contains(s)) {
			this.attribute.add(s);
		}
	}

	public void removeAttribute(String s) {
		if (this.attribute.contains(s)) {
			this.attribute.remove(s);
		}
	}

	public String getAttributes() {
		String statement = "";
		for (String string : this.attribute) {
			statement += "\nAttribute: " + string;
		}
		return statement;
	}

	public void addSchoolRelative(Student s) {
		if (!this.schoolRelative.contains(s)) {
			this.schoolRelative.add(s);
		}
	}

	public void removeSchoolRelative(Student s) {
		if (this.schoolRelative.contains(s)) {
			this.schoolRelative.remove(s);
		}
	}

	public String getSchoolRelative() {
		String statement = "";
		for (Student student : this.schoolRelative) {
			statement += "\nRelative: " + student.getName();
		}
		return statement;
	}

	@Override
	public String toString() {
		return "\nName: " + this.getName() + this.getAttributes() + this.getSchoolRelative();
	}

}
