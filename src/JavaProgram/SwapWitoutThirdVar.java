package JavaProgram;

public class SwapWitoutThirdVar {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;		
		System.out.println("Before Swap of a and b : "+x +" and "+y);
		x = x + y; // 10 + 20 = 30
	    y = x - y; // 30 - 20 = 10
		x = x - y; // 30 - 10 = 20;		
		System.out.println("After Swap of a and b : "+x +" and "+y);
	}


}
