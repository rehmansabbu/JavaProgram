package JavaProgram;

public class ReverseOfWord {
	
	/*
	public static void main(String[]args)
	{
		String str = "tsil fo avaj";
		
		String spWrd[] =str.split("");
		String rev = "";
		
		for(int i=0;i<=spWrd.length-1;i++)
		{
			String wrd = spWrd[i];
			String revWrd = " ";
			
			
			for(int j=wrd.length()-1; j>=0; j--)
			{
				revWrd = revWrd + wrd.charAt(j);
			}
			
			rev = rev + revWrd + " ";
			
		}
		
		
		System.out.println(rev);
		
		
		
	}
	
	
	*/
	
	public static void main(String[]args)
	{
		String str = "java programing";
		
		String [] wSplit =str.split(" ");
		String revChar = "";
		
		for(int i=0;i<wSplit.length;i++)
		{
			String word=wSplit[i];
			
			String revWord ="";
			
			for(int j = word.length()-1;j>=0;j--)
			{
				
				revWord = revWord + word.charAt(j);
				
			}
			
			revChar = revChar + revWord + " ";
			
		}
		
		
		System.out.println("Before reverse of Char word " + " " +str);
		System.out.println(revChar);
		
			
	}	
	
	
}
