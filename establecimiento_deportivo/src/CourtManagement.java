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
		if (c1.getType().equals(FOOTBALL))   // aca lo que hago es chequear si lo que me viene es una cancha de futbol o tennis
			s = FOOTBALL;                    // y lo guardo en la variable S
		else {
			s = PADDLE;
		}
		for (Court cc : court) {
			boolean check = cc.getType().equals(s);     // aca paso la variable S que es la que tome para chequear la cancha.
			if (check) {
				if (cc.getDate().isEqual(c1.getDate())) {  //si la fecha es la misma hago count++ para saber cuantas canchas tengo ese dia a esa hs.
					count++;                               //ya q tengo dos canchas al mismo tiempo de futbol y 4 de paddle.
				}
			}
		}
		if (c1.getTypeQuantity() == FCOURT && count < FCOURT) {    // aca con la cantidad que tiene la cancha si es igual a Fcourt significa q es una cancha de futbol
			return true;                                           // y si la cuent que chequeo arriba en count es menor a la cantidad de canchas que tengo mando true sino false.
		} else if (c1.getTypeQuantity() == PCOURT && count < PCOURT) { //aca lo mismo, si la cantidad de canchas equivale a pcourt (signofica q es una cancha de pa
			return true;                                            // si hay menos canchas de paddle de las que tengo que tener en ese horario retorno verdadero sino falseo
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
		String time = getTime(c);  //chequeo la fecha de de la cancha y la formateo mejor.
		if (checkCourt(c)) {  //chequeo si la cancha se puede agregar.
			court.add(c);  //la agrego
			c.getUser().setBookingCount(); // seteo el count de la persona para cuando tenga mas de 4 automaticamente sea miembro.
			System.out.println(c.getType() + " Court booked for the time slot " + time); // tiro mensaje de que se bookeo
		} else {
			System.out.println("There's no availability at " + time + " in " + c.getType()  //no hay cancha en ese horario.
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
