package JavaProgram;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
	
	
	public static void main(String[]args)
	{
		
		String input = "My name is khan name khan";
		String [] arr = input.split(" ");
		
		Set<String> set = new LinkedHashSet<String>();
		
		for(String word : arr)
		{
			set.add(word);
		}
			Iterator itr = set.iterator();
			
			while(itr.hasNext())
			{
				System.out.print(itr.next() +" ");
			}
			
		}
		
		
		
		
		
	}
	
	
	


