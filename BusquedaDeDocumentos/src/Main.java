
public class Main {

	public static void main(String[] args) {
		BuscadorDeDocumentos buscadorDoc = new BuscadorDeDocumentos();
		Documento doc1 = new Documento("documento 1, el mejor de todos",
				"fuck fuck fuck Al contrario del pensamiento popular el texto de Lorem Ipsum no es simplemente texto aleatorio Tiene sus raices en una pieza clasica de la literatura del Latin que data del año 45 antes de Cristo haciendo que este adquiera mas de 2000 años de antiguedad Richard McClintock un profesor de Latin de la Universidad de Hampden-Sydney en Virginia encontró una de las palabras más oscuras de la lengua del latín consecteur en un pasaje de Lorem Ipsum y al seguir leyendo distintos textos del latín descubrió la fuente indudable Lorem Ipsum viene de las secciones 11032 y 11033 de de Finnibus Bonorum et Malorum Los Extremos del Bien y El Mal por Cicero escrito en el año 45 antes de Cristo Este libro es un tratado de teoría de éticas muy popular durante el Renacimiento");
		Documento doc2 = new Documento("documento 2, este esta un poco feo",
				"Aliquam in augue egestas Lorem lacus fuck finibus auctor Vestibulum quis velit ac lectus malesuada tempor a in quam Etiam vel viverra lacus Donec luctus nisi non finibus pharetra libero magna commodo");
		Documento doc3 = new Documento("documento 3, el peor documento de todos", "contenido corto fuck");

		doc1.addAutor("autor1");
		doc2.addAutor("autor2");
		doc3.addAutor("pablo");
		doc3.addAutor("matias");
		doc3.addAutor("copes");
		doc1.addPalabra("importante");
		doc1.addPalabra("dsa");
		doc1.addPalabra("messi");
		doc1.addPalabra("gol");
		doc1.addPalabra("Lorem");
		doc2.addPalabra("dios");
		doc2.addPalabra("diego");
		doc2.addPalabra("nose");
		doc2.addPalabra("fuck");
		doc3.addPalabra("messi");
		doc3.addPalabra("lala");
		doc3.addPalabra("redondos");
		buscadorDoc.addDocuemnto(doc1);
		buscadorDoc.addDocuemnto(doc2);
		buscadorDoc.addDocuemnto(doc3);
		// System.out.println(buscadorDoc.listarDocumentos(new
		// BuscadorContieneClave("messi"))); anda
		// System.out.println(buscadorDoc.listarDocumentos(new
		// BuscadorNoContieneClave("messi"))); anda
		// System.out.println(buscadorDoc.listarDocumentos(new
		// BuscadorContieneAutor("copes"))); anda
		// System.out.println(buscadorDoc.listarDocumentos(new
		// BuscadorPorContenido("fuck"))); anda
		// System.out.println(buscadorDoc.listarDocumentos(new
		// BuscadorTituloContiene("documento"))); anda

		/*
		 * System.out.println(buscadorDoc.listarDocumentos(new
		 * BuscadorTituloIgual("documento 1, el mejor de")));
		 * System.out.println(buscadorDoc.listarDocumentos(new
		 * BuscadorTituloIgual("documento 1, el mejor de todos"))); anda
		 */

		System.out.println(buscadorDoc.listarDocumentos(new BuscadorContenidoMasX("de", 18))); // sos groso loco!
	}
}
