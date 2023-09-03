
import java.time.LocalDateTime;

public class Court {
	protected static final String FOOTBALL = "football";
	protected static final String PADDLE = "paddle";
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
		this.typeQuantity = setTypeQuantity();  // refactorizar esto deberia ir en el management
		this.fee = setFee();  // refactorizar esto deberia ir en el management 
	}

	private int setTypeQuantity() {  //setea la cantidad, si es igual a football setea 2 sino 4.
		if (type.equals(FOOTBALL)) {
			return CourtManagement.FCOURT;
		} else if (type.equals(FOOTBALL)) {
			return CourtManagement.PCOURT;
		} else {
			return 0;
		}
	}

	public int setFee() {
		int q = getTypeQuantity();

		if (this.getTypeQuantity() == CourtManagement.FCOURT) {  //toma la cantidad y si es 2 y es miembro hace el descuento
			if (this.getUser().isMember()) {                    //sino da el precio completo. 
				return FOOTBALLFEE - (int) (FOOTBALLFEE * DISCOUNT);
			} else {
				return FOOTBALLFEE;
			}
		} else {
			if (this.getUser().isMember()) {
				return PADDLEFEE - (int) (PADDLEFEE * DISCOUNT);  //idem arriba.
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
	public boolean equals(Object o) {                 //chequea que el tipo de cancha sea el mismo y chequea que el usuario 
		return (this.getType().equals(((Court) o).getType()) //sea el mismo para saber que una cancha esta repetida
				&& this.getUser().getUserName().equals(((Court) o).getUser().getUserName()));
	}

	@Override
	public String toString() {  //redefinimos el toString para mostrar esto.
		return this.getUser().getUserName() + " - " + this.getDate() + " - " + this.getType();
	}
}