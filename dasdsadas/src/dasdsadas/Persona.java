package dasdsadas;


public class Persona {
    private String nombre;
    public Persona(String nombre) {
    	super();
        this.nombre = nombre;
    }
    public String toString() {
        return "Nombre: "+nombre;
    }
    public static void main(String[] args) {
		Persona dsa = new Persona("dsa");
		System.out.println(dsa);
	}
}
