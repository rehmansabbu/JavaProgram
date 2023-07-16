package CanOverrideStaticMethod;

public class Car {
	
	// Can we override a static method in child class? - No ,Its Not possible because it will give warning in @override annonation
	// and showing error, If parent class I will make the method as a static  and overide the method in side the 
	// child class as a static then it will give warning
	
	// Case of Overloading we can overload the Main Method but JVM always will search actual Main method --
	// -- public static void main(String [] args)
	
	public static void start()
	{
		System.out.println("Car----------> Start");
	}
	
	
	public void stop()
	{
		System.out.println("Car -------------> Stop");
	}
	
	
	public void refule()
	{
		
		System.out.println("Car ------------ > refule");
	}
		

}
