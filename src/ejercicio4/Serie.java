package ejercicio4;

import java.util.ArrayList;

public class Serie {
	private String titulo;
	private String genero;
	private String creador;
	private String descripcion;
	private ArrayList<Temporada> temporada;
	
	public Serie(String titulo, String genero, String creador, String descripcion) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.descripcion = descripcion;
		this.temporada = new ArrayList<>();
	}
	
	public void addTemporada(Temporada newTemporada) {
		this.temporada.add(newTemporada);
	}
	
	public int getCantidadEpisodiosVistos() {
		int suma = 0;
		for (int i = 0; i < this.temporada.size(); i++)
			suma += this.temporada.get(i).getCantEpisodiosFlag();
		
		return suma;
	}
	
	public boolean isAllFlag() {		
		for (int i = 0; i < this.temporada.size(); i++)
			if (!this.temporada.get(i).isAllFlag()) {
				return false;				
			}
		
		return true;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public ArrayList<Temporada> getTemporada() {
		return temporada;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setTemporada(ArrayList<Temporada> temporada) {
		this.temporada = temporada;
	}
	
}
