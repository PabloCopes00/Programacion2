package Programacion2.dados;

public class Main {
    public static void main(String[] args) {
        String winner;
        Game j1 = new Game("Pablo", "Thiago");
        winner = j1.StartGame();
        System.out.println(winner);
    }
}
