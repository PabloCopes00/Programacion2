package establecimiento_deportivoTURNOS;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class User {

	private String name;
	private String lastName;
	private int id;
	private static int idCount = 1;
	private int bookingCount;
	private boolean member;
	private ArrayList<Turn> turn; // si puedo bookear un turno, se agrega a mi arraylist de turnos.

	public User(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
		this.id = idCount;
		this.bookingCount = 0;
		this.member = false;
		this.turn = new ArrayList<Turn>();
		idCount++;
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

	public String getFullName() {
		return this.getName() + " " + this.getLastName();
	}

	public long getId() {
		return id;
	}

	public int getBookingCount() {
		return bookingCount;
	}

	public void setBookingCount() {
		this.bookingCount++;

	}

	public void addTurn(Turn t) {
		if (!turn.contains(t)) {
			turn.add(t);
		}
	}

	public void setMember() {
		if (checkMembership()) {
			this.member = true;
		}
	}

	public boolean isMember() {
		return member;
	}

//	private boolean checkMembership() {
//		int bookedT = 0;
//		int dateNow = LocalDateTime.now().getDayOfMonth();
//		for (Turn turnX : turn) {
//			int dateTurn = turnX.getFrom().getDayOfMonth();
//			if (dateTurn == dateNow || dateTurn == dateNow - 1) {
//				bookedT++;
//			}
//		}
//		return (bookedT >= CourtManagement.getMembershipBookings()) ? true : false;
//	}

	private boolean checkMembership() { // opcion 2
		int bookedT = 0;
		LocalDateTime dateNow = LocalDateTime.now(); // chequeo el mes de hoy y el mes de dos meses atras q me pasa el
														// managment.
		LocalDateTime monthMember = dateNow.minusMonths(CourtManagement.getMembershipMonth()); // esto esta bien?

		for (Turn turnX : turn) {
			if (turnX.getFrom().isAfter(monthMember) && turnX.getFrom().isBefore(dateNow)) {
				bookedT++; // sumo 1 si esta entre estas fechas.
			}
		}
		if (bookedT >= CourtManagement.getMembershipBookings()) { // esta bien esto?
			return true; // si tiene mas de lo q me dice la cancha q tiene q tener, retorno q es miembro,
							// sino no.
		}
		return false;
	}

	@Override
	public String toString() {
		String member = (this.isMember()) ? " - Active Member" : " - Inactive Member";
		return this.getFullName() + member;
	}
}
