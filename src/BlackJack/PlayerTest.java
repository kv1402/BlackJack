package BlackJack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {
	
	private Player winner = new Player();
	private Player loser = new Player();
	private Player p3 = new Player();
	private Player p4 = new Player();
	private Player p5 = new Player();
	
	
	@Test
	public void testSetCard() {
	
		Card card1HA = new Card("H","A");
		Card cardSA = new Card("S","A");
		Card cardC2 = new Card("C","2");
		Card cardC10 = new Card("C","10");
		Card cardC3 = new Card("C","3");
		Card cardC5 = new Card("C","5");
		Card cardD2 = new Card("D","2");
		
		//Check if this player has won with 2 cards
		winner.setCard(card1HA);
		winner.setCard(cardC10);
		assertEquals(21,winner.getTotalValue());
		assertEquals(2,winner.getSize());
		assertEquals(false, winner.HasPlayerLost());
		assertEquals(true, winner.HasPlayerWon());
		
		//Check if this player has lost with A's
		loser.setCard(card1HA);
		loser.setCard(cardSA);
		assertEquals(22,loser.getTotalValue());
		assertEquals(2,loser.getSize());
		assertEquals(true, loser.HasPlayerLost());
		assertEquals(false, loser.HasPlayerWon());
		
		// Check if player has won with 4 cards
		p3.setCard(cardC2);
		p3.setCard(cardC3);
		p3.setCard(cardC5);
		p3.setCard(card1HA);
		assertEquals(21,p3.getTotalValue());
		assertEquals(4,p3.getSize());
		assertEquals(false, p3.HasPlayerLost());
		assertEquals(true, p3.HasPlayerWon());

		// Check if player has lost with 5 cards with sum of 23
		p4.setCard(cardC2);
		p4.setCard(cardC3);
		p4.setCard(cardC5);
		p4.setCard(cardD2);
		p4.setCard(cardSA);
		assertEquals(23,p4.getTotalValue());
		assertEquals(5,p4.getSize());
		assertEquals(true, p4.HasPlayerLost());
		assertEquals(false, p4.HasPlayerWon());
		
		//Player has neither lost or won
		p5.setCard(cardC2);
		p5.setCard(cardC3);
		p5.setCard(cardC5);
		assertEquals(10,p5.getTotalValue());
		assertEquals(3,p5.getSize());
		assertEquals(false, p5.HasPlayerLost());
		assertEquals(false, p5.HasPlayerWon());
		
	}
	

}
