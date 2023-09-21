public class Main {

	public static void main(String[] args) {
		Articulo libro1 = new Articulo("Rayuela", "Cortazar", "...", 4500, 500);
		libro1.addGenero("novela");

		Cliente ariel = new ClienteExigente("Ariel", 28, "Tandil", 0.1);
		ariel.addAutor("Cortazar");
		ariel.addGenero("novela2");

		ariel.addCompra(libro1);

		Articulo libro2 = new Articulo("Rayuela", "Cortazar", "...", 4500, 500);
		libro2.addGenero("novela");

		System.out.println("Ya compro: " + ariel.yaCompro(libro2));

		System.out.println(ariel.leGusta(libro2));

		Libreria alfa = new Libreria();
		alfa.addArticulo(libro1);

		alfa.addCliente(ariel);

		Cliente sole = new Cliente("Sole", 40, "", .2);
		sole.addAutor("Garcia Marquez");

		Articulo libro3 = new Articulo("Cien A�os de Soledad", "Garcia Marquez", "...", 4500, 400);
		libro3.addGenero("Realismo Magico");

		alfa.addCliente(sole);

		System.out.println(alfa.listarClientes(libro3));
	}

}