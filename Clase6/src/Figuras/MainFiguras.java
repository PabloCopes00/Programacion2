package Figuras;

public class MainFiguras {

	public static void imprimir(Figura ff) {
		System.out.println(ff.getNombre() + "\n" + ff.getArea() + "\n" + ff.getPerimetro() + "\n");
	}

	public static void main(String[] args) {

		// Figura f1 = new Figura();
		// al ser abstracta no se pueden crear instancias.
		imprimir(new Circulo(10));
		imprimir(new Triangulo(10, 10));
		imprimir(new Rectangulo(10, 10));
	}

}
