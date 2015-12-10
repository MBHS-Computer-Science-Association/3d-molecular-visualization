package chemistry;
import java.util.ArrayList;
import java.util.Scanner;

public class scanner {
	public ArrayList<String> enter() {
		ArrayList<String> returned = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		String whole = input.nextLine();
		String[] temp = new String[2];
		String temp2=new String();
		int split=0;
		for(int x=0;x<whole.length();x++){
			if(whole.charAt(x)=='1'||whole.charAt(x)=='2'||whole.charAt(x)=='3'||whole.charAt(x)=='4'||whole.charAt(x)=='5'||whole.charAt(x)=='6'||whole.charAt(x)=='7'||whole.charAt(x)=='8'||whole.charAt(x)=='9'||whole.charAt(x)=='0')
				split=x;
		}
		
		
		if(split!=0)
		temp[0]=whole.substring(0, split);
		else
			temp[0]=whole;temp[1]="1";
		
			temp[1]=whole.substring(split,whole.length()-1);
		
		returned.add(temp[0]);
		
		returned.add(temp[1]);
		System.out.println(returned);
		return returned;
	}
}
