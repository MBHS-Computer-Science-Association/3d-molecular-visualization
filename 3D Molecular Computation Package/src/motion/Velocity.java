package motion;

import java.util.Collection;
import java.util.TreeSet;

public class Velocity extends Vector3d {
	int Direction;
	double speed;
	
	public Velocity(){
		Direction = 0;
		speed = 0.0;
	}
	public Velocity(int D, double speed){
		Direction = D;
		this.speed = speed;
	}
}
