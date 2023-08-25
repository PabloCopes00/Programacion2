import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {

		User pablo = new User("Pablo", "Copes", 432432);
		User juan = new User("Juan", "Perez", 765423);
		User laura = new User("Laura", "Gimenez", 8374893);

		Court pc = new Court(pablo, LocalDateTime.of(2023, 10, 10, 20, 00), "football");
		Court pc1 = new Court(pablo, LocalDateTime.of(2023, 10, 10, 20, 00), "football");
		Court pc2 = new Court(pablo, LocalDateTime.of(2023, 10, 10, 20, 00), "football");
		Court pc3 = new Court(pablo, LocalDateTime.of(2023, 10, 10, 21, 00), "football");
		Court pc4 = new Court(pablo, LocalDateTime.of(2023, 10, 10, 21, 00), "football");
		Court pc5 = new Court(pablo, LocalDateTime.of(2023, 10, 10, 21, 00), "football");

		CourtManagement cm = new CourtManagement();
		CourtManagement cm1 = new CourtManagement();

		cm.addCourt(pc);
		cm.addCourt(pc1);
		cm.courtList();
		cm.addCourt(pc2);
		System.out.println("Es miembro? " + pablo.isMember());
		cm.addCourt(pc3);
		cm.addCourt(pc4);
		cm.addCourt(pc5);
		System.out.println("Es miembro? " + pablo.isMember());
	}

}
