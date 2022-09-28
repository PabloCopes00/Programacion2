package ejercicio5;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Reunion> arrReunion;

	public void setArrReunion(ArrayList<Reunion> arrReunion) {
		this.arrReunion = arrReunion;
	}

	public Agenda() {
		this.arrReunion = new ArrayList<>();
	}

	public ArrayList<Reunion> getArrReunion() {
		return arrReunion;
	}

	public void addReunion(Reunion e) {

//		if (!this.arrReunion.contains(e)) {
//			for (int i = 0; i < arrReunion.size(); i++) {
//				if (!this.arrReunion.get(i).hayconflictodefechaYHora(e)) {
//					this.arrReunion.add(e);
//				}
//				else {
//					System.out.println("No se pudo agregar la Reunion poruqe hay conflicto de horario");
//				}
//			}
//		}
	}

}
