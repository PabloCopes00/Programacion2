package Programacion2.gasto_publico;

public class Main {
    /*
     * Un país tiene que controlar el gasto público de las ciudades con más de
     * 100.000 habitantes. Para ello, tiene información del monto recaudado por
     * cada ciudad a través de cinco diferentes tipos de impuestos (denominados,
     * aquí, de imp1, imp2, imp3, imp4 e imp5) e información acerca de gastos
     * realizados en mantenimiento de la ciudad. Este país necesita un sistema que
     * le informe cuales son las ciudades que gastan más de lo que recaudan, y las
     * provincias que tienen mas de la mitad de las ciudades en condición de
     * déficit.
     * Consejo: Tener en cuenta la información que contienen los distintos
     * impuestos
     * Extra: ¿En que afecta el tamaño de la ciudad?
     */

    public static void main(String[] args) {

        City c1 = new City("Tandil", 250000);
        City c2 = new City("Tandilia", 99000);
        City c3 = new City("Tandilandia", 120000);
        City c4 = new City("Tandileofu", 140000);
        Province p1 = new Province("Buenos Aires");
        c1.setTax1(10000);
        c1.setTax2(10000);
        c1.setTax3(10000);
        c1.setTax4(10000);
        c1.setTax5(10000);
        c1.setExpenditure(45000);
        c2.setTax1(10000);
        c2.setTax2(4000);
        c2.setTax3(10000);
        c2.setTax4(6000);
        c2.setTax5(8000);
        c2.setExpenditure(50000);
        c3.setTax1(10000);
        c3.setTax2(10000);
        c3.setTax3(10000);
        c3.setTax4(10000);
        c3.setTax5(10000);
        c3.setExpenditure(55000);
        c4.setTax1(10000);
        c4.setTax2(10000);
        c4.setTax3(10000);
        c4.setTax4(10000);
        c4.setTax5(10000);
        c4.setExpenditure(65000);

        p1.addCity(c1);
        p1.addCity(c2);
        p1.addCity(c3);
        p1.addCity(c4);

        p1.cityReport();

    }

}
