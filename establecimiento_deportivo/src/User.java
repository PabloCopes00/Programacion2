
public class User {

	private static final int MEMBERSHIP_BOOKINGS = 4;

	private String name;
	private String lastName;
	private int id;
	private int bookingCount;
	private boolean member;

	public User(String name, String lastName, int id) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.bookingCount = 0;
		this.member = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getUserName() {
		return this.getName() + " " + this.getLastName();
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookingCount() {
		return bookingCount;
	}

	public void setBookingCount() {
		this.bookingCount++;
		if (bookingCount >= MEMBERSHIP_BOOKINGS) {
			this.setMember(true);
		}
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	@Override
	public String toString() {
		String member = "";
		member = (this.isMember()) ? " Active membership" : " Inactive membership";
		return this.getUserName() + member;
	}
}
