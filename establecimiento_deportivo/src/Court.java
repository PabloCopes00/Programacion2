
import java.time.LocalDateTime;

public class Court {

	private User user;

	private LocalDateTime date;
	private int fee;

	public Court(User user, LocalDateTime date) {
		this.user = user;
		this.date = date;
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

	public String getUserName() {
		return user.getName() +" "+ user.getLastName();
	}

	public User getUser() {
		return this.user;
	}

}

/*
  
 */