


package card_games;
import java.util.Random;
import util.Input;

public class GameOfWar {
    public static Card[] cards = CardsArray.findAll();
//    public static Input input = new Input(System.in);
    public static Random randomCard = new Random();

    public static void main(String[] args) {
        showCards();
        System.out.println((int) Math.floor(Math.random() * 14 + 1));
        showMe();
    }

    public static void showCards() {
        for(Card card : cards) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }

    }
    public static void showMe(){
            System.out.println(cards[2].getValue() + " of " + cards[2].getSuit());

        }
}
