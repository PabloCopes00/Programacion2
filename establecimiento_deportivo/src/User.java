
public class User {

	private String name;
	private String lastName;
	private long id;
	private boolean member;

	public User(String name, String lastName, long id) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
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

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}
}
