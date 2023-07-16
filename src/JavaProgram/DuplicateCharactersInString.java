package JavaProgram;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharactersInString {
	/*
	public static void main(String[] args) {
		String str = "mansuralam";
	HashMap<Character, Integer> charCountMap = new HashMap<Character,Integer>();
		// Converting given string to char array
		char[] strArray = str.toCharArray();
		// checking each char of strArray
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
			// If char is present in charCountMap, incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
// If char is not present in charCountMap,  putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
		}
		// Getting a Set containing all keys of charCountMap
		Set<Character> charsInString = charCountMap.keySet();
		System.out.println("Duplicate Characters In " + str);
		// Iterating through Set 'charsInString'
		for (Character ch : charsInString) {
			if (charCountMap.get(ch) > 1) {
				// If any char has a count of more than 1, printing it's count
				System.out.println(ch + " : " + charCountMap.get(ch));
			}
		}
	}

*/
	
	public static void main(String[]args)
	{
		findDuplicate("code decode");
		
		System.out.println(findDuplicate("decode"));
	}
	

	public static Set<Character> findDuplicate(String str)
	{
		Set<Character> duplicate = new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++)
		{
			for(int j= i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					duplicate.add(str.charAt(j));
				}
			}
		}
				
		return duplicate;
		
	}
	
}
