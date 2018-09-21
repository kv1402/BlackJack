package BlackJack;

public class TestRead {

	public static void main(String[] args) {
		
		ReadCard r = new ReadCard();
		r.openFile("src/BlackJack/file.txt");
		r.readFile();
		r.closeFile();
		String [] as = r.printCardDeck();
		
		for (String c: as) {
			System.out.println(c);
		}
		
		CardDeck cardDeck = new CardDeck("src/BlackJack/file.txt");
		

	
	}
}
