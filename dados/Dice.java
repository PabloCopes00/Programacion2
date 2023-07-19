package Programacion2.dados;

public class Dice {
    private int diceFaces;
    private int lastThrow;

    public Dice(int diceFaces) {
        this.diceFaces = diceFaces;
        lastThrow = 0;
    }

    public int Throw() {
        lastThrow = (int) (((Math.random() * diceFaces) + 1));
        return lastThrow;
    }

    public int getLastThrow() {
        return lastThrow;
    }

}