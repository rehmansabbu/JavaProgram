package JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCountCharacter {
	
	public static void main(String[]args)
	{
		
		countCharacter("abbcdd");
		
	}
	
	public static void countCharacter(String name)
	{
		
		Map<Character, Integer> dupCountChar = new HashMap<Character, Integer>();
		
		char chrArray[] = name.toCharArray();
		
		for(char c : chrArray)
		{			
			if(dupCountChar.containsKey(c))
			{
				dupCountChar.put(c, dupCountChar.get(c)+1);
			}
			
			else {
				
				dupCountChar.put(c, 1);
			}
			
		}
		
		System.out.println(name +"::"+ dupCountChar);
		
	}
	
	

}
