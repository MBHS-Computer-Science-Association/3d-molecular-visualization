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
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double getZ(){
		return z;
	}
}
