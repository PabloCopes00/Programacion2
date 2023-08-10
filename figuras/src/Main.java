public class Main {
    public static void main(String[] args) {
        Figura f1 = new Figura("Figura");
        Circulo c1 = new Circulo(22);
        Rectangulo r1 = new Rectangulo(10, 15);

        System.out.println(f1.getNombre());
        System.out.println(c1.getNombre());
        System.out.println(r1.getNombre());

    }

}
