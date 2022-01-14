package assignments.day6;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a software tester ronaldo says SIUUUU";
		 String[] splitTest = test.split(" ");
		 int len = splitTest.length;
		 String rev = "";
	
		 for(int i = 0; i<len; i++) {
			
			 if(i%2==1) {
				 String strEven = splitTest[i];
				 for(int j=strEven.length()-1; j>=0; j--) {
					 rev = rev + strEven.charAt(j);
				 }
				 System.out.print(rev+" ");
				 rev = "";
		 }
			 else {
				 System.out.print(splitTest[i]+" ");
				 
			 }

	}
	}
}
