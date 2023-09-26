/*2. Búsqueda de documentos
Un historiador desea digitalizar sus documentos y organizarlos de acuerdo a palabras clave. 
Un documento tiene un título, una lista de autores, un contenido textual y una lista de palabras clave. 
El historiador necesita poder encontrar fácilmente documentos en su colección de acuerdo a diferentes criterios, por ejemplo:

a) Todos los documentos cuyo título sea exactamente igual a un título dado.  ---
b) Todos los documentos cuyo título contenga una palabra o frase dada. ---
c) Todos los documentos que contengan una palabra clave dada. ---
d) Todos los documentos que no contengan ninguna palabra clave. ---
e) Todos los documentos de un autor determinado. ---
f) Todos los documentos cuyo contenido tenga una palabra o frase dada.
g) Todos los documentos cuyo contenido tenga al menos 20 palabras.
h) Cualquier combinación lógica de las formas anteriores.*/

import java.util.ArrayList;

public class BuscadorDeDocumentos {
	private ArrayList<Documento> documentos;

	public BuscadorDeDocumentos() {
		this.documentos = new ArrayList<Documento>();
	}

	public void addDocuemnto(Documento d) {
		this.documentos.add(d);
	}

	public ArrayList<Documento> listarDocumentos(Buscador condicion) {
		ArrayList<Documento> resultado = new ArrayList<>();
		for (int i = 0; i < this.documentos.size(); i++) {
			Documento doci = this.documentos.get(i);
			if (condicion.cumple(doci))
				resultado.add(doci);
		}
		return resultado;
	}

}
