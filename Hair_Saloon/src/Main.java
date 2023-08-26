
//5 Peluquería
//Una peluquería desea implementar un sistema que le permita organizar a sus clientes. 
//La peluquería posee 4 peluqueros. Los clientes al solicitar un turno indican con cuál 
//peluquero se desean cortar. El sistema además de registrar los turnos, debe poder buscar 
//el primer turno disponible, también el primero disponible con un determinado peluquero. 
//A los clientes frecuentes se les descuenta un 10%. Se considera cliente frecuente al que 
//saca turno al menos una vez por mes. Consejo: Identificar similitudes y diferencias con 
//el establecimiento deportivo. Identificar los horarios de atención.
//Extra: ¿Qué sucede si un peluquero puede atender a dos clientes a la vez?

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		HairSaloon hs = new HairSaloon();
		Person pamela = new Person("Pamela", "chu", "Client");
		Person gabriela = new Person("Gabriela", "Gomez", "Client");
		Person juan = new Person("Juan", "Pelotas", "Stylyst");
		Appointment ap = new Appointment(LocalDateTime.of(2023, 8, 02, 8, 30), juan, pamela);
		Appointment ap2 = new Appointment(LocalDateTime.of(2023, 8, 02, 8, 30), juan, gabriela);

		hs.addAppoinment(ap);
		hs.AppointmentList();
		hs.addAppoinment(ap2);
		hs.deleteAppointment(ap);
		hs.addAppoinment(ap2);
		hs.AppointmentList();
	}
}
