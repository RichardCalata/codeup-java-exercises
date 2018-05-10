

package card_games;

public class Card {
    public  int getStrength() {
        return strength;
    }

    public  String getSuit() {
        return suit;
    }

    public  String getValue() {
        return value;
    }

    protected  int strength;
    protected  String suit;
    protected  String value;


    public Card(int strength, String suit, String value) {
        this.strength = strength;
        this.suit = suit;
        this.value = value;
    }

}