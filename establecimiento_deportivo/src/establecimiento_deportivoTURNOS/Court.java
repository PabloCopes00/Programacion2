package establecimiento_deportivoTURNOS;

import java.util.ArrayList;

public class Court {

	private int fee;
	private ArrayList<Turn> turn;
	private String type;

	public Court(int fee, String type) {
		this.fee = fee;
		this.type = type;
		this.turn = new ArrayList<>();
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void addTurn(Turn t) {
		if (!turn.contains(t)) {
			turn.add(t);
		}
	}
}
