package simulation;

import motion.Vector3d;

public abstract class Locatable {
	private double x;
	private double y;
	private double z;
	
	public Locatable(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getDistanceTo(Locatable other) {
		return Math.sqrt((this.x - other.x)*(this.x - other.x) + 
				(this.y - other.y)*(this.y - other.y) + 
						(this.z - other.z)*(this.z - other.z));
	}
	
	public Vector3d getVector() {
		return (new Vector3d(x, y, z));
	}
}