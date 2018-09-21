package BlackJack;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

	private Scanner x;
	
	public void openFile() {
		try {
			x = new Scanner(new File("file.txt"));
		}catch(Exception e) {
			System.out.println("Could not find file");
		}
	}
	
	public void readFile() {
		while(x.hasNext()) {
			String a = x.next();
			String b = x.next();
			String c = x.next();
			
			System.out.printf("s% s% s%", a, b,c);
		}
	}
	
	public void closeFile() {
		x.close();
	}
}
