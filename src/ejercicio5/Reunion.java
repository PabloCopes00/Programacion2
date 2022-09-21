package ejercicio5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Reunion {

	private String lugar;
	private String tema;
	private LocalDate fecha;
	private LocalTime hora;
	private ArrayList<Persona> arrPersonas;

	public Reunion(String lugar, String tema, LocalDate fecha, LocalTime hora) {
		this.lugar = lugar;
		this.tema = tema;
		this.fecha = fecha;
		this.hora = hora;
		this.arrPersonas = new ArrayList<>();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public String getTema() {
		return tema;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public ArrayList<Persona> getPersonas() {
		return arrPersonas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.arrPersonas = personas;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public void setFechaHorario(LocalDate fechaHorario) {
		this.fecha = fechaHorario;
	}

	public boolean hayConflictoDeFechaYhora(Reunion reunion) {
		return (this.fecha == reunion.getFecha() && this.hora == reunion.getHora());
	}

	public void addPersona(Persona e) {
		if (!this.arrPersonas.contains(e)) {
			this.arrPersonas.add(e);
		}
	}

	public String getNombre(int x) {
		return this.arrPersonas.get(x).getNombre(); // reveer este metodo.
	}

	@Override
	public String toString() {

		return "Lugar: " + this.lugar + ". \nTema: " + this.tema + ". \nFecha: " + this.fecha + ". \nHora: "
				+ this.hora;
	}

}
