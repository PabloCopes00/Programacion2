import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {


		User pablo = new User("Pablo", "Copes", 432432);
		User juan = new User("Juan", "Perez", 765423);
		User laura = new User("Laura", "Gimenez", 8374893);

		PaddleCourt pc = new PaddleCourt(pablo, LocalDateTime.of(2023, 10, 10, 20, 00));
		FootballCourt fc = new FootballCourt(pablo, LocalDateTime.of(2023, 10, 10, 20, 00));
		PaddleCourt pc1 = new PaddleCourt(juan, LocalDateTime.of(2023, 10, 10, 21, 00));
		FootballCourt fc1 = new FootballCourt(juan, LocalDateTime.of(2023, 10, 10, 21, 00));
		PaddleCourt pc2 = new PaddleCourt(laura, LocalDateTime.of(2023, 10, 10, 20, 00));
		FootballCourt fc2 = new FootballCourt(laura, LocalDateTime.of(2023, 10, 10, 20, 00));

		CourtManagement cm = new CourtManagement();

		cm.addCourt(pc);
		cm.addCourt(fc);
		cm.addCourt(pc1);
		cm.addCourt(fc1);
		cm.addCourt(pc2);
		cm.addCourt(fc2);
		cm.courtBooked();

	}

}
