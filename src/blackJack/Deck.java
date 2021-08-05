package blackJack;
import blackJack.Card;
import java.util.Random;
import java.util.ArrayList;

public class Deck {
	public Random r = new Random ();
	public ArrayList<Card> cardList = new ArrayList<Card>();
	public String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
	public Deck() {
		for (int valueGen = 1;valueGen<14;valueGen = valueGen+1) {
			for (Card.cardSuit suitGen: Card.cardSuit.values()) {
				cardList.add(new Card(valueGen, suitGen));
			}
		}
	}
	@Override
	public String toString(){
		String output = "";
		for (Card c:cardList) {
			output += c.toString() + "\n";
		}
		return output;
	}
	public Deck shuffleDeck() {
		r.nextInt(52);
		for (int x=0;x<cardList.size()*4;x++) {
			Card temp = cardList.remove(0);
			cardList.add(r.nextInt(cardList.size()), temp);

		}
		return this;
	}	
}
