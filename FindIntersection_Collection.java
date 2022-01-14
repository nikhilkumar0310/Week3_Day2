package assignments.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.compress.utils.Lists;

public class FindIntersection_Collection {

	public static void main(String[] args) {
		
		Integer[] arr = {3,2,11,4,6,7};
		Integer[] arr2 = {1,2,8,4,9,7};
		
		List<Integer> list = Arrays.asList(arr);
		List<Integer> list2 = Arrays.asList(arr2);
		System.out.println(list);
		System.out.println(list2);
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.addAll(list);
		System.out.println("Before retention " +set);
		set.retainAll(list2);
		System.out.println("After retention " +set);
		
		//Convert the intersected elements to Array
		Object[] intersection = set.toArray();
		
		System.out.println("The array of intersected numbers are "+ Arrays.toString(intersection));

	}

}
