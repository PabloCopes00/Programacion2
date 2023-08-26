import java.util.ArrayList;

public class HairSaloon {
	private ArrayList<Appointment> appointment;

	public HairSaloon() {
		this.appointment = new ArrayList<Appointment>();
	}

	public void addAppoinment(Appointment app) {
		if (isTimeSlotAvailable(app)) {
			this.appointment.add(app);
			app.getClient().setAppointmentCount();
		} else {
			System.out.println(app.getHairStylist() + " is unavailable during that time. "
					+ "Kindly explore alternative time slots or consider reserving with a different stylist.");
		}
	}

	public boolean isTimeSlotAvailable(Appointment a) {
		for (Appointment appoint : appointment) {
			if (appoint.equals(a)) {
				return false;
			}
		}
		return true;
	}

	public void deleteAppointment(Appointment a) {
		int i = this.appointment.indexOf(a);
		appointment.remove(i);
	}

	public void AppointmentList() {
		System.out.println("\nAppointment List:");
		for (Appointment app : appointment) {
			System.out.println(app.toString());
		}
	}
}
