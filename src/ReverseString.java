import java.util.StringJoiner;

public class ReverseString {

	/*
	 * 1. Reverse a string
	 * 
	 * 2 . differnce between String and StringBuffer
	 * 
	 * 3 . Do we have reverse function in String - NO
	 */

	
	public static void main(String[]args)
	{
		
		
		
		String s = "Selenium"; 
		String s1 = "Welcome To Jharkhand";
		
		String rev="";
		
		// by the using of StringBuffer we can reverse eaisly becuase StringBuffer conatin reverse function , and mutable object
		
		// But in case of String we can not reverse directly because does not contain reverse funtion ,And immutable object
		
		int size=s1.length();
		System.out.println(size);
		for(int i=size-1; i>=0; i--)
		{
			rev= rev + s1.charAt(i);
			
		}
		
		System.out.println("Reverse String is :::::" +rev);
		
		
		StringBuffer sb=new StringBuffer(s1);
		
		System.out.println("Reverse by using StringBuffer :::::::::"+sb.reverse());
		
		
	}

}
