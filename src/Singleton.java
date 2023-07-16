
public class Singleton {
	
	//Singleton class is a class that can have only once object(instance of the class) at a time.
	
	// how to design singleton class
	//1. Make constructor as a private
	//2.write a public static method (getInstance) that has return type of object of this singleton class
	// (Lazy initialization)
	
	
	//Difference between normal class and singleton class
	// - For normal class we use constructor whereas for singleton class we use getInstance() method for instantiation
	
	private static Singleton singleton_instance= null;
	public String str ;
	
	private Singleton()
	{
		str= "Hey i am using Singleton class pattern";
	}
	
	public static Singleton getInstance()
	{
		if(singleton_instance== null)
		{
			singleton_instance = new Singleton();
			return singleton_instance;
		}
		return singleton_instance;	
	}
	
	public static void main(String[]args)
	{
		
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.str= (x.str).toUpperCase(); 
		
		//singleton class is a class that can have only and only one object at a time  , pointing to the same object
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str=(z.str).toLowerCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
	}

}
