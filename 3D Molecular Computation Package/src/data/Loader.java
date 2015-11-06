package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Loader {

	public void readFile(String filePath) {

		try (BufferedReader br = new BufferedReader(new FileReader(filePath));) {

			String currentLine;

			// prints every line of txt file
			while ((currentLine = br.readLine()) != null) {
				// what you want it to do with every line
				System.out.println(currentLine);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}