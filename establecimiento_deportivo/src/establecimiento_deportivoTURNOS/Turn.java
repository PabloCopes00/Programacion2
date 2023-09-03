package establecimiento_deportivoTURNOS;

import java.time.LocalDateTime;

public class Turn {

	private LocalDateTime from;
	private LocalDateTime till;

	private int id;
	private static int idCount = 0;

	private Court court;
	private User user;

	public Turn(LocalDateTime from, LocalDateTime till, Court court, User user) {
		this.from = from;
		this.till = till;
		this.court = court;
		this.user = user;
		this.id = idCount;
		idCount++;
	}

	public int getId() {
		return id;
	}

	public LocalDateTime getFrom() {
		return from;
	}

	public void setFrom(LocalDateTime from) {
		this.from = from;
	}

	public LocalDateTime getTill() {
		return till;
	}

	public void setTill(LocalDateTime till) {
		this.till = till;
	}

	public User getUser() {
		return user;
	}

	@Override
	public boolean equals(Object o) {
		return this.getFrom().equals(((Turn) o).getFrom());
	}

}
