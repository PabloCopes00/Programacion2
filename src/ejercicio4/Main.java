package ejercicio4;

public class Main {

	public static void main(String[] args) {

		Episodio episodio1 = new Episodio("TituloEpisodio1", "Descripcion del Episodio 1");
		Episodio episodio2 = new Episodio("TituloEpisodio2", "Descripcion del Episodio 2");
		Episodio episodio3 = new Episodio("TituloEpisodio3", "Descripcion del Episodio 3");
		Episodio episodio4 = new Episodio("TituloEpisodio4", "Descripcion del Episodio 4");

		Temporada temporada1 = new Temporada(1);
		temporada1.addEpisodio(episodio1);
		temporada1.addEpisodio(episodio2);
		temporada1.addEpisodio(episodio3);
		temporada1.addEpisodio(episodio4);

		Serie serie1 = new Serie("Titulo de mi siere", "Genero de mi serieAccion", "Creador de la serie: Pablo Copes",
				"Descripcion de mi serie bla bla");
		serie1.addTemporada(temporada1);

		episodio1.setCalificacion(5);
		episodio2.setCalificacion(4);

		System.out.println("Cantidad de episodios vistos: " + serie1.getCantidadEpisodiosVistos());
		System.out.println("Se vieron todos los capitulos al dia de la fecha? " + serie1.isAllFlag());

		episodio3.setCalificacion(2);
		episodio4.setCalificacion(4);

		System.out.println("Cantidad de episodios vistos: " + serie1.getCantidadEpisodiosVistos());
		System.out.println("Se vieron todos los capitulos al dia de la fecha? " + serie1.isAllFlag());

		System.out.println("Cuantos Episodios se vieron de la serie? " + serie1.getCantidadEpisodiosVistos());
		System.out.println("Se vieron todos los episodios? " + serie1.isAllFlag());
		System.out.println("Cual es la calificacion promedio de los episodios vitos? " + temporada1.getCalifPromedio() + "/5");
		

	}
}
