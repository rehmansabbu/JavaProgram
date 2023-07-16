package JavaProgram;

public class PalindromeClass {
	
	public static void main(String[] args) {
		
		
	/*	
	  // 1. Algorithm - For Reverse of Integer.
		long num =  12345;  //54321 
		
		long rev =  0;
		
		while(num != 0)
		{
			rev = rev * 10 + num%10; 
			num = num/10;
			
			
		}
		
		System.out.println("Reverse integer is :::::::"+rev);
		
		
		*/
		
		int num = 121;
		int remainder;
		int sum = 0;
		int temp = num; 
		while(num != 0) {
			remainder = num % 10;
			sum = (sum * 10) + remainder;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Palindrome ::"+temp);
		} else {
			System.out.println("Not Palindrome");
		}
	}


}
