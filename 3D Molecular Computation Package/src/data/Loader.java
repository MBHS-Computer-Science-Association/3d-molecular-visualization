package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Loader {
	
	static HashMap<Integer, String> table1 = new HashMap<Integer, String>();

	public void readFile(String filePath) {

		try (BufferedReader br = new BufferedReader(new FileReader(filePath));) {

			String currentLine;
			int current = 1;
			// prints every line of txt file
			while ((currentLine = br.readLine()) != null) {
				// what you want it to do with every line
				table1.put(current, currentLine);
				System.out.println(currentLine);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}