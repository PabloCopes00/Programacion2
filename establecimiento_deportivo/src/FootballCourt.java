import java.time.LocalDateTime;

public class FootballCourt extends Court {
	private int fee;

	public FootballCourt(User user, LocalDateTime date) {
		super(user, date);
		this.fee = 400;
	}

}
