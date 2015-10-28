package simulation;

public interface Particle {
	/**
	 * @return the molar mass of the particle.
	 */
	double getMolarMass();
	
	/**
	 * Removes the particle from the simulation.
	 * @return if the process was successful
	 */
	default boolean destroy() {
		return false;
	}
}
