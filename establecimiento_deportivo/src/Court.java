
import java.time.LocalDateTime;

public class Court {
	private static final String FOOTBALL = "football";
	private static final String PADDLE = "paddle";
	private User user;
	private LocalDateTime date;

	private String type;
	private int typeQuantity;
	private int fee;

	public Court(User user, LocalDateTime date, int fee, String type) {
		this.user = user;
		this.date = date;
		this.type = type;
		this.fee = fee;
		this.typeQuantity = setTypeQuantity();
	}

	private int setTypeQuantity() {
		if (type.equals(FOOTBALL)) {
			return 2;
		} else if (type.equals(FOOTBALL)) {
			return 4;
		} else {
			return 0;
		}
	}

	public int getTypeQuantity() {
		return this.typeQuantity;
	}

	public User getUser() {
		return user;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
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

	@Override
	public boolean equals(Object o) {
		return this.getType().equals(((Court) o).getType());
	}

	@Override
	public String toString() {
		return this.getUser().getUserName() + " - " + this.getDate() + " - " + this.getType();
	}
}