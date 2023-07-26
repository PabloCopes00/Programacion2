package Programacion2.dados;

public class Player {

    private String name;
    private int score;
    // private int winRate;
    // private int loseRate;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addScore() {
        this.score++;
    }

    public int playTurn(Dice d1, Dice d2) {
        return d1.tthrow() + d2.tthrow();
    }

}
