package JavaProgram;

public class CountTheWord {
	
	
	public static void main(String[]args)
	{
		
		String str ="sabbu rehman zikra jabeen";
		
		int count =1;
		
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)== ' ') && (str.charAt(i+1)!=' '))
			{
				
				count++;
				
			}
			
		}
		
		System.out.println(count);
		
		
	}
	

}
