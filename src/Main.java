public class Main {
    public static void main(String[] args) {
        // Lägg till tre nya metoder i Card klassen vi skapade tidigare.
        //  - toString
        //  - equals
        //  - change


    }
}

class Card {
    static final int CLUBS = 0;
    static final int DIAMONDS = 1;
    static final int HEARTS = 2;
    static final int SPADES = 3;

    int suit;
    int rank;

    @Override
    public String toString() {

    }

    @Override
    public boolean equals(Object o) {

    }

    void change(int suit, int rank) {

    }
}