package AbstractionConcept;

public class TestBank {
	
	
	public static void main(String[]args)
	{
		
		
		Hdfc h1= new Hdfc();
		h1.credit();
		h1.debit();
		h1.loan();
		h1.funds(); // Here we can excess
		
		
		
		Bank b= new Hdfc(); // Here funds we can not excess 
		b.credit();
		b.debit();
		b.loan();
		
		// Bank b2= new bank(); we cannot create the object of abstract class

				
	}
	

}
