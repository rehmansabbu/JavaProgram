package JavaProgram;

public class CountWordsOfCapitalized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="abcdEfG";
		
		int count = 0;
		
		for(int i=0; i<s.length();i++)
		{
			
			if(s.charAt(i)>= 'A' & s.charAt(i)<='Z')
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		

	}

}
