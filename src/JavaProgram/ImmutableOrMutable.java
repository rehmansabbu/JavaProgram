package JavaProgram;

public class ImmutableOrMutable {
	
	
public static void main(String[] args) {
		
		String str1 = "abc";  // immutable
		System.out.println("Before Value of str1 : "+str1);
		str1 = str1 + "xyz";
		System.out.println("After add string : "+str1); // mutable // output : abcxyz	
	}

	
	
	

}
