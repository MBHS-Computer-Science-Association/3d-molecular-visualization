package simulation;

public class Atom extends Element {
	Element elementType;
	int electrons;
	double charge;
	
	public Atom(int atomicNumber, int atomicMass) {
		super(atomicNumber, atomicMass);
	}
	
	public double getCharge() {
		return getAtomicNumber() - electrons;
	}
}
