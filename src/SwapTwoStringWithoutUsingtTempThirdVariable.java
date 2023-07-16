
public class SwapTwoStringWithoutUsingtTempThirdVariable {
	
	public static void main(String[]args)
	{
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before swapping");
		System.out.println(a);
		System.out.println(b);
		
		
		// first append the string
		
		a= a+b;
		
		System.out.println(a);
		
	    //intial String a in String b
		
		b= a.substring(0, b.length());
		System.out.println("b value:::: "+b);
		
		//initial String b in string a
		a=a.substring(b.length());
		
		System.out.println("a value::::  "+a);
		
		
		
	}
	

}
