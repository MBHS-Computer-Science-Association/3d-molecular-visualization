package motion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Vector3d {
	private BigDecimal x,y,z;
	
	public Vector3d(){
		this.x = new BigDecimal(0);
		this.y = new BigDecimal(0);
		this.z = new BigDecimal(0);
	}
	public Vector3d(BigDecimal x, BigDecimal y, BigDecimal z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector3d(Vector3d v){
		this.x = v.getX();
		this.y = v.getY();
		this.z = v.getZ();
	}
	
	public Vector3d(Vector3d direction, BigDecimal magnitude) {
		Vector3d result = new Vector3d(direction.getUnitVector().scalarMultiply(magnitude));
		this.x = result.x;
		this.y = result.y;
		this.z = result.z;
	}
	
	public BigDecimal getX(){
		return x;
	}
	public BigDecimal getY(){
		return y;
	}
	public BigDecimal getZ(){
		return z;
	}
	
	public void add(Vector3d vector) {
		x = x.add(vector.x);
		y = y.add(vector.y);
		z = z.add(vector.z);
	}
	
	public Vector3d getDirectionTo(Vector3d other) {
		return new Vector3d(other.x.subtract(this.x), other.y.subtract(this.y), other.z.subtract(this.z)).getUnitVector();
	}
	
	public Vector3d scalarMultiply(BigDecimal magnitude) {
		return new Vector3d(this.x.multiply(magnitude), this.y.multiply(magnitude), this.z.multiply(magnitude));
	}
	
	public Vector3d getUnitVector() {
		return new Vector3d(x.divide(getMagnitude(), 10 ,RoundingMode.HALF_UP), y.divide(getMagnitude(), 10 ,RoundingMode.HALF_UP), z.divide(getMagnitude(), 10 ,RoundingMode.HALF_UP));
	}
	
	public BigDecimal getMagnitude() {
		return new BigDecimal(Math.sqrt(x.pow(2).add(y.pow(2)).add(z.pow(2)).doubleValue()));
	}
	
	public String toString() {
		return "";
	}
}
