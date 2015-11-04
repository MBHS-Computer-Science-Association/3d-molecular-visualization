package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Loader{
	
	public void readFile(String filePath) {

		BufferedReader br = null;
		
		try {

			String currentLine;

			br = new BufferedReader(new FileReader(filePath));

			while ((currentLine = br.readLine()) != null) {
				System.out.println(currentLine);
			}

		} catch (IOException e) {
			System.err.println("Could not read file!");
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}