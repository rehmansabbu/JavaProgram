package CanOverrideStaticMethod;

public class BMW extends Car
{
	
	
	// If inside the parent class of CAR method if i will make static then we cannot overide the method in child class of BMW , it will
	 // give error
	
	
	 // @Override
	  public static void start() // give error
	  
	   {
	  System.out.println("BMW -----------> Start");
	  
	   }
	 

}
