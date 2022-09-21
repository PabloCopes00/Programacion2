package ejercicio4;

import java.util.ArrayList;

public class Temporada {

	private int temporada;
	private ArrayList<Episodio> episodio;

	public Temporada(int temporada) {
		this.temporada = temporada;
		this.episodio = new ArrayList<>();
	}

	public int getTemporada() {
		return temporada;
	}

	public int getCantEpisodios() {
		return this.episodio.size();
	}

	public int getCantEpisodiosFlag() {
		int contador = 0;
		for (int i = 0; i < this.episodio.size(); i++) {
			Episodio episodioActual = this.episodio.get(i);
			if (episodioActual.isFlag()) {
				contador++;
			}
		}

		return contador;
	}

	public int getCantidadEpisodios() {
		return this.episodio.size();
	}

	public double getCalifPromedio() {
		int suma = 0;
		int cant = 0;
		for (int i = 0; i < this.episodio.size(); i++)
			if (this.episodio.get(i).isFlag()) {
				suma += this.episodio.get(i).getCalificacion();
				cant++;
			}

		return (double) suma / cant;
	}

	public boolean isAllFlag() {
		return this.getCantidadEpisodios() == this.getCantEpisodiosFlag();
	}

	public ArrayList<Episodio> getEpisodio() {
		return episodio;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public void addEpisodio(Episodio e) {
		if (!this.episodio.contains(e)) {
			this.episodio.add(e);
		}
	}

}
