package assignments.day6;

public class CharOccurance {

	public static void main(String[] args) {

		String str = "welcome to chennai";
		// declare and initialize a variable count to store the number of occurrences
		int count = 0;

		// convert the string into char array
		char[] strCh = str.toCharArray();

		// get the length of the array
		int len = strCh.length;

		// traverse from 0 till the array length
		// Check the char array has the particular char in it
		for(int i=0; i<=len-1; i++) {
			if(strCh[i]=='e') {
				// if is has increment the count
				count = count+1;
			}
		}
		// print the count out of the loop
		System.out.println("The number of times the Charaters occured is "+count);
	}

}
