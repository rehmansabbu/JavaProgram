package CanOverloadMainMethod;

public class TestBase {
	
	//Method Overloading  ---- > Means In a particular class when we have differnt number of method with the same name
	                            // and differnt number of parameter - type of argument , number of argument
	                           // sequance of argument should be differnt its known as Method Overloading
	
	// Can we overload a main() method in Java? - Yes we can do that
	
	//When i will execute the program that time JVM will search first Main method is available are not
	
	// JVM --> search- main(String[]args) public static void main
	
	public static void main(String[]args)
	{
		System.out.println("Main Method - 1"); // this will execute first
		
		// other main method explicitly i have to call because JVM will search first Actual Main method - 
		//public static void main(String[]args)
		
		main(10);
		main(10,20);
		main("selenium");
		
	}
	
	public static void main(int a)
	{
		
		System.out.println("Main Method - 2");	
		
	}
	

	public static void main(int a , int b)
	{
		System.out.println("Main Method - 3");
		
		
	}
	
	public static void main(String args)
	{
		System.out.println("Main Method - 4");
		
		
	}
}
