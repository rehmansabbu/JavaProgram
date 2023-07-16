package JavaProgram;

public class ReplaceVowelStar {
	
	
	public static void main(String[] arg)
	
	{
		String str = "My Name Is Khan";
		String replaceStar = str.replaceAll("[AEIOUaeiou]", "*");
		System.out.println("String is :"+replaceStar);
	}

	
	

}
