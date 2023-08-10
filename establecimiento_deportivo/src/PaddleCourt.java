
import java.time.LocalDateTime;

public class PaddleCourt extends Court {
	private int fee;

	public PaddleCourt(User user, LocalDateTime date) {
		super(user, date);
		this.fee = 100;
	}

}
