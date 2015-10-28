package algorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListOperations {
	public static ArrayList<Comparable> bubbleSort(ArrayList<Comparable> arrayList) {
		int i, j;
		Comparable tmp;
		for (i = 1; i < arrayList.size(); i++) {
			j = i;
			while (j > 0 && arrayList.get(j-1).compareTo(arrayList.get(j)) > 1) {
				tmp = arrayList.get(j);
				arrayList.set(j, arrayList.get(j-1));
				arrayList.set(j-1, tmp);
				j--;
			}
		}
		return arrayList;
	}
	
	public static <T> int search(ArrayList<T> arrayList) {
		for (int i = 0; i < arrayList.)
		return 0;
		
	}
}
