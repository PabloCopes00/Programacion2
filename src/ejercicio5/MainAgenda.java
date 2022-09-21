package ejercicio5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class MainAgenda {

	public static void main(String[] args) {

		Persona pablo = new Persona("Pablo", "pablocopes@gmail.com", 249454321);
		Persona pepe = new Persona("Pepe", "pepe@gmail.com", 223245532);
		Persona juan = new Persona("Juan", "Juan@gmail.com", 249465432);
		Persona susana = new Persona("Susana", "Susy@gmail.com", 24925432);
		Reunion reunion = new Reunion("Tandil, Mi casa", "Pizza, Birra y Faso", LocalDate.of(2022, 9, 7),
				LocalTime.of(20, 30));
		Reunion reunion1 = new Reunion("Tandil, Casa de Juan", "Pizza, Birra y Faso", LocalDate.of(2022, 9, 7),
				LocalTime.of(20, 30));

		Agenda agendaPablo = new Agenda();
		

	}

}