package ejercicio3;

/*3 Elementos Geométricos
Implementar la clase punto geométrico, la cual posee dos valores de coordenada X, Y.
El valor por defecto de los mismos es (0,0)
La funcionalidad que posee la clase es la siguiente:

● Desplazar el punto en el plano. Se encarga de trasladar el punto a otra posición
del plano. Para esto se incrementan los valores de X e Y en una cierta cantidad
(cierto desplazamiento en X y cierto desplazamiento en Y).

● Calcular la distancia euclídea. Dado un punto es posible establecer la distancia
euclídea con otro punto acorde a la siguiente formula:
 Distancia2
 = (X1 – X2)2+(Y1 – Y2)2
 La clase Math de Java define un método de clase sqrt para el cálculo de la raíz
cuadrada.
 */
public class PuntoGeometrico {

	private double x;
	private double y;

	// CONSTRUCTOR POR DEFECTO
	public PuntoGeometrico() {
		this.x = 0;
		this.y = 0;
	}

	// CONSTRUCTOR TOTAL
	public PuntoGeometrico(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void desplazar(double x, double y) {
		this.x += x;
		this.y += y;

	}


	public double calcularDistanciaEuclidea(double x, double y) {
		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

}
