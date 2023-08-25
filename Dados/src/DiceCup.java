public class DiceCup {
    private Dice[] diceCup;

    public DiceCup(int quantity) {
        diceCup = new Dice[quantity];
        for (int i = 0; i < this.diceCup.length; i++) {
            diceCup[i] = new Dice(6);
        }
    }

    public int tthrow() {
        // delegar responsabilidad
        int suma = 0;
        for (int i = 0; i < diceCup.length; i++) {
            suma += diceCup[i].tthrow();
        }
        return suma;
    }

    public Dice getDiceInCup(int i) {
        if ((i >= 0) && (i < diceCup.length)) {
            return diceCup[i];
        } else {
            return null;
        }
    }

    public void setDiceInCup(int i, Dice nnew) {
        if ((i >= 0) && (i < diceCup.length) && (nnew != null)) {
            diceCup[i] = nnew;
        }
    }
}
