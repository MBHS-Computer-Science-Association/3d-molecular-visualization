package simulation;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
		BigDecimal x = BigDecimal.ZERO;
		BigDecimal y = BigDecimal.ZERO;
		BigDecimal z = BigDecimal.ZERO;
		
		for (Vector3d force : appliedForces) {
			x = x.add(force.getX());
			y = y.add(force.getY());
			z = z.add(force.getZ());
		}
		
		return new Vector3d(x, y, z);
	}
	
	public BigDecimal getDistanceTo(Atom other) {
		return new BigDecimal(Math.sqrt((this.getX().subtract(other.getX()).pow(2).add(this.getY().subtract(other.getY()).pow(2)).add(this.getZ().subtract(other.getZ()).pow(2)).doubleValue())));
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
		Vector3d acceleration = force.scalarMultiply(BigDecimal.ONE.divide(new BigDecimal(1000).multiply(grams), 100,RoundingMode.HALF_UP));
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
