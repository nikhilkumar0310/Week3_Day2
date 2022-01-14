package assignments.day6;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "potss";
		
		if(text1.length()==text2.length()) {
			System.out.println("The Length of the Strings are same");
			
			char[] ch1 = text1.toCharArray();
			char[] ch2 = text2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			//System.out.println(ch2);
			
			boolean b = Arrays.equals(ch1, ch2);
			if(b == true)
			    System.out.println("We found an Anagram");
			
			else
				System.out.println("It is not an Anagram");
		}
		else {
			System.out.println("Both Strings are of different Length");
		}
			

	}

}
