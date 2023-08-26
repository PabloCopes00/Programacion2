import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Appointment {
	private static final int FEE = 3500;
	private static final double DISCOUNT = 0.1;
	private LocalDateTime date;
	private Person hairStylist;
	private Person client;
	private int payment;

	public Appointment(LocalDateTime date, Person hairStylist, Person client) {
		this.date = date;
		this.hairStylist = hairStylist;
		this.client = client;
		this.payment = setPayment();
	}

	public String getDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return this.date.format(formatter);

	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Person getHairStylist() {
		return hairStylist;
	}

	public void setHairStylist(Person hairStylist) {
		this.hairStylist = hairStylist;
	}

	public Person getClient() {
		return client;
	}

	public void setClient(Person client) {
		this.client = client;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public int setPayment() {
		if (this.getClient().isMember()) {
			return FEE - (int) (FEE * DISCOUNT);
		} else {
			return FEE;
		}
	}

	@Override
	public String toString() {
		return this.getClient() + " - " + this.getDate();
	}

	@Override
	public boolean equals(Object o) {
		return (this.getDate().equals(((Appointment) o).getDate())
				&& this.getHairStylist().equals(((Appointment) o).getHairStylist()));
	}
}