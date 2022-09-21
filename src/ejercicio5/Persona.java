package ejercicio5;

public class Persona {

	private String nombre;
	private String mail;
	private long telefono;

	public Persona(String nombre, String mail, long telefono) {
		this.nombre = nombre;
		this.mail = mail;
		this.telefono = telefono;

	}

	public Persona() {
	}

	public String getNombre() {
		return nombre;
	}

	public String getMail() {
		return mail;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "\nNombre: " + nombre + " - Mail: " + mail + " - Telefono: " + telefono;
	}

}
