package AbstractionConcept;

//if particular class is abstract class then atleast one method should be abstract

	// Abstraction means to hide the the some implementation logic
	// implementation logic will be define the logic in child class (Feature will be define by the HDFC bank)
  // loan feature is not common for all the child classes but credit and debit feature is common for all so this is called
  // partial abstraction
// performance wise abstract class is faster then interface(because 20 percent i want to hide rest i want to show(20% abstract,80% non abstract))
//but in the case of interface 100 % i have to hide


public abstract class Bank {   // now its a abstract class
	
	//Partial abstraction
	//Hiding the implementation logic -------- is called abstraction
	// abstract class can have abstract method as well as non abstract method
	// we cannot create the abject of abstract class (NOTE)
	
	
	
	
	
	public abstract void loan(); // does not have  method body , its only method prototype
	
	
	
	//Non abstract method
	public void credit()  // This is non abstract method
	{
		
		System.out.println("Bank---------> Credit");
		
	}
	
	//Non abstract method
	public void debit() // This is non abstract method
	{
		System.out.println("Bank----------> Debit");
	}

}

// This is the structure of abstract class