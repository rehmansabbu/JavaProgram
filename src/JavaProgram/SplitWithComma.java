package JavaProgram;

public class SplitWithComma {
	
	
	public static void main(String[] args) {
		String str = "Welcome,to,Candid Java Program";
		String[] splitComma = str.split(",");
		
		for (int i = 0; i < splitComma.length; i++) {
			System.out.println(splitComma[i]);
		}	
	}

	
	

}
