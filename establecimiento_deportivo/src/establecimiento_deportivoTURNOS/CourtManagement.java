package establecimiento_deportivoTURNOS;

import java.util.ArrayList;

public class CourtManagement {

	private ArrayList<Court> court;
	private ArrayList<User> user;
	private Turn turn;
	private static int membershipBookings = 4; // esto esta bien?
	private static int membershipMonth = 2;

	public CourtManagement(Turn turn) {
		this.court = new ArrayList<>();
		this.user = new ArrayList<>();
	}

	public Turn getTurn() {
		return turn;
	}

	public void setTurn(Turn turn) {
		this.turn = turn;
	}

	public static int getMembershipBookings() { // esto esta bien?
		return membershipBookings;
	}

	public void setMembershipBookings(int membershipBookings) { // esto esta bien?
		CourtManagement.membershipBookings = membershipBookings;
	}

	public static int getMembershipMonth() {
		return membershipMonth;
	}

	public static void setMembershipMonth(int membershipMonth) {
		CourtManagement.membershipMonth = membershipMonth;
	}

}
