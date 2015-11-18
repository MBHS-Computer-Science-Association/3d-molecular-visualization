package simulation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import algorithms.Physics;
import motion.Vector3d;

public class MolecularSimulation {
	public static List<Updatable> entityList;
	
	public static void main(String[] args) {
		System.out.println(new BigDecimal(5e-9));
		System.out.println(Physics.AVOGADROS_CONSTANT.doubleValue());
		System.out.println(Physics.calculateCoulombicAttractionNewtons(Physics.ELEMENTARY_CHARGE, Physics.ELEMENTARY_CHARGE, new BigDecimal(5e-9)));
		System.out.println("Heyyyy");
		entityList = new ArrayList<>();
		entityList.add(new Atom(BigDecimal.ONE.multiply(Physics.ELEMENTARY_CHARGE), BigDecimal.ONE.negate().divide(Physics.AVOGADROS_CONSTANT, 1000 ,RoundingMode.HALF_UP), BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO));
		entityList.add(new Atom(BigDecimal.ONE.negate().multiply(Physics.ELEMENTARY_CHARGE), BigDecimal.ONE.negate().divide(Physics.AVOGADROS_CONSTANT, 1000 ,RoundingMode.HALF_UP), new BigDecimal(5e-9), new BigDecimal(5e-9), BigDecimal.ZERO));
		((Atom) entityList.get(0)).applyForce(new Vector3d(new BigDecimal(1), new BigDecimal(1), new BigDecimal(1)));
		Thread updateLoop = new Thread(new UpdateLoop(), "Update");
		updateLoop.start();
	}
}