import java.time.LocalDate;

public class Player extends Person {
	private String position;
	private String dominantFoot;
	private int goalsScored;

	public Player(String name, String lastName, int pasport, LocalDate birthDate, String status, String proffesion,
			String position, String dominantFoot, int goalsScored) {
		super(name, lastName, pasport, birthDate, status, proffesion);
		this.position = position;
		this.dominantFoot = dominantFoot;
		this.goalsScored = goalsScored;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDominantFoot() {
		return dominantFoot;
	}

	public void setDominantFoot(String dominantFoot) {
		this.dominantFoot = dominantFoot;
	}

	public int getGoalsScored() {
		return goalsScored;
	}

	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}

	@Override
	public String toString() {
		return super.toString() + " - " + this.getPosition();
	}

}
