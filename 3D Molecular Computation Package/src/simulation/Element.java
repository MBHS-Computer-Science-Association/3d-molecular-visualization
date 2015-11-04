package simulation;

public class Element extends Particle {

	private final int atomicNumber;
	private int atomicMass;
	private int state; // 0=S 1=L 2=G
	
	public Element(int atomicNumber, int atomicMass) {
		this.atomicNumber = atomicNumber;
		this.atomicMass = atomicMass;
	}
	public Element(int atomicNumber, int atomicMass, int state) {
		this.atomicNumber = atomicNumber;
		this.atomicMass = atomicMass;
		this.state = state;
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
}
