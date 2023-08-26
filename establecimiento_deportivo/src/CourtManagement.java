import java.util.ArrayList;

public class CourtManagement {
	private ArrayList<Court> court;

	protected static final int PCOURT = 4;
	protected static final int FCOURT = 2;
	private static final String FOOTBALL = Court.FOOTBALL;
	private static final String PADDLE = Court.PADDLE;

	public CourtManagement() {
		court = new ArrayList<Court>();
	}

	public boolean checkCourt(Court c1) {
		int count = 0;
		String s = "";
		if (c1.getType().equals(FOOTBALL))
			s = FOOTBALL;
		else {
			s = PADDLE;
		}
		for (Court cc : court) {
			boolean check = cc.getType().equals(s);
			if (check) {
				if (cc.getDate().isEqual(c1.getDate())) {
					count++;
				}
			}
		}
		if (c1.getTypeQuantity() == FCOURT && count < FCOURT) {
			return true;
		} else if (c1.getTypeQuantity() == PCOURT && count < PCOURT) {
			return true;
		}
		return false;
	}

	public String getTime(Court c) {
		int h = c.getDate().getHour();
		int m = c.getDate().getMinute();
		String hour = (h < 10) ? "0" + h : "" + h;
		String minute = (m < 10) ? "0" + m : "" + m;
		String time = hour + ":" + minute;
		return time;
	}

	public void addCourt(Court c) {
		String time = getTime(c);
		if (checkCourt(c)) {
			court.add(c);
			c.getUser().setBookingCount();
			System.out.println(c.getType() + " Court booked for the time slot " + time);
		} else {
			System.out.println("There's no availability at " + time + " in " + c.getType()
					+ " court, please book for another time slot.");
		}
	}

//	public void addCourt(Court c) {
//		int h = c.getDate().getHour();
//		int m = c.getDate().getMinute();
//		String hour = (h < 10) ? "0" + h : "" + h;
//		String minute = (m < 10) ? "0" + m : "" + m;
//		String time = hour + ":" + minute;
//
//		int pCount = 0;
//		int fCount = 0;
//
//		for (Court cc : court) {
//			boolean check = cc.getType().equals(FOOTBALL);
//			if (check) {
//				if (cc.getDate().isEqual(c.getDate())) {
//					fCount++;
//				}
//			} else {
//				if (cc.getDate().isEqual(c.getDate())) {
//					pCount++;
//				}
//			}
//		}
//		if (c.getType().equals(FOOTBALL))
//			if (fCount < FCOURT) {
//				court.add(c);
//				c.getUser().setBookingCount();
//				System.out.println("Court booked for the time slot " + time);
//			} else {
//				System.out.println("There's no availability at " + time + " , please book for another time slot.");
//			}
//		else {
//			if (fCount < PCOURT) {
//				court.add(c);
//				c.getUser().setBookingCount();
//				System.out.println("Court booked for the time slot " + time);
//			} else {
//				System.out.println("There's no availability at " + time + " , please book for another time slot.");
//			}
//
//		}
//	}

	public void delCourt(Court c) {
		int i = court.indexOf(c);
		try {
			this.court.remove(i);
		} catch (Exception e) {
			System.out.println("The Court was not found in the list.");
		}
	}

	public void courtList() {
		System.out.println("\nCourt List:");
		for (Court cc : court) {
			System.out.println(cc.toString());
		}
	}
	
	public void courtListTime() {
		System.out.println("\nCourt List:");
		for (Court cc : court) {
			System.out.println(cc.toString());
		}
	}
}
