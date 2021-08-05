package blackJack;

public class Card {
	public int cardValue;
	public enum cardSuit{HEARTS("Hearts"),SPADES("Spades"),CLUBS("Clubs"),DIAMONDS("Diamonds");
		public final String string;
		cardSuit(String string) {this.string = string;}
		public String toString() {return string;}
	}
	public cardSuit suit;
	public Card(int cardValue, cardSuit s) {
		this.cardValue = cardValue;
		this.suit = s;

	}
	@Override
	public String toString(){
		String output = ""; 
		if (cardValue<11 && cardValue>1) {
			return (cardValue+" of "+ suit.toString());
		}
		if (cardValue==11){
			return ("Jack of "+suit.toString());
		}
		if (cardValue==12){
			return ("Queen of "+suit.toString());
		}
		if (cardValue==13){
			return ("King of "+suit.toString());
		}
		if (cardValue==1){
			return ("Ace of "+suit.toString());
		}
		return "ERROR!";
		
	}
}
