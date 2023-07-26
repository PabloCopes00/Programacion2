package Programacion2.figuras;

public class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return 0; // aca simplificamos
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
