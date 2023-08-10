import java.time.LocalDateTime;
import java.util.ArrayList;

public class CourtManagement {
	private ArrayList<FootballCourt> footballCourt;
	private ArrayList<PaddleCourt> paddleCourt;

	private final int pCourt = 4;
	private final int fCourt = 2;

	public CourtManagement() {

		paddleCourt = new ArrayList<PaddleCourt>();
		footballCourt = new ArrayList<FootballCourt>();

	}

//	public void addCourt(Object o) {
//		boolean checkP = false;
//		boolean checkF = false;
//		int i = 0;
//		int j = 0;
//		LocalDateTime ActualDT = ((Court) o).getDate();
//
//		if (o instanceof PaddleCourt) {
//			if (paddleCourt.size() < pCourt) {
//				while (!checkP && i < paddleCourt.size()) {
//					PaddleCourt actualCourt = this.paddleCourt.get(i);
//					if (ActualDT.isEqual(actualCourt.getDate())) {
//						checkP = true;
//						System.out.println("La cancha esta ocupada en este momento. " + actualCourt.getUserName()
//								+ " Debe buscar otro turno");
//					}
//					i++;
//				}
//				if (checkP) {
//					paddleCourt.add((PaddleCourt) o);
//				}
//
//			}
//		} else {
//			if (footballCourt.size() < fCourt) {
//				while (!checkF && j < footballCourt.size()) {
//					FootballCourt actualCourt = this.footballCourt.get(j);
//					if (ActualDT.isEqual(actualCourt.getDate())) {
//						checkF = true;
//						System.out.println("La cancha esta ocupada en este momento. " + actualCourt.getUserName()
//								+ " Debe buscar otro turno");
//					}
//					j++;
//				}
//				if (checkF) {
//					footballCourt.add((FootballCourt) o);
//				}
//			}
//		}
//	}

	public void addCourt(Object o) {
		LocalDateTime actualDT = ((Court) o).getDate();

		if (o instanceof PaddleCourt) {
			addCourtToArrayList((PaddleCourt) o, paddleCourt, pCourt, actualDT);
		} else if (o instanceof FootballCourt) {
			addCourtToArrayList((FootballCourt) o, footballCourt, fCourt, actualDT);
		}
	}

	private <T extends Court> void addCourtToArrayList(T court, ArrayList<T> courtList, int maxCourts,
			LocalDateTime actualDT) {
		boolean isAlreadyBooked = false;

		for (T existingCourt : courtList) {
			if (actualDT.isEqual(existingCourt.getDate())) {
				isAlreadyBooked = true;
				break;
			}
		}

		if (!isAlreadyBooked && courtList.size() < maxCourts) {
			courtList.add(court);
		} else if (isAlreadyBooked) {
			System.out.println(
					"La cancha está ocupada en este momento. " + court.getUserName() + " Debe buscar otro turno\n");
		}
	}

	public void removeCourt(Object o) {
		if (o instanceof PaddleCourt) {
			if (paddleCourt.contains(o)) {
				paddleCourt.remove(o);
			}

		} else {
			if (footballCourt.contains(o)) {
				footballCourt.remove(o);
			}
		}
	}

	public void courtBooked() {
		System.out.println("Reservas de Canchas:");
		System.out.println("Canchas de Paddle reservadas:");
		for (PaddleCourt court : paddleCourt) {
			System.out.println(court.getUserName());
		}
		System.out.println("\nCanchas de Futbol reservadas: ");
		for (FootballCourt court : footballCourt) {
			System.out.println(court.getUserName());
		}
	}
}
