package algorithms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Physics {
	private static final BigDecimal COULOMBS_CONSTANT = new BigDecimal(8.9875517873681764e9);
	public static final BigDecimal ELEMENTARY_CHARGE = new BigDecimal(1.602176620898e-19);
	public static final BigDecimal AVOGADROS_CONSTANT = new BigDecimal(6.02214085774e23);
	
	/**
	 * For more information, see: <a href="https://en.wikipedia.org/wiki/Coulomb's_law">Coulomb's_law</a>
	 * 
	 * 
	 * @param charge1
	 * @param charge2
	 * @param distance
	 * @return
	 */
	
	public static BigDecimal calculateCoulombicAttractionNewtons(BigDecimal charge1, BigDecimal charge2, BigDecimal distance) {
		return (COULOMBS_CONSTANT.multiply(charge1.multiply(charge2).abs()).divide(distance, 10 ,RoundingMode.HALF_UP).divide(distance, 10 ,RoundingMode.HALF_UP));
	}
}
