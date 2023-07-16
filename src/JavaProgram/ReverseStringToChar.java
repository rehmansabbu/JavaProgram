package JavaProgram;

public class ReverseStringToChar {
	
	public static void main(String args[]) {
		
		
		String str = "My name is Mansur";
		
		String reverseString = "";
		
		for(int i = str.length()-1; i >= 0; i--)
		{
			reverseString = reverseString + str.charAt(i);
		}
		
		
			System.out.println("Reverse of String is : "+reverseString);
	}


}
