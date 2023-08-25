public class Game {

    private Player p1;
    private Player p2;

    private DiceCup diceCup;

    private int winScore;
    private int gameLength;

    public Game(String p1Name, String p2Name, int cupQuantity) {
        this.p1 = new Player(p1Name);
        this.p2 = new Player(p2Name);
        this.winScore = 7;
        this.gameLength = 10;
        diceCup = new DiceCup(cupQuantity);
    }

    public String getP1() {
        return p1.getName();
    }

    public String getP2() {
        return p2.getName();
    }

    public String StartGame() {

        String statement = "\nEl mejor de " + gameLength + " Rondas, ganara!" +
                "\nJugador 1: " + p1.getName()
                + "\nJugador2: " + p2.getName() + "\n";
        System.out.println(statement);

        for (int i = 0; i < gameLength; i++) {
            int p1Roll = p1.playTurn(diceCup);
            int p2Roll = p2.playTurn(diceCup);
            if (p1Roll > winScore && (p1Roll > p2Roll)) {
                p1.addScore();
                System.out.println("Punto para " + p1.getName() + " " + p1Roll + " - " + p2Roll);
            } else if (p2Roll > winScore && (p2Roll > p1Roll)) {
                p2.addScore();
                System.out.println("Punto para " + p2.getName() + " " + p2Roll + " - " + p1Roll);

            } else {
                System.out.println("Emapte");
                ;
            }
        }

        if (p1.getScore() > p2.getScore()) {
            return "\nEl Ganador fue " + p1.getName() + "\nObtuvo " + p1.getScore() + " Puntos.\n" + p2.getName()
                    + " Obtuvo solamente " + p2.getScore();
        } else if (p2.getScore() > p1.getScore()) {
            return "\nEl Ganador fue " + p2.getName() + "\nObtuvo " + p2.getScore() + " Puntos.\n" + p1.getName()
                    + " Obtuvo solamente " + p1.getScore();
        } else {
            return "Empate! ninguno de los dos saco ventaja! hay que seguir jugando.";
        }
    }
}