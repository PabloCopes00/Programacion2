//Pila de elementos
//Implementar en Java una pila de elementos. A una pila se le pueden agregar elementos 
//utilizando el método push(Object o). Para retirar elementos de la pila se utiliza el método pop()
//que retorna el último elemento agregado y lo elimina de la misma. 
//Es posible consultar el tope de la pila sin eliminarlo utilizando el método top(). 
//La mencionada anteriormente es la única forma de consultar y retirar elementos de la pila, es decir, 
//no se pueden obtener ni consultar elementos de otra posición que no sea el tope de la pila. 
//Definir también los siguientes métodos:
//● size(): retorna la cantidad de elementos almacenados
//● copy(): retornar una nueva pila con una copia de los elementos de la pila original, en
//el mismo orden. La pila original debe mantener el orden de los elementos.
//● reverse(): retorna una copia de la pila pero con los elementos en el orden inverso.

import java.util.ArrayList;

public class Stack {

	private ArrayList<Object> stack;

	public Stack() {
		this.stack = new ArrayList<>();
	}

	public void push(Object o) {
		this.stack.add(o); // forma super pachorra sin pensar nada.
	}

	public Object pop() {
		int i = this.stack.size() - 1;
		return this.stack.remove(this.stack.get(i)); // forma super pachorra sin pensar mucho.
	}

	public Object top() {
		int i = stack.size() - 1;
		return stack.get(i); // forma pachorra sin pensar mucho.
	}

	public int size() {
		int count = 0;
		for (int i = 0; i < this.stack.size(); i++) {
			count++;
		}
		return count;// return this.stack.size();
	}

	public ArrayList<Object> copy() {
		ArrayList<Object> copy = new ArrayList<Object>();
		for (Object object : this.stack) {
			copy.add(object);
		}
		return copy;
	}

	public ArrayList<Object> reverse() {
		ArrayList<Object> copy = new ArrayList<Object>();
		for (int i = this.stack.size() - 1; i >= 0; i--) {
			copy.add(this.stack.get(i));
		}
		return copy;
	}

	public ArrayList<Object> reverse2() {

		for (int i = 0; i < stack.size() / 2; i++) {
			int size = this.stack.size() - 1;
			Object aux = this.stack.get(i);
			Object aux2 = this.stack.get(size - i); // revierte el array original y lo devuelve.
			this.stack.set(size - i, aux);
			this.stack.set(i, aux2);
		}
		return stack;
	}

	public static void main(String[] args) {
		Stack s = new Stack();

		s.push(1);
		s.push(12);
		s.push("hola");
		s.push("cuatro");
		s.push(false);
		s.push("ultimo");
		System.out.println(s.top());
		System.out.println(s.reverse());
		System.out.println(s.reverse2());
		System.out.println(s.top());

	}

}
