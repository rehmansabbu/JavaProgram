import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	
	public static void main(String[]args)
	{
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("selenium");
		al.add("Manual");
		al.add("Jira");
		al.add("TestNg");
		al.add("BddFarmework");
		al.add("ExtentReport");
		al.add("Log4g");	
		
		
		// 1. For Each loop for lamda Expression
		
		al.forEach(shows->{System.out.println(shows);});
		
       System.out.println("***************************");
       
		//
		
		Iterator<String> it =al.iterator();
		
		while(it.hasNext())
		{
			String shows = it.next();
			System.out.println(shows);
			
		}		
			
	}
		
}
