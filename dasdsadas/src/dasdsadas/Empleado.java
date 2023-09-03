package dasdsadas;

public class Empleado extends Persona{
    private int legajo;
    public Empleado(String nombre, int legajo) {
        super(nombre);
        this.legajo = legajo;
    }
    public String toString(String empresa) {
        return super.toString() + " legajo: "+
                legajo + " empresa: "+empresa;
    }
    
    public static void main(String[] args) {
    	Empleado emp1 = new Empleado("Carmelo Garcia", 1234);
    	System.out.println(emp1);
    }
}
