package BlackJack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadCard {
	//private static final String FILENAME = "src/BlackJack/file.txt";

	private BufferedReader br = null;
	private FileReader fr = null;
	private ArrayList<String> card = new ArrayList();
	String sCurrentLine; // the whole card deck like
	String[] arrString;
	
	public void openFile(String filename) {
		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
		}catch(Exception e) {
			System.out.println("Could not find file");
		}
	}
	
	public void readFile() {
		try {
			while ((sCurrentLine = br.readLine()) != null) {
				arrString=sCurrentLine.split(", ");
				System.out.println(sCurrentLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closeFile() {
		try {
			if (br != null)
				br.close();
			if (fr != null)
				fr.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public String[] printCardDeck() {
//		for(String c: arrString) {
//			System.out.println(c);
//		}
		return arrString;
	}
}
