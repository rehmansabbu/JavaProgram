package AbstractionConcept;

public interface Car {
	
	//interface keyword means No method body
	// inside the interface class can have only abstract method
	// Always define only abstract method
	//NO method body
	//only method declaration
	//no need to wright abstract keyword
	//we acheive 100% abstraction means we can see here no any implementation here only i have to declare the method 
	// thatsway its called 100% abstraction , Hide the complete implementation logic over here
	// we cannot create the object of interface class
	// only final and static variable we can define
	
	public void start();
	public void stop();
	public void refule();
	
	
	

}
