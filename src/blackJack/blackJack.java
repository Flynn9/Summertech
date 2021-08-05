
package blackJack;
import java.util.Random;
import blackJack.Card.cardSuit;

public class blackJack {

	public static void main(String[] args) {
		Deck Deck1 = new Deck ();
		Deck1.shuffleDeck();
		System.out.println(Deck1);


	}
}
