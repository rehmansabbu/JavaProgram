package JavaProgram;

public class StringPalindrome {
	
	
	public static void main(String[] args) {
		String str = "malayalam";
		String reverseString = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			reverseString = reverseString + str.charAt(i);
		}
		
		if(str.equals(reverseString)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

	
	

}
