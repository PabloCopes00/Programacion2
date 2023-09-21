/*6 - Congreso de Ciencias de la Computación
El comité organizador de un Congreso de Ciencias de la Computación necesita un sistema que le ayude a asignar evaluadores 
de los trabajos enviados al congreso. Para esto cuenta con un conjunto de evaluadores, calificados como “generales” 
cuando conocen temas generales como algoritmos, lenguajes de programación, etc., o como evaluadores “expertos” cuando conocen 
temas específicos como agentes, visualización, redes de comunicación, etc. El sistema debe designar a un evaluador para cada
uno de los distintos trabajos enviados al congreso, existiendo diferentes categorías de trabajos: artículo, resumen y poster.
Cada trabajo posee un conjunto de palabras claves que definen los temas tratados en el trabajo.
Para asignar un evaluador a un trabajo, el sistema debe asegurarse que el evaluador es apto para evaluar el trabajo. 
Para determinar si un evaluador es apto para evaluar un trabajo, éste debe haber declarado conocimiento en todos los temas 
del trabajo, especificados en sus palabras claves. Para el caso de los posters, basta que el evaluador tenga conocimiento en 
uno de los temas del poster o sea en una de las palabras clave.

Implementar una solución orientada a objetos para este problema que permita determinar

1) qué evaluador puede asignarse a un determinado trabajo
2) qué trabajos pueden asignarse un evaluador particular
3) cuántos trabajos tiene un evaluador determinado
4) determinar si un evaluador dado es general o experto.*/

import java.util.ArrayList;

public class Congreso {
	private ArrayList<Evaluador> evaluadores;
	private ArrayList<Trabajo> trabajos;

	public Congreso() {
		this.evaluadores = new ArrayList();
		this.trabajos = new ArrayList();
	}

	public static void main(String[] args) {
		Congreso congreso = new Congreso();
		Evaluador evaluador1 = new Evaluador("Pablo");
		Evaluador evaluador2 = new Evaluador("Laura");
		Trabajo trabajo1 = new Trabajo("Programador Backend");
		Trabajo trabajo2 = new Trabajo("Programador Frontend");
		trabajo1.addTrabajo("Prog 1");
		trabajo1.addTrabajo("Prog 2");
		trabajo2.addTrabajo("Web 1");
		trabajo2.addTrabajo("Web 2");
		evaluador1.addConocimiento("Prog 1");
		evaluador1.addConocimiento("Prog 2");
		evaluador1.addConocimiento("Prog 3");
		evaluador2.addConocimiento("Web 1");
		evaluador2.addConocimiento("Web 2");
		evaluador2.addConocimiento("Web 3");

		System.out.println(evaluador1.puedeEvaluar(trabajo1));
		System.out.println(evaluador1.puedeEvaluar(trabajo2));
		System.out.println(evaluador2.puedeEvaluar(trabajo1));
		System.out.println(evaluador2.puedeEvaluar(trabajo2));

	}
}
