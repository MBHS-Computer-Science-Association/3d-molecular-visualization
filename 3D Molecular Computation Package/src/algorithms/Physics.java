package algorithms;

public class Physics {
	private static final double COULOMBS_CONSTANT = 8.9875517873681764e9;
	public static final double ELEMENTARY_CHARGE = 1.602176620898e-19;
	public static final double AVOGADROS_CONSTANT = 6.02214085774e23;
	
	/**
	 * For more information, see: <a href="https://en.wikipedia.org/wiki/Coulomb's_law">Coulomb's_law</a>
	 * 
	 * 
	 * @param charge1
	 * @param charge2
	 * @param distance
	 * @return
	 */
	
	public static double calculateCoulombicAttractionNewtons(double charge1, double charge2, double distance) {
		return COULOMBS_CONSTANT * Math.abs(charge1 * charge2) / (distance * distance);
	}
}
