import java.util.ArrayList;

public class Country {
    private String name;
    private int population;
    private int expenditure;
	private ArrayList<Province> province;

    public Country(String name) {
        this.name = name;
        this.population = 0;
        this.expenditure = 0;
        this.province = new ArrayList<>();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(int expenditure) {
        this.expenditure = expenditure;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void addProvince(Province p) {
        this.province.add(p);
        this.population += p.getPopulation();
    }

    public void provinceReport() {
        int aux;
        for (int i = 0; i < this.province.size(); i++) {
            Province actualProv = this.province.get(i);
            aux = actualProv.cityReport();
            if (aux >= actualProv.getCity().size() / 2) {
                System.out.println("\n"+actualProv.getName() + " Tiene mas de la mitad de sus provincias en deficit.");
            }
        }

    }

}
