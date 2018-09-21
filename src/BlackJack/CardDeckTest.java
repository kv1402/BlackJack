package BlackJack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CardDeckTest {
	
	
	@Test
	public void testDeal() {
		
		Player p = new Player();
		CardDeck cards = new CardDeck();	
		
		//Check if it is 52 cards
		assertEquals(52,cards.getCardCount());
		
		//deal a card / remove it
		cards.deal(p);
		assertEquals(51,cards.getCardCount());
		
		//remove all card that are left
		for(int i = 0; i<51; i++) {
			cards.deal(p);
		}
		assertEquals(0,cards.getCardCount());
	}
	
	
	//getCardCoount

}
