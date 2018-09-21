package BlackJack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TEST {
	
	private static final String FILENAME = "src/BlackJack/file.txt";

	public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fr = null;
		ArrayList<String> card = new ArrayList();

		
		try {

			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				String[] ar=sCurrentLine.split(", ");
				System.out.println(sCurrentLine);
				System.out.println(ar[0]);
				System.out.println(ar[1]);
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}

//		File file = new File(".");
//		for(String fileNames : file.list()) System.out.println(fileNames);
	}


}
