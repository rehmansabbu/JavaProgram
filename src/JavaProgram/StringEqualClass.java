package JavaProgram;

public class StringEqualClass {
	
	public static void main(String[] args) {

		String str1 = "10";
		String str2 = new String("20");
		String str3 = new String("10");
		
		System.out.println("str1 == str2 is : "+str1 == str2);  // false
		System.out.println("str2 == str3 is : "+str2 == str3);  // false
		System.out.println("str1 == str3 is : "+str1 == str3);  // false
		
		System.out.println("str1.equals(str2) is : "+str1.equals(str2));  // false
		System.out.println("str2.equals(str3) is : "+str2.equals(str3));  // false
		System.out.println("str1.equals(str3) is : "+str1.equals(str3));  // true
		
//------------------------------------------------------------------------------------------------------------------------------
		String str4 = "hello";
		String str5 = "hello";

		System.out.println(str4.equals(str5));  // true
		System.out.println(str4 == str5);  // true	
   
        String a = "meow";
		String ab = a + "deal";
		String abc = "meowdeal";
		
		System.out.println(ab.equals(abc)); // true
		System.out.println(ab == abc); // false
		
        String a1 = new String("abc");
		String ab1 = new String("abc");
		
		System.out.println(a1.equals(ab1)); // true
		System.out.println(a1 == ab1); // false


	}

	

}
