package assignments.day6;

public class PalindromeString {

	public static void main(String[] args) {
		
		String palin = "Madam";
		String rev = "";
		
		char[] cs = palin.toCharArray();
		int len = cs.length;
		
		for(int i=len-1; i>=0; i--) {
			rev = rev + cs[i];
		}
		if(rev.equalsIgnoreCase(palin)) {
			System.out.println("The Word is a PalinDrome");
		}
		else {
			System.out.println("Not a PlainDrome");
		}
		System.out.println(rev);

	}

}
