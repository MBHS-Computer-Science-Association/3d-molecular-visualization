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
		return Math.sqrt((this.x - other.x)*(this.x - other.x) + 
				(this.y - other.y)*(this.y - other.y) + 
						(this.z - other.z)*(this.z - other.z));
	}
	
	public void displace(Vector3d displacement, double milliseconds) {
		x += displacement.getX() * (milliseconds / 1000);
		y += displacement.getY() * (milliseconds / 1000);
		z += displacement.getZ() * (milliseconds / 1000);
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
