import java.time.LocalDate;

public class User extends Person {
	private String user;
	private String passwd;

	public User(String name, String lastName, LocalDate birthDate, String user, String passwd) {
		super(name, lastName, birthDate);
		this.user = user;
		this.passwd = passwd;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}
