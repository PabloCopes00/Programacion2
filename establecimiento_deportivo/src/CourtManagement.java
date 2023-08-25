import java.util.ArrayList;

public class CourtManagement {
	private ArrayList<Court> court;

	private static final int PCOURT = 4;
	private static final int FCOURT = 2;
	private static final String FOOTBALL = "football";
	private static final String PADDLE = "paddle";

	public CourtManagement() {
		court = new ArrayList<Court>();
	}

	public void addCourt(Court c) {
		int h = c.getDate().getHour();
		int m = c.getDate().getMinute();
		String hour = (h < 10) ? "0" + h : "" + h;
		String minute = (m < 10) ? "0" + m : "" + m;
		String time = hour + ":" + minute;

		int pCount = 0;
		int fCount = 0;

		for (Court cc : court) {
			boolean check = (cc.getType().equals(FOOTBALL)) ? true : false;
			if (check) {
				if (cc.getDate().isEqual(c.getDate())) {
					fCount++;
				}
			} else {
				if (cc.getDate().isEqual(c.getDate())) {
					pCount++;
				}
			}
		}
		if (c.getType().equals(FOOTBALL))
			if (fCount < FCOURT) {
				court.add(c);
				c.getUser().setBookingCount();
				System.out.println("Court booked for the time slot " + time);
			} else {
				System.out.println("There's no availability at " + time + " , please book for another time slot.");
			}
		else {
			if (fCount < PCOURT) {
				court.add(c);
				c.getUser().setBookingCount();
				System.out.println("Court booked for the time slot " + time);
			} else {
				System.out.println("There's no availability at " + time + " , please book for another time slot.");
			}

		}
	}

	public void courtList() {

		for (Court cc : court) {
			cc.toString();
		}

	}
}
