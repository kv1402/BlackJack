package BlackJack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CardTest {

	@Test
	public void testCardContructor() {
		//check if the right values get added right
		Card card = new Card("H", "2");
		assertEquals("H", card.getSuit());
		assertEquals(2, card.getValue());
		assertEquals("H2", card.getCard());
	
		
		//Check with J, Q, K, and A
		Card card2 = new Card("S","J");
		assertEquals("S", card2.getSuit());
		assertEquals(10, card2.getValue());
		assertEquals("SJ", card2.getCard());
		
		Card card3 = new Card("D","Q");
		assertEquals("D", card3.getSuit());
		assertEquals(10, card3.getValue());
		assertEquals("DQ", card3.getCard());
		
		Card card4 = new Card("C","K");
		assertEquals("C", card4.getSuit());
		assertEquals(10, card4.getValue());
		assertEquals("CK", card4.getCard());
		
		Card card5 = new Card("H","A");
		assertEquals("H", card5.getSuit());
		assertEquals(11, card5.getValue());
		assertEquals("HA", card5.getCard());
		
		
		
		/* Test wrong suit - which is fail
		 * check which exception - in this case IllegalArgumentExcetpion
		 * if it is not it will go to next Exception (Which it should not)
		 * */
		
		try {
			card = new Card("H","1");
			fail("new Card(''H'',''12'') should result in IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		} catch (Exception e) {
			fail("Expected IllegalArgumentException was " + e.getClass());
		}
		//Testing 2
		try {
			card = new Card("A","2");
			fail("new Card(''A'',''2'') should result in IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		} catch (Exception e) {
			fail("Expected IllegalArgumentException was " + e.getClass());
		}
		
		//Testing 11
		try {
			card = new Card("H","11");
			fail("new Card(''H'',''11'') should result in IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		} catch (Exception e) {
			fail("Expected IllegalArgumentException was " + e.getClass());
		}
		
		//Testing 12
		try {
			card = new Card("H","12");
			fail("new Card(''H'',''12'') should result in IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		} catch (Exception e) {
			fail("Expected IllegalArgumentException was " + e.getClass());
		}
		
	}

}
