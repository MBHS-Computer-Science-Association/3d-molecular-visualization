package molecular;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MolecularUnit {
	Set<Bond> bondingTypes;
	
	public MolecularUnit() {
		bondingTypes = new TreeSet<>();
	}
	
	public boolean append(Bond bond) {
		return bondingTypes.add(bond);
	}
	
	public String toString() {
		StringBuilder output = new StringBuilder();
		
		Iterator iter = bondingTypes.iterator();
		while (iter.hasNext()) {
			output.append(iter.next() + "\n");
		}
		
		return output.toString();
	}
}
