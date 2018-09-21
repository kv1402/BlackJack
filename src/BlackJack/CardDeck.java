package BlackJack;
import java.util.ArrayList;
import java.util.Collections;


  class CardDeck {
	private static final String[] arrSuit = {"C","D","H","S"};
	private static final String[] arrValue= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	
	//array with cards
	private ArrayList<Card> cards;
	
	//Constructor which creates a card deck
	public CardDeck() {
		cards = new ArrayList<Card>();		
		for(String t: arrSuit) {
			for(String v: arrValue) {
				Card card = new Card(t,v);
				cards.add(card);
			}
		}
		Collections.shuffle(cards);
	}
	
	//Constructor 2
	//src/BlackJack/file.txt
	public CardDeck(String filename) {
		cards = new ArrayList<Card>();
		
		ReadCard r = new ReadCard();
		r.openFile(filename);
		r.readFile();
		r.closeFile();
		String [] as = r.printCardDeck();
		
		for (String c: as) {
			String suit = c.substring(0,1);
			String value = c.substring(1); 
			Card card = new Card(suit,value);
			cards.add(card);
		}
	}
	
	//deal the card, starting from the end of the array, and then remove one card from the array
	public void deal(Player hand) {
		hand.setCard(cards.remove(cards.size()-1));
		
	}
	
	//Check the size of the deck
	public int getCardCount() {
		return cards.size();
	}
	
	
	public ArrayList<Card> getCardDeck(){
		return cards;
	}
	
}
