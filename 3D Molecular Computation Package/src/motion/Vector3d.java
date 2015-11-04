package motion;

public class Vector3d {
	private double x,y,z;
	
	public Vector3d(){
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	public Vector3d(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector3d(Vector3d v){
		this.x = v.getX();
		this.y = v.getY();
		this.z = v.getZ();
	}
	
	public Vector3d(Vector3d direction, double magnitude) {
		Vector3d result = new Vector3d(direction.getUnitVector().scalarMultiply(magnitude));
		this.x = result.x;
		this.y = result.y;
		this.z = result.z;
	}
	
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double getZ(){
		return z;
	}
	
	public Vector3d getDirectionTo(Vector3d other) {
		return new Vector3d(other.x - this.x, other.y - this.y, other.z - this.z).getUnitVector();
	}
	
	public Vector3d scalarMultiply(double magnitude) {
		return new Vector3d(this.x * magnitude, this.y * magnitude, this.z* magnitude);
	}
	
	public Vector3d getUnitVector() {
		return new Vector3d(x/getMagnitude(), y/getMagnitude(), z/getMagnitude());
	}
	
	public double getMagnitude() {
		return Math.sqrt(x*x + y*y + z*z);
	}
}
