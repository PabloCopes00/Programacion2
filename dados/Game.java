package Programacion2.dados;

public class Game {

    private Dice d1;
    private Dice d2;
    private Dice d3;
    private Dice d4;

    private Player p1;
    private Player p2;

    private int winScore;
    private int gameLength;

    public Game(String p1Name, String p2Name) {
        this.p1 = new Player(p1Name);
        this.p2 = new Player(p2Name);
        this.d1 = new Dice(6);
        this.d2 = new Dice(6);
        this.d3 = new Dice(6);
        this.d4 = new Dice(6);
        this.winScore = 7;
        this.gameLength = 10;
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
            int p1Roll = p1.playTurn(d1, d2);
            int p2Roll = p2.playTurn(d3, d4);
            if (p1Roll > winScore && (p1Roll > p2Roll)) {
                p1.addScore();
                System.out.println("Punto para " + p1.getName());
            } else if (p2Roll > winScore && (p2Roll > p1Roll)) {
                p2.addScore();
                System.out.println("Punto para " + p2.getName());

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

/*
 * Ya que muchos han pedido acceso a los videos de la cursada 2021, les
 * adjuntamos la lista completa de clases en videos. Igualmente esto es cursada
 * 2021, les recomendamos fuertemente que vayan a las clases en la medida de lo
 * posible y utilicen este material en caso de no poder asistir o a modo de
 * refuerzo. Ya que no les garantizamos que sea la misma clase, o incluso que
 * alteremos ordenes o temas
 * 
 * Clase 2021-08-19
 * 
 * https://www.youtube.com/watch?v=FqhtHA-w4uQ
 * 
 * Clase 2021-08-24
 * Parte 1 https://www.youtube.com/watch?v=nWhUhY8-FmM
 * Parte 2 https://www.youtube.com/watch?v=HKpMeNqEzVs
 * 
 * Clase 2021-08-26
 * Parte 1 https://www.youtube.com/watch?v=Kulegx-Vclw
 * Parte 2 https://www.youtube.com/watch?v=hoSox51zF9U
 * 
 * Clase 2021-08-31
 * https://www.youtube.com/watch?v=SQvXgnD7QHk
 * 
 * Clase 2021-09-02
 * Parte 1 https://www.youtube.com/watch?v=HOlh8Gb-bAs
 * Parte 2 https://www.youtube.com/watch?v=Gr4p8ayEsws
 * 
 * Clase 2021-09-07
 * https://www.youtube.com/watch?v=Ou0cy0B6jVo
 * 
 * Clase 2021-09-09
 * https://www.youtube.com/watch?v=dtzDv-Llbzs
 * 
 * 
 * Clase 2021-09-16
 * https://www.youtube.com/watch?v=RPXUiKiUgQU
 * 
 * Clase 2021-09-26
 * https://www.youtube.com/watch?v=vVGo_z-xR_4
 * 
 * Clase 2021-09-28
 * https://www.youtube.com/watch?v=BIEno80yUAI
 * 
 * Clase 2021-09-30
 * https://youtu.be/BIEno80yUAI
 * 
 * Clase 2021-10-05
 * https://www.youtube.com/watch?v=cdWYNmfGiLk
 * 
 * Clase 2021-10-07
 * Parte 1 https://www.youtube.com/watch?v=Vi1_POk4_7o
 * Parte 2 https://www.youtube.com/watch?v=bsiIcf9f1K0
 * 
 * Clase 2021-10-12
 * https://www.youtube.com/watch?v=N1ZVmxhJWFU
 * 
 * Clase 2021-10-21
 * https://www.youtube.com/watch?v=zzeZsguyWl0
 * 
 * Clase 2021-10-26
 * https://www.youtube.com/watch?v=a1GWrA8RnEM
 * 
 * Clase 2021-11-09
 * https://www.youtube.com/watch?v=0gEbNkaDMJU
 * 
 * Clase 2021-11-23
 * https://www.youtube.com/watch?v=I8U2au0XBu4
 * 
 */