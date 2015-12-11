package contractProgramming;

import java.util.ArrayList;

public class DisplayElements {
	private String full;
	ArrayList<String> symbol = new ArrayList<String>();
	ArrayList<Integer> amounts = new ArrayList<Integer>();

	public DisplayElements(ArrayList<String> names, ArrayList<Integer> amount) {
		symbol = names;
		amounts = amount;
	}

	public String toString() {
		for (int x = 0; x < symbol.size(); x++) {
			if (x == 0) {
				if (amounts.get(x) != 1) {
					full = symbol.get(x) + amounts.get(x);
				} else {
					full = symbol.get(x);
				}
			} else {

				if (amounts.get(x) != 1) {
					full += symbol.get(x) + amounts.get(x);
				}

				else {
					full += symbol.get(x);
				}

			}
		}

		return full;

	}
}
