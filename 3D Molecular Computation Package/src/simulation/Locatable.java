package simulation;

import java.math.BigDecimal;

import motion.Vector3d;

/**
 * The units of this class are meters and seconds consistent with the SI units for scientific purposes. 
 * @author Thai Nguyen
 *
 */
public abstract class Locatable {
	private BigDecimal x;
	private BigDecimal y;
	private BigDecimal z;
	
	public Locatable(BigDecimal x, BigDecimal y, BigDecimal z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public BigDecimal getDistanceTo(Locatable other) {
		return new BigDecimal(Math.sqrt((this.x.subtract(other.x)).pow(2).add(
				(this.y.subtract(other.y)).pow(2)).add(
						(this.z.subtract(other.z)).pow(2)).doubleValue()));
	}
	
	public void displace(Vector3d displacement, BigDecimal milliseconds) {
		x = x.add(displacement.getX().multiply(milliseconds.divide(new BigDecimal(1000))));
		y = y.add(displacement.getY().multiply(milliseconds.divide(new BigDecimal(1000))));
		z = z.add(displacement.getZ().multiply(milliseconds.divide(new BigDecimal(1000))));
	}
	
	public BigDecimal getX() {
		return x;
	}

	public BigDecimal getY() {
		return y;
	}

	public BigDecimal getZ() {
		return z;
	}

	public Vector3d getVector() {
		return (new Vector3d(x, y, z));
	}
}
