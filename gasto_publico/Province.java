package Programacion2.gasto_publico;

import java.util.ArrayList;

public class Province {

    private String name;
    private ArrayList<City> city;
    private int population;

    private double expenditure;

    public Province(String name) {
        this.name = name;
        this.expenditure = 0;
        this.population = 0;
        this.city = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<City> getCity() {
        return city;
    }

    public void addCity(City c) {
        this.city.add(c);
        this.population += c.getPopulation();
    }

    public double getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(double expenditure) {
        this.expenditure += expenditure;
    }

    public int cityReport() {
        double balance = 0;
        int count = 0;
        // controlar el gasto publico de las ciudades que tienen mas de 100mil
        // habitantes. si tiene mas de 100mil, controlar la diferencia entre lo que se
        // gasta y lo que entra.
        for (int i = 0; i < this.city.size(); i++) {
            City actualCity = this.city.get(i);
            boolean check = populationMore100k(actualCity);
            if (check) {
                balance = getBalance(actualCity);
                if (balance < 0) {
                    count++;
                    System.out.println("\n" + actualCity.getName() + " (Provincia de " + this.getName()
                            + ") Tiene Balance Negativo, su ingreso es de: "
                            + actualCity.totalIncome() + "\nSu gasto de: " + actualCity.getExpenditure()
                            + "\nEsto nos deja un saldo negativo de: " + getBalance(actualCity));
                }
            }
        }
        return count;
    }

    private double getBalance(City c) {
        return c.totalIncome() - c.getExpenditure();
    }

    private boolean populationMore100k(City c) {
        int requirement = 100000;
        boolean checked = false;
        if (c.getPopulation() > requirement) {
            checked = true;
        }
        return checked;
    }

}