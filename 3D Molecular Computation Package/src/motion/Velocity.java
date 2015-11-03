package motion;

public class Velocity {
	
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
