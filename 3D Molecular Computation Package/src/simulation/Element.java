package simulation;

public class Element extends Particle {

	private final int atomicNumber;
	private int atomicMass;
	private int state; // 0=S 1=L 2=G
	
	private String atomicSymbol;
	
	public Element(int atomicNumber, int atomicMass) {
		this.atomicNumber = atomicNumber;
		this.atomicMass = atomicMass;
	}
	public Element(int atomicNumber, int atomicMass, int state) {
		this(atomicNumber, atomicMass);
		this.state = state;
	}
	
	public Element(int atomicNumber, int atomicMass, int state, String atomicSymbol) {
		this(atomicNumber, atomicMass, state);
		this.atomicSymbol = atomicSymbol;
	}
	public double getMolarMass() {
		return atomicMass;
	}

	public int getAtomicNumber() {
		return atomicNumber;
	}
	public int getState(){
		return state;
	}
	
	public String getAtomicSymbol() {
		return atomicSymbol;
	}
	
	public String toString() {
		return atomicSymbol;
	}
}
