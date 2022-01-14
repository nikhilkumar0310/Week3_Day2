package assignments.day6;

public class FindTypes {

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] charArray = test.toCharArray();
		System.out.println(charArray);
		int len = charArray.length;
		
		for(int i=0; i<=len-1; i++) {
			
			char ch = charArray[i];
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				letter = letter + 1;
			}
			else if(ch>='0' && ch<='9') {
				num = num+1;
			}
			else if(ch == ' ') {
				space = space+1;
			}
			else {
				specialChar = specialChar+1;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
