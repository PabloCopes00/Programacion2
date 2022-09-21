package ejercicio3;
/*
Implementar la clase Rectángulo.

Para esta clase es necesario definir el rectángulo utilizando los puntos como vértices. Se
trabajará con Rectángulos cuyos lados estén paralelos a los ejes.
Nota. Definir la estructura que deber poseer un rectángulo y en base a esto implementar
los atributos de la clase.

La funcionalidad que debe proveer un rectángulo es la siguiente
● Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e
Y.
● Calcular el Área del rectángulo.
● Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son
iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el área
del mismo es mayor que la del otro.
● Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las
propiedades para que sea un cuadrado.
● Determinar el largo del lado superior.
● Determinar si está acostado o parado (si el alto es más que el ancho).*/

public class Rectangulo {
	private PuntoGeometrico v1;
	private PuntoGeometrico v2;
	private PuntoGeometrico v3;
	private PuntoGeometrico v4;

	// CONSTRUCTOR TOTAL
	public Rectangulo(PuntoGeometrico v1, PuntoGeometrico v2, PuntoGeometrico v3, PuntoGeometrico v4) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		this.v4 = v4;
	}

	public void desplazarRectangulo(double x, double y) {
		this.v1.desplazar(x, y);
		this.v2.desplazar(x, y);
		this.v3.desplazar(x, y);
		this.v4.desplazar(x, y);

	}

	public double calcularArea(PuntoGeometrico v1, PuntoGeometrico v2) {
		return this.v1.getX() - this.v2.getX() * this.v1.getY() - this.v2.getY();
	}

	public double calcularBase(PuntoGeometrico v1, PuntoGeometrico v2) {
		if (this.v1.getX() > this.v2.getX()) {
			return this.v1.getX() - this.v2.getX();
		} else{
			return this.v2.getX() - this.v1.getX();
		}

	}

	public double calcularAltura(PuntoGeometrico v1, PuntoGeometrico v2) {
		if (this.v1.getY() > this.v2.getY()) {
			return this.v1.getY() - this.v2.getY();
		} else {
			return this.v2.getY() - this.v1.getY();
		}
	}

	public double calcularAreaRectangulo() {
		double base, altura;
		if (this.v1.getY() == this.v2.getY()) {
			base = calcularBase(this.v1, this.v2);
			altura = calcularAltura(this.v1, this.v3);
		} else {
			altura = calcularAltura(this.v1, this.v2);
			base = calcularBase(this.v1, this.v3);
		}

		return base * altura;
	}

	public double compararRectangulos(Rectangulo rectangulo1, Rectangulo rectangulo2) {
		double rec1 = rectangulo1.calcularAreaRectangulo();
		double rec2 = rectangulo2.calcularAreaRectangulo();
		if (rec1 > rec2) {
			return 1;
		} else if (rec1 < rec2) {
			return -1;
		} else {
			return 0;
		}

	}

	public boolean esUnCuadrado(Rectangulo rec1) {
		double lado1, lado2;
		if (rec1.v1.getX() > rec1.v2.getX()) {
			lado1 = rec1.v1.getX() - rec1.v2.getX();
		} else {
			lado1 = rec1.v2.getX() - rec1.v1.getX();
		}
		if (rec1.v1.getY() > rec1.v2.getY()) {
			lado2 = rec1.v1.getY() - rec1.v2.getY();
		} else {
			lado2 = rec1.v2.getY() - rec1.v1.getY();
		}
		if (lado1 == lado2) {
			return true;

		} else {
			return false;

		}
	}

	// Determinar el largo del lado superior.
	public double largoLadoSuperior(Rectangulo rec1) {


		return 0;
	}

	public PuntoGeometrico getV1() {
		return this.v1;
	}

	public PuntoGeometrico getV2() {
		return this.v2;
	}

	public PuntoGeometrico getV3() {
		return this.v3;
	}

	public PuntoGeometrico getV4() {
		return this.v4;
	}

	public void setV1(PuntoGeometrico v1) {
		this.v1 = v1;
	}

	public void setV2(PuntoGeometrico v2) {
		this.v2 = v2;
	}

	public void setV3(PuntoGeometrico v3) {
		this.v3 = v3;
	}

	public void setV4(PuntoGeometrico v4) {
		this.v4 = v4;
	}

}
