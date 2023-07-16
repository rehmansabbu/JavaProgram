import java.util.HashSet;
import java.util.Set;

public class DublicateElementInArray {
	
	public static void main(String[]args)
	{
		
		System.out.println("********** By String *********");
		// 1.solution - worst process
		String names[]= {"java" , "javascript" ,"C++", "python" , "Ruby", "C++" , "javascript"}; 
		int count = 1;
		
		for(int i=0;i<names.length;i++)
		{
			
			for(int j =i+1; j<names.length;j++)
			{
				if(names[i].equalsIgnoreCase(names[j]))
				{
					
					System.out.println("Dublicate Elelment is  ::::::::" +names[i] );
				}
			}
		}
		
		// 2.solution is HashSet - Java collections - its store Unique value
		
		System.out.println("********** By HashSet **********");
		
		Set<String> store = new HashSet<String>();
		
		for(String name :names)
		{
			if(store.add(name)  == false)
			{
				System.out.println("Dublicate Elelment is by hashset  ::::::::" +name);
			}
		}
		
		// 3. solution is HashMap--it stores key(unique),values(can be dublicate) pairs
		
		System.out.println("*********** By Hashmap ***********");
		
		
	}
	

}
