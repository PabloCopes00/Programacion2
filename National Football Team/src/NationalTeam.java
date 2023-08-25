import java.util.ArrayList;

import javax.swing.JOptionPane;

public class NationalTeam {
	private static final String AVAILABLE = "available";
	private static final String UNAVAILABLE = "unavailable";

	ArrayList<Person> nationalTeam;

	public NationalTeam() {
		this.nationalTeam = new ArrayList<Person>();
	}

	public void addPerson(Person p) {
		if (nationalTeam.contains(p)) {
			JOptionPane.showMessageDialog(null, p.getName() + " " + p.getLastName() + " is already in the team.",
					"Alert", JOptionPane.WARNING_MESSAGE);
		} else {
			nationalTeam.add(p);
		}
	}

	public void drop(int n) {
		if (n > 0 && n < nationalTeam.size()) {
			nationalTeam.remove(n);
		}
	}

	public void deletePerson(Person p) {
		for (int i = 0; i < nationalTeam.size(); i++) {
			if (nationalTeam.get(i).equals(p)) {
				drop(i);
				String statement = p.getName() + " " + p.getLastName() + " was removed";
				System.out.println(statement);
			}
		}
	}

	public void teamList() {
		System.out.println("Team List:");
		for (Person person : nationalTeam) {
			System.out.println(person.toString());
		}
	}

	public void showList(String s) {
		System.out.println("\n" + s + " List:");
		for (Person person : nationalTeam) {
			if (person.getProffesion().contains(s))
				System.out.println(person.toString());
		}
	}

//	public void availableList() {
//		System.out.println("\nAvailable List:");
//		for (Person p : nationalTeam) {
//			if (p.checkAvailable()) {
//				System.out.println(p.toString());
//			}
//		}
//	}
//
//	public void notAvailableList() {
//		System.out.println("\nNot Available List:");
//		for (Person p : nationalTeam) {
//			if (!p.checkAvailable()) {
//				System.out.println(p.toString() + " - is " + p.getStatus());
//			}
//		}
//	}

	public void availableList(String s) {
		s.toLowerCase();
		if (s.equals(AVAILABLE)) {
			System.out.println("\nAvailable List:");
			for (Person p : nationalTeam) {
				if (p.checkAvailable()) {
					System.out.println(p.toString());
				}
			}
		} else if (s.equals(UNAVAILABLE)) {
			System.out.println("\nNot Available List:");
			for (Person p : nationalTeam) {
				if (!p.checkAvailable()) {
					System.out.println(p.toString() + " - is " + p.getStatus());
				}
			}
		}
	}
}
