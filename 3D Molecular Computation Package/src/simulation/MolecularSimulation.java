package simulation;

import java.util.ArrayList;
import java.util.List;

import algorithms.Physics;

public class MolecularSimulation {
	public static List<Updatable> entityList;
	
	public static void main(String[] args) {
		System.out.println("Heyyyy");
		entityList = new ArrayList<>();
		entityList.add(new Atom(1 * Physics.ELEMENTARY_CHARGE, -1/Physics.AVOGADROS_CONSTANT, 0, 0, 0));
		entityList.add(new Atom(-1 * Physics.ELEMENTARY_CHARGE, -1/Physics.AVOGADROS_CONSTANT, 5, 5, 0));
		Thread updateLoop = new Thread(new UpdateLoop(), "Update");
		updateLoop.start();
	}
}
