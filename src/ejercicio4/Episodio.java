package ejercicio4;

public class Episodio {

	private String titulo;
	private String descripcion;
	private int calificacion;
	private boolean flag;
	private static int maxValoracion = 5;
	private static int minValoracion = 1;

	public Episodio(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.calificacion = -1;
		this.flag = false;

	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setCalificacion(int calificacion) {
		if (calificacion <= maxValoracion && calificacion >= minValoracion) {
			this.calificacion = calificacion;
			this.setFlag(true);
		} else {
			System.out.println("La calficación es incorrecta, debe ser un valor entre 1 y 5.");
		}
	}

	public void setFlag(boolean flag) {
		this.flag = flag;

	}

	public static void setMaxValoracion(int maxValoracion) {
		Episodio.maxValoracion = maxValoracion;
	}

	public static void setMinValoracion(int minValoracion) {
		Episodio.minValoracion = minValoracion;
	}

}
