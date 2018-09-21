package BlackJack;
import java.util.ArrayList;

public class Player {
	private ArrayList<Card> hands;
	
	public Player() {
		hands = new ArrayList<Card>();
	}
	
	//add card to the players hand
	public void setCard(Card c) {
		this.hands.add(c);
	}
	
	public int getTotalValue() {
		int totValue = 0;
		for(Card val: hands) {
			totValue = totValue + val.getValue();
		}
			return totValue;
	}
	
	// display cards on players hand
	public void hands() {
		for(Card c: hands) {
			if(c.equals(hands.get(hands.size() -1))) {
				System.out.print( c.getCard());
			}else {
				System.out.print( c.getCard() + ", ");
			}
		}
	}
	
	// get the number of cards in player's hand
	public int getSize() {
		return hands.size();
	}
	
	//Check if the player has 21
	public boolean HasPlayerWon() {
		if(getTotalValue() == 21) {
			return true;
		}
		return false;
	}
	
	// check if player has 22 or higher
	public boolean HasPlayerLost() {
		if(getTotalValue() == 22 || getTotalValue() > 21) {
			return true;
		}
		return false;
	}
	
}
