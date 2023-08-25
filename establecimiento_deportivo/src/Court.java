
import java.time.LocalDateTime;

public class Court {

	private User user;
	private LocalDateTime date;

	private String type;
	private int fee;

	public Court(User user, LocalDateTime date, int fee, String type) {
		this.user = user;
		this.date = date;
		this.type = type;
		this.fee = fee;
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
	public String toString() {
		return this.getUser().getUserName() + " - " + this.getDate() + " - " + this.getType();
	}
}