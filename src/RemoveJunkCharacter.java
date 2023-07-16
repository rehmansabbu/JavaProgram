
public class RemoveJunkCharacter {
	
	
	public static void main(String[]args)
	{
		
		String s= "&&&&&7%%%%%%%%%%% My Name is Khan 2222222@@@@@@@@";
		
		//Regular expression i have to use
		
		s=s.replaceAll("[^a-zA-Z]", ""); // ^ - Not replace
		
		System.out.println("Final replacement:::::::::"+s);
		
		
        s=s.replaceAll("[^a-zA-Z0-9]", ""); // ^ - Not replace
		
		System.out.println("Final replacement:::::::::"+s);
				
		
	}
	

}
