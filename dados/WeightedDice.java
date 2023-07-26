package Programacion2.dados;

public class WeightedDice extends Dice {
    private int weightFace;

    public WeightedDice(int weightFace, int diceFaces) {
        super(diceFaces);
        this.weightFace = weightFace;
    }

    public int tthrow() {
        if (Math.random() > 0.5) {
            return super.tthrow();
        } else {
            return weightFace;
        }
    }
}
