package molecular;

import java.util.HashSet;
import java.util.Set;

import simulation.Element;

public class Bond {
	String id;
	
	Set<Element> elements;
	
	public Bond(Element e1, Element e2) {
		elements = new HashSet<>();
		elements.add(e1);
		elements.add(e2);
	}
	
	public boolean equals(Object o) {
		o = (Bond) o;
		//add legit implementation later
		return this.toString().equals(o.toString());
	}
	
	public String toString() {
		StringBuilder output = new StringBuilder();
		for (Element e : elements) {
			output.append(e + " ");
		}
		
		return output.toString();
	}
}
