
/*Una cooperativa de agricultores requiere un sistema que le aconseje cuáles son los cereales que puede sembrar en 
 * un determinado lote y qué lotes pueden ser utilizados para sembrar un determinado cereal. Para poder sembrar un cereal 
 * en un lote, éste debe contener determinados minerales. Los cereales se clasifican en granos de cosecha gruesa 
 * (como girasol, maíz,...), granos de cosecha fina (como trigo, avena,..) y pasturas (como alfalfa, trébol subterráneo,..). 
 * Un lote satisface los requerimientos de un cereal si contiene todos los minerales que requiere ese cereal. Para el caso de 
 * las pasturas, poseen la restricción adicional de no poder sembrarse en lotes menores a una superficie de 50 hectáreas.
Adicionalmente, los lotes son clasificados como “especiales” cuando contienen ciertos minerales de interés primario para 
la cooperativa, y “comunes” cuando contienen sólo minerales secundarios en la composición de la tierra. 
La cooperativa debe poder consultar si un lote es común o especial.
Implementar una solución orientada a objetos para este problema que permita determinar:
1) qué cereales pueden sembrarse en un determinado lote
2) en qué lotes se puede sembrar un determinado cereal
3) determinar si un lote dado es “especial” o “común”.*/
import java.util.ArrayList;

public class Cereal {

	private String nombre;
	private ArrayList<String> minerales;

	public Cereal(String nombre) {
		this.nombre = nombre;
		this.minerales = new ArrayList<String>();
	}

	public void addMineral(String mineral) {
		this.minerales.add(mineral);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getMinerales() {
		return new ArrayList<>(this.minerales);
	}

	public boolean sePuedeSembrarEn(Lote lote) {
		for (int i = 0; i < this.minerales.size(); i++) {
			String minerali = this.minerales.get(i);
			if (!lote.tieneMineral(minerali))
				return false;
		}
		return true;
	}

	public boolean necesitaMineral(String mineral) {
		return this.minerales.contains(mineral);
	}

}
