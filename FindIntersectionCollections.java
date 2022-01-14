package assignments.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionCollections {

	public static void main(String[] args) {
		
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		
		List<Integer> arrList1 = new ArrayList<Integer>(arr1.length);
		List<Integer> arrList2 = new ArrayList<Integer>(arr2.length);
		
		for(int i : arr1) {
			arrList1.add(i);
		}
		for(int j:arr2) {
			arrList2.add(j);
		}
		for (int x=0; x<=arrList1.size()-1; x++) {
			for(int y=0;y<=arrList2.size()-1; y++) {
				if(arrList1.get(x).equals(arrList2.get(y))) {
					System.out.println(arrList1.get(x));
				}
			}
		}

	}

}
