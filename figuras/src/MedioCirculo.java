public class MedioCirculo extends Circulo {

    public MedioCirculo(double radio) {
        super(radio);
        this.setNombre("Medio Circulo");
    }

    public double getArea() {
        return super.getArea() / 2;
    }

}
