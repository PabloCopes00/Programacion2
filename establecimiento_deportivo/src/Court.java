
import java.time.LocalDateTime;

public class Court {

	private CourtManagement m;

	protected static final String FOOTBALL = "football";
	protected static final String PADDLE = "paddle";
	private static final int PCOURT = CourtManagement.PCOURT;
	private static final int FCOURT = CourtManagement.FCOURT;
	private static final int PADDLEFEE = 200;
	private static final int FOOTBALLFEE = 400;
	private static final double DISCOUNT = 0.1;

	private User user;
	private LocalDateTime date;

	private String type;
	private int typeQuantity;
	private int fee;

	public Court(User user, LocalDateTime date, String type) {
		this.user = user;
		this.date = date;
		this.type = type;
		this.typeQuantity = setTypeQuantity();
		this.fee = setFee();
	}

	private int setTypeQuantity() {
		if (type.equals(FOOTBALL)) {
			return FCOURT;
		} else if (type.equals(FOOTBALL)) {
			return PCOURT;
		} else {
			return 0;
		}
	}

	public int setFee() {
		int q = getTypeQuantity();

		if (this.getTypeQuantity() == FCOURT) {
			if (this.getUser().isMember()) {
				return FOOTBALLFEE - (int) (FOOTBALLFEE * DISCOUNT);
			} else {
				return FOOTBALLFEE;
			}
		} else {
			if (this.getUser().isMember()) {
				return PADDLEFEE - (int) (PADDLEFEE * DISCOUNT);
			} else {
				return PADDLEFEE;
			}
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object o) {
		return (this.getType().equals(((Court) o).getType())
				&& this.getUser().getUserName().equals(((Court) o).getUser().getUserName()));
	}

	@Override
	public String toString() {
		return this.getUser().getUserName() + " - " + this.getDate() + " - " + this.getType();
	}
}