public class City {

    private String name;
    private int population;

    private double tax1;
    private double tax2;
    private double tax3;
    private double tax4;
    private double tax5;
    private double expenditure;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
        this.tax1 = 0;
        this.tax2 = 0;
        this.tax3 = 0;
        this.tax4 = 0;
        this.tax5 = 0;
        this.expenditure = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population += population;
    }

    public double getTax1() {
        return tax1;
    }

    public void setTax1(double tax1) {
        this.tax1 += tax1;
    }

    public double getTax2() {
        return tax2;
    }

    public void setTax2(double tax2) {
        this.tax2 += tax2;
    }

    public double getTax3() {
        return tax3;
    }

    public void setTax3(double tax3) {
        this.tax3 += tax3;
    }

    public double getTax4() {
        return tax4;
    }

    public void setTax4(double tax4) {
        this.tax4 += tax4;
    }

    public double getTax5() {
        return tax5;
    }

    public void setTax5(double tax5) {
        this.tax5 += tax5;
    }

    public double getExpenditure() {
        return expenditure;
    }

    public void addExpenditure(double expenditure) {
        this.expenditure += expenditure;
    }

    public double totalIncome() {
        return this.tax1 + this.tax2 + this.tax3 + this.tax4 + this.tax5;
    }

    public void setExpenditure(double expenditure) {
        this.expenditure += expenditure;
    }

}
