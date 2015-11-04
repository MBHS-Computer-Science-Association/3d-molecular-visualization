package simulation;

import java.util.ArrayList;
import java.util.List;

import algorithms.Physics;
import motion.Vector3d;

public class Atom extends Locatable implements TimeUpdatable {
	double coulombs;
	double grams;
	
	List<Vector3d> appliedForces = new ArrayList<>();
	Vector3d force;
	Vector3d velocity;
	
	public Atom(double coulombs, double grams, double x, double y, double z) {
		super(x,y,z);
		this.coulombs = coulombs;
		this.grams = grams;
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
		return coulombs;
	}
	
	public double getCoulombicForcesWith1(Atom other) {
		return Physics.calculateCoulombicAttractionNewtons(this.coulombs, other.coulombs, this.getDistanceTo(other));

	}
	public Vector3d getCoulombicForcesWith(Atom other) {
		return new Vector3d(this.getVector().getDirectionTo(other.getVector()) , Physics.calculateCoulombicAttractionNewtons(this.coulombs, other.coulombs, this.getDistanceTo(other)));

	}

	@Override
	public void update() {
		force = getResultantForce();
		Vector3d acceleration = force.scalarMultiply(1/(1000 * grams));
		velocity.add(acceleration);
	}

	@Override
	public void update(double milliseconds) {
		update();
		this.displace(velocity, milliseconds);
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("x: " + super.getX() + " y: " + super.getY() + " z: " + super.getZ() + '\n');
		result.append("Velocity - " + "x: " + velocity.getX() + " y: " + velocity.getY() + " z: " + velocity.getZ());
		return result.toString();
	}
}
