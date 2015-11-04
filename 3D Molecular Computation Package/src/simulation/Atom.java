package simulation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import algorithms.Physics;
import motion.Vector3d;

public class Atom extends Locatable implements TimeUpdatable {
	BigDecimal coulombs;
	BigDecimal grams;
	
	List<Vector3d> appliedForces = new ArrayList<>();
	Vector3d force;
	Vector3d velocity;
	
	public Atom(BigDecimal coulombs, BigDecimal grams, BigDecimal x, BigDecimal y, BigDecimal z) {
		super(x,y,z);
		velocity = new Vector3d();
		this.coulombs = coulombs;
		this.grams = grams;
	}
	
	public Vector3d getResultantForce() {
		BigDecimal x = 0;
		BigDecimal y = 0;
		BigDecimal z = 0;
		
		for (Vector3d force : appliedForces) {
			x += force.getX();
			y += force.getY();
			z += force.getZ();
		}
		
		return new Vector3d(x, y, z);
	}
	
	public BigDecimal getDistanceTo(Atom other) {
		// finish implementation
		return 0;
	}
	
	public void applyForce(Vector3d force) {
		appliedForces.add(force);
	}
	
	public BigDecimal getCharge() {
		return coulombs;
	}
	
	public BigDecimal getCoulombicForcesWith1(Atom other) {
		return Physics.calculateCoulombicAttractionNewtons(this.coulombs, other.coulombs, this.getDistanceTo(other));

	}
	public Vector3d getCoulombicForcesWith(Atom other) {
		return new Vector3d(this.getVector().getDirectionTo(other.getVector()) , Physics.calculateCoulombicAttractionNewtons(this.coulombs, other.coulombs, this.getDistanceTo(other)));

	}

	@Override
	public void update() {
		force = getResultantForce();
		System.out.println(force.getMagnitude());
		Vector3d acceleration = force.scalarMultiply(1/(1000 * grams));
		velocity.add(acceleration);
	}

	@Override
	public void update(BigDecimal milliseconds) {
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
