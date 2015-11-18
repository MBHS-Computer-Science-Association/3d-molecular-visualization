package molecular;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import simulation.Updatable;

public class MolecularUnit implements Updatable {
	private Set<Bond> bondingTypes;
	private String id;
	
	
	public MolecularUnit() {
		bondingTypes = new TreeSet<>();
	}
	
	public MolecularUnit(String id) {
		this();
		this.id = id;
	}
	
	
	public boolean append(Bond bond) {
		return bondingTypes.add(bond);
	}
	
	public String toString() {
		StringBuilder output = new StringBuilder();
		
		Iterator<Bond> iter = bondingTypes.iterator();
		while (iter.hasNext()) {
			output.append(iter.next() + "\n");
		}
		
		return output.toString();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}
