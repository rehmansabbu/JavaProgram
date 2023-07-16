package JavaProgram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElement {
	
	
	public static void main(String[] args) {
		String str = "my name is sabbu";
		System.out.println(removeDuplicateString(str) +"  ");
		
	}
	
	public static String removeDuplicateString(String str)
	{
		Set<Character> set = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		
		
		for(int i=0;i<str.length();i++)
		{
			Character ch = str.charAt(i);
			if(!set.contains(ch))
			{
				set.add(ch);
				sb.append(ch);
			}
						
		}		
		return sb.toString();
		
		
	}
	
}


