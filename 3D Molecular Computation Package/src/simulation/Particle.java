package simulation;

public abstract class Particle {
	/**
	 * @return the molar mass of the particle.
	 */
	public abstract double getMolarMass();
	
	/**
	 * Removes the particle from the simulation.
	 * @return if the process was successful
	 */
	public boolean destroy() {
		return false;
	}
}
