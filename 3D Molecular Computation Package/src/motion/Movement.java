package motion;



public class Movement {
	private Vector3d vec;
	private Velocity V;
	private double mass, acceleration, force;
	
	public Movement(double x, double y, double z, double mass, double accel, double speed, int Direction){
		vec = new Vector3d(x,y,z);
		acceleration = accel;
		this.mass = mass;
		force = this.mass*acceleration;
		V = new Velocity(Direction, speed);
	}
}
