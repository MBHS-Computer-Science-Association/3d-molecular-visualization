package simulation;

import java.util.ArrayList;
import java.util.List;

import algorithms.Physics;
import motion.Vector3d;

public class Atom extends Locatable implements TimeUpdatable {
	double charge;
	double mass;
	
	List<Vector3d> appliedForces = new ArrayList<>();
	Vector3d force;
	Vector3d velocity;
	
	private double x;
	private double y;
	private double z;
	
	public Atom(double charge, double x, double y, double z) {
		super(x,y,z);
		this.charge = charge;
	}
	
	public Vector3d getResultantForce() {
		double x = 0;
		double y = 0;
		double z = 0;
		
		for (Vector3d force : appliedForces) {
			x += force.getX();
			y += force.getY();
			z += force.getZ();
		}
		
		return new Vector3d(x, y, z);
	}
	
	public double getDistanceTo(Atom other) {
		// finish implementation
		return 0;
	}
	
	public void applyForce(Vector3d force) {
		appliedForces.add(force);
	}
	
	public double getCharge() {
		return charge;
	}
	
<<<<<<< HEAD
	public double getCoulombicForcesWith(Atom other) {
		return Physics.calculateCoulombicAttractionNewtons(this.charge, other.charge, this.getDistanceTo(other));
=======
	public Vector3d getCoulombicForcesWith(Atom other) {
		return new Vector3d(this.getVector().getDirectionTo(other.getVector()) , Physics.calculateCoulombicAttractionNewtons(this.charge, other.charge, this.getDistanceTo(other)));
>>>>>>> origin/master
	}

	@Override
	public void update() {
		force = getResultantForce();
	}

	@Override
	public void update(long milliseconds) {
		// TODO Auto-generated method stub
		
	}
}
