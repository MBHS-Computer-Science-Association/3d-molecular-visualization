package data;

import java.util.*;

import contractProgramming.Table;

import static contractProgramming.Table.*;
//import java.util.HashMap;
//import java.util.Map;

public class PeriodicTables {
	private HashMap<Integer,String> AtomicSymbolNameTable;
	private HashMap<Integer, Double> AtomicMassTable;
	private HashMap<String, Integer> AtomicNumberTableSym;
	private HashMap<String, Double> AtomicMassTableSym;
	private HashMap<Integer, Double> ElectronegativityTable;
	private HashMap<String, Double> ElectronegativityTableSym;
	
	public PeriodicTables(){
		this.AtomicSymbolNameTable = new HashMap<Integer,String>();
		this.AtomicMassTable = new HashMap<Integer, Double>();
		this.AtomicNumberTableSym = new HashMap<String, Integer>();
		this.AtomicMassTableSym = new HashMap<String, Double>();
		ElectronegativityTable = new HashMap<Integer, Double>();
		fill();
	}
	
	public void fill(){
		if(AtomicSymbolNameTable == null || AtomicMassTable == null){
			System.out.println("null tables");
		}
		for(int i = 1; i<=109; i++){
			this.AtomicSymbolNameTable.put(i, getInfo(i)[0]);
		}
		for(int i = 1; i<=109; i++){
			this.AtomicMassTable.put(i, Double.parseDouble(getInfo(i)[1]));
		}
		for(int i = 1; i<=109; i++){
			AtomicNumberTableSym.put(AtomicSymbolNameTable.get(i), i);
			AtomicMassTableSym.put(AtomicSymbolNameTable.get(i), AtomicMassTable.get(i));
		}
		for(int i = 1; i<=109; i++){
			ElectronegativityTable.put(i, Double.parseDouble(Table.getElectronegativity(i)[1]));
			ElectronegativityTableSym.put(AtomicSymbolNameTable.get(i), ElectronegativityTable.get(i));
		}
	}
}
