package simulation;

import java.util.ArrayList;

public class MolecularSimulation {
	ArrayList<Element> elementList = new ArrayList<>();
	Thread UpdateLoop = new Thread(new UpdateLoop(), "Update");
}
