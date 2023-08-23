import java.util.ArrayList;

import javax.swing.JOptionPane;

public class NationalTeam {
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

	public void drop(int p) {
		if (p > 0 && p < nationalTeam.size()) {
			nationalTeam.remove(p);
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

}
