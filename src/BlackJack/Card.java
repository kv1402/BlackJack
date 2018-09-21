package BlackJack;

public class Card {
	
	// 1-10, J, Q, K, and A
	private String value;
	
	// Spades (S), Hearts (H), Diamonds (D), and Clubs (C)
	private String suit;
	
	// set of suits
	public final static String SUITS = "SHDC";
	
	// Initialize cards
	public Card(String suit, String value) {
		
		int val = valueFromStringToInt(value);
		if(value.equals("11") || value.equals("12")) { // because of val > 12
			throw new IllegalArgumentException(suit + " is an illegal suit!");
		}
		if(SUITS.indexOf(suit) < 0) {
				throw new IllegalArgumentException(suit + " is an illegal suit!");
		}else if(val < 2 ||val > 12  ) {
			throw new IllegalArgumentException(value + " is an illegal value!");
		}
		
		this.value = value;
		this.suit = suit;
	}

	//Get the value as an int and also it convert from string to int 2-10, J, Q, K, and A
	public int getValue() { 	
		if(value.equals("J") || value.equals("Q") || value.equals("K")) {
			return 10;
		}else if(value.equals("A")) {
			return 11;
		}else {
			return Integer.parseInt(value);
		}
	}
	
	public String getSuit() {
		return this.suit;
	}
	
	//Return suit and value as a string
	// Method used in Player
	public String getCard() {
		return suit + value;
	}
	
	//Help method to convert value 2-10, J, Q, K, and A to integer 2-10, 10, and 11
	public static int valueFromStringToInt(String value) {
		if("JQK".contains(value)) {
			return 10;
		}else if("A".equals(value)) {
			return 11;
		}else{
			return Integer.parseInt(value);
		}
	}
	
}
