package practicaPOO;

public class practicaPoo1 {

//	Creamos un paquete nuevo, dentro podemos crear varias clases.
//	para crear una clase tenemos que poner de la siguiente manera:
//	
//	public class Auto() {
//		atributos - (caracteristicas, propiedades.)
//	    constructor
//	    comportamiento
//	}
//	de esta forma estariamos creando objetos de tipo Auto.
//	para crear un objeto del tipo Auto, tendriamos que poner:
//	  clase  +  nombreObjeto   =  nuevo constructor de Auto.
//    Auto   +  audi           =  new Auto();
//	  Auto audi = new Auto();

	public static void main(String[] args) {
		Auto auto1 = new Auto("Audi", "Negro", 280, 0);
		Auto auto2 = new Auto("Ferrari", "Rojo", 360, 0); 
		Auto auto3 = new Auto("Ferrari", "Rojo", 370, 0);
		Auto auto4 = new Auto("Ferrari", "Rojo", 360, 0);
		System.out.println(auto1.toString());
		System.out.println(auto2.toString());
        System.out.println("son iguales los autos? 1 y 2?  " + auto1.equals(auto2));
        System.out.println("son iguales los autos? 2 y 3?  " + auto2.equals(auto3));
        System.out.println("son iguales los autos? 2 y 4?  " + auto2.equals(auto4));
	}

}
