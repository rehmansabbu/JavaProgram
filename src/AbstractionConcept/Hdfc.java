package AbstractionConcept;

public class Hdfc  extends Bank{

	// Hdfc bank is the child class  of Bank and implement the body of loan inside the child class i.e hdfc
	// hdfc bank is reponsibilty to define the body and make the body of loan in child class
	
	// if suppose tommorrow i will add one extra method in parent class then its our responsibility to make the body in child class
	
	
	// Advantage
	
	// 1. Biggest advantage of abstract class is no need to define normal method in side the child class only i have to define and
	// make the body of abstract method. Means only abstract method need to define.
	
	
	@Override
	public void loan() {
		// TODO Auto-generated method stub
		
		System.out.println("Hdfc loan-----> Method");
	}
	
	public void funds()
	{
		System.out.println("Hdfc-------> Funds");
	}
	
	

}
