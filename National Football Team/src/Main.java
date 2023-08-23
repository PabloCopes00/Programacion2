import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		NationalTeam argentina = new NationalTeam();
		Player p1 = new Player("Lionel", "Messi", 12345353, LocalDate.of(1987, 06, 24), "Homebound", "Player",
				"Forward", "Zurdo", 817);
		Player p2 = new Player("Dibu", "Martinez", 5432532, LocalDate.of(1987, 06, 24), "Homebound", "Player",
				"Goalkeeper", "Diestro", 1);
		Player p3 = new Player("Nahuel", "Molina", 65425432, LocalDate.of(1987, 06, 24), "In transit", "Player",
				"Defender", "Zurdo", 3);
		Player p4 = new Player("Cuti", "Romero", 543255432, LocalDate.of(1987, 06, 24), "Concentrating", "Player",
				"Defender", "Diestro", 817);
		Player p5 = new Player("Nicolas", "Otamendi", 12345353, LocalDate.of(1987, 06, 24), "In transit", "Player",
				"Defender", "Zurdo", 817);
		Player p6 = new Player("Nicolas", "Tagliafico", 345678765, LocalDate.of(1987, 06, 24), "Homebound", "Player",
				"Defender", "Diestro", 817);
		Player p7 = new Player("Enzo", "Fernandez", 25436576, LocalDate.of(1987, 06, 24), "Homebound", "Player",
				"Midfielder", "Diestro", 817);
		Player p8 = new Player("Alexis", "Mac Allister", 324566743, LocalDate.of(1987, 06, 24), "In transit", "Player",
				"Midfielder", "Diestro", 817);
		Player p9 = new Player("Rodrigo", "De Paul", 324554654, LocalDate.of(1987, 06, 24), "Concentrating", "Player",
				"Midfielder", "Diestro", 817);
		Player p10 = new Player("Angel", "Di Maria", 235465, LocalDate.of(1987, 06, 24), "Concentrating", "Player",
				"Forward", "Diestro", 817);
		Player p11 = new Player("Julian", "Alvarez", 764523, LocalDate.of(1987, 06, 24), "Homebound", "Player",
				"Forward", "Diestro", 817);
		Coach c1 = new Coach("Leonel", "Scaloni", 324523, LocalDate.of(1980, 3, 23), "Homebound", "Coach", "Argentina");
		Physiotherapist ph1 = new Physiotherapist("Pablo", "Copes", 32604191, LocalDate.of(1986, 06, 23), "Homebound",
				"Physiotherapist", 1234, 10);
		argentina.addPerson(p1);
		argentina.addPerson(p2);
		argentina.addPerson(p3);
		argentina.addPerson(p4);
		argentina.addPerson(p5);
		argentina.addPerson(p6);
		argentina.addPerson(p7);
		argentina.addPerson(p8);
		argentina.addPerson(p9);
		argentina.addPerson(p10);
		argentina.addPerson(p11);
		argentina.addPerson(c1);
		argentina.addPerson(ph1);

		argentina.teamList();

	}
}
