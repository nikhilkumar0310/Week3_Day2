package assignments.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] splitString = text.split(" ");
		int count =0;
		
		List<String> stringList = new ArrayList<String>(Arrays.asList(splitString));
		List<String> dupes = new ArrayList<String>();
		System.out.println(stringList);
		int sz = stringList.size();
		
		for(int i=0; i<=sz-1; i++) {
			String strOl = stringList.get(i);
			for(int j=i+1; j<sz-1; j++) {
				if(strOl.equalsIgnoreCase(stringList.get(j))) {
					count = count +1;
					dupes.add(strOl);
					}
			}
		}
		stringList.removeAll(dupes);
		System.out.println(stringList);
		System.out.println(dupes);

	
	}
}
