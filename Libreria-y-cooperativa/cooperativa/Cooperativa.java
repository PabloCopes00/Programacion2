package cooperativa;

import java.util.ArrayList;

public class Cooperativa {

	private ArrayList<Lote> lotes;
	private ArrayList<Cereal> cereales;
	private ArrayList<String> mineralesPrimarios;

	public boolean esEspecial(Lote lote) {
		for (int i = 0; i < this.mineralesPrimarios.size(); i++)
			if (lote.tieneMineral(this.mineralesPrimarios.get(i)))
				return true;

		return false;
	}

	public ArrayList<Cereal> listarCerealesPara(Lote lote) {
		ArrayList<Cereal> listado = new ArrayList<Cereal>();
		for (Cereal cereal : this.cereales) {
			if (lote.sePuedeSembrar(cereal))
				listado.add(cereal);
		}

		return listado;
	}

	public ArrayList<Lote> listarLotesPara(Cereal cereal) {
		ArrayList<Lote> listado = new ArrayList<Lote>();
		for (Lote lote : this.lotes) {
			if (cereal.sePuedeSembrarEn(lote))
				listado.add(lote);
		}

		return listado;
	}

}
