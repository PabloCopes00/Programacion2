package libreria;

import java.util.ArrayList;

public class Libreria {

	private ArrayList<Cliente> clientes;
	private ArrayList<Articulo> articulos;
	
	public Libreria() {
		this.clientes = new ArrayList<>();
		this.articulos = new ArrayList<>();
	}
	
	public void addCliente(Cliente cliente) {
		if (!this.clientes.contains(cliente))
			this.clientes.add(cliente); // FALTA DEFINIR EQUALS
	}
	
	public void addArticulo(Articulo articulo) {
		if (!this.articulos.contains(articulo))
			this.articulos.add(articulo);
	}
	
	public double getPrecio(Cliente cliente, Articulo articulo) {
		return articulo.getPrecio() - articulo.getPrecio() * cliente.getDescuento();
	}
	
	public ArrayList<Cliente> listarClientes(Articulo articulo) {
		ArrayList<Cliente> listado = new ArrayList<>();
		
		for (int i = 0; i < this.clientes.size(); i++) {
			Cliente clientei = this.clientes.get(i);
			if (clientei.leGusta(articulo))
				listado.add(clientei);
		}
		
		return listado;
			
	}
	
}
