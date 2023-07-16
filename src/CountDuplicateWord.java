import java.util.HashMap;
import java.util.Map;

public class CountDuplicateWord {
	
	
	public static void main(String[]args)
	{
		duplicateWord("Java is a good language and is java");
		
	}
	
	public static void duplicateWord(String inputData)
	{
		
		//Split
		
		String words[] = inputData.split("");
		
		// Create one HashMap
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		// To check Each word is given Array
		
		for(String word : words)
		{
			//if word is present
			
			if(wordCount.containsKey(word))
			{
				wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
				
			}
			
			else
			{
				wordCount.put(word, 1);
			}
			
		}
		
		
		
	}
	

}
