package card_games;

public class Card {

    protected static int strength;
    protected static String suit;
    protected static String value;


    public Card(int strength, String suit, String value) {
        this.strength = strength;
        this.suit = suit;
        this.value = value;
    }

}