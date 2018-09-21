package BlackJack;

public class BlackJack {
	

	public static void main(String args[]) {
		String winner = "";
		
		//Create a card deck; can also use import a file with cards
		//CardDeck cardDeck = new CardDeck();
		CardDeck cardDeck = new CardDeck("src/BlackJack/file.txt");
		
		//Create players: Sam and Dealer
		Player sam = new Player();
		Player dealer = new Player();
		
		//sam and dealer get two cards
		cardDeck.deal(sam);
		cardDeck.deal(dealer);
		cardDeck.deal(sam);
		cardDeck.deal(dealer);
		
		//Check if Sam has won - set winner = sam
		if(sam.HasPlayerWon()) {
			winner = "sam"; 	
		}else if(sam.HasPlayerLost()) { // set winner dealer - if sam has lost
			winner = "dealer";
		}else {
			// if sam's value is not higher than 17 pick a card
			while(sam.getTotalValue() < 17) {
				cardDeck.deal(sam);
			}
			// if sam has not lost then dealer picks a xard 
			if(!sam.HasPlayerLost()) {
				while(dealer.getTotalValue() < sam.getTotalValue()) {
					cardDeck.deal(dealer);
				}
			}
			//check who is the winner
			if(sam.HasPlayerLost()) {
				winner = "dealer";
			}else if(sam.HasPlayerWon() || dealer.HasPlayerLost()) {
				winner = "sam";
			}else if(dealer.getTotalValue() > sam.getTotalValue()) {
				winner = "dealer";
			}
			
		}
		
		// Print out the winner and Sam's cards and dealer's cards 	
		System.out.println(winner);
		System.out.print("sam: ");
		sam.hands();
		System.out.println("");
		System.out.print("dealer: ");
		dealer.hands();
		

	}

}
