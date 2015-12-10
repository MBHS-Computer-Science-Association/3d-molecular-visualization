package chemistry;
import java.util.ArrayList;
import java.util.Scanner;

public class MM {
	public double grams = -1;
	public ArrayList<String> list = new ArrayList<String>();
	public Object[] run() {
		// Variables VVVVVVVVV
		int count = 0;
		int count1 = 0;
		int count2 = 0;

		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Double> weights = new ArrayList<Double>();
		ArrayList<Integer> amount = new ArrayList<Integer>();
		ArrayList<Double> total = new ArrayList<Double>();

		Scanner inquire = new Scanner(System.in);

		ConvertToDouble convert = new ConvertToDouble();
		Element findName = new Element();

		// user input VVVVVVV
		/*
		
		System.out.println("Please enter a buffer character, or the mass of the compound to find the amount of moles");
		String next = inquire.nextLine();
		if (next.startsWith("0") || next.startsWith("1")
				|| next.startsWith("2") || next.startsWith("3")
				|| next.startsWith("4") || next.startsWith("5")
				|| next.startsWith("6") || next.startsWith("7")
				|| next.startsWith("8") || next.startsWith("9"))
			grams = Double.parseDouble(next);
		String done = "done";
		// next=inquire.nextLine();
		System.out
				.println("To enter data, type in Atomic number, press enter, then type in the amount of it and press enter");
		System.out.println("Type 'done' and press enter to finish");
		int linespace = 0;
		
		
		
		Scanner input=new Scanner(System.in);
		
		
		
		while (done.contentEquals(next) == false) {
			if(linespace ==2){
				System.out.println();
				linespace=0;
			}
			
			next= input.nextLine();
			if(next.equals(done)){
				break;
			}
			list.add(next);
			linespace++;
			next= input.nextLine();
			list.add(next);
			linespace++;
			
				
		}*/
		

		// User input sorter
		ArrayList<String> temporary = new ArrayList<String>();
		for (int x = 0; x < list.size()/ 2; x++) {

			names.add(list.get(count));
			count++;
			temporary.add(list.get(count));
			count++;

		}
		count = 0;

		for (int x = 0; x < temporary.size(); x++) {
			amount.add((int) convert.decipherMM(temporary.get(count)));
			count++;
		}
		// Names Sorter
		count = 0;
		String temp = null;
		int an = 0;
		String[] two = new String[2];
		for (int x = 0; x < names.size(); x++) {
			temp = names.get(count);
			two = findName.getInfo(temp);
			for (int a = 48; a <= 57; a++) {
				if (temp.charAt(0) == a) {
					an = (int) convert.decipherMM(temp);
					two = findName.getInfo(an);
				}
			}

			weights.add(convert.decipherMM(two[1]));
			names.set(count, two[0]);
			count++;
		}
		// table maker

		int counter = 0;
		double molarMass = 0;
		System.out.println();
		String g="";
		for (int x = 0; x < names.size(); x++) {

			/*System.out.println(names.get(counter) + " At "
					+ weights.get(count1) + " x " + amount.get(count2) + " = "
					+ (((weights.get(count1) * amount.get(count2)) * 100000))
					/ 100000);*/
			
			g+=names.get(counter)+" At " +weights.get(count1)+ " x "+ amount.get(count2)+" = "+ (((weights.get(count1) * amount.get(count2)) * 100000))
					/ 100000 + "\n";
			total.add(weights.get(count1) * amount.get(count2));
			counter++;
			count1++;
			count2++;

			
			
			
			
			
			
			
			
			
		}
		for (int x = 0; x < total.size(); x++) {
			molarMass += total.get(x);
		}
		molarMass *= 100;
		molarMass /= 100;
		DisplayElements element = new DisplayElements(names, amount);
		//System.out.println();
		Object[] returned = new Object[2];
		//System.out.println("The Molar Mass of "+element.toString() +" is: " + molarMass);
		returned[0]=molarMass;
		returned[1]=g;
		if (grams != -1){
			//System.out.println("Your "+grams+" grams of "+element.toString()+" is " + grams / molarMass + " moles");
			
			
		}
		return returned;	
	}

}
