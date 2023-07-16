
public class StringManipulation {

	public static void main(String[]args)
	{

		//String is the collection of different character  , Which is written in Double Qoute

		String str = "I am automation Expert using Java & Selenium"; // Always start from Zero(0) Index. --> 0 - 43 Means - 44 size 
		String str1 = "I am automation expert using Java & Selenium";

		int lenth = str.length();

		System.out.println(lenth);  //44

		// how to know which character is present in 10th Index

		System.out.println("character is present in 10th Index------->"+str.charAt(10));  //a

		// what are the index of [a]

		System.out.println("a index is ------>" +str.indexOf("a")); //This is the first occurence of a

		// Next postion of character
		System.out.println("Next postion of character is ----> " +str.indexOf("a", str.indexOf("a")+1));
		//This is the second occurence of a

		System.out.println("index is ------>"  +str.indexOf("using")); //23

		// if String is not available in str -----hello

		System.out.println(str.indexOf("hello"));  // -1 , it will not give exception or error , it will give -1


		System.out.println(str.equals(str1));   // False

		System.out.println(str.equalsIgnoreCase(str1));   // True


		// If i want to fetch Range

		System.out.println("Fetch Range ------>" +str.substring(16, 44));



		// Trim -> Means remove the space , Trim() method only remove the space , Before Space & After Space

		String removeSpace=" Hello World ";

		System.out.println("Remove space is ::::---->" +removeSpace.trim());

		// Replace -> remove old character 
		System.out.println(removeSpace.replace(" ", ""));

		String date = "20-02-2020";
		System.out.println("After Replace" +date.replace("-", "/"));

		//concat

		
		String s3 = "sabbu_";
		System.out.println(s3.concat("R"));

		String x = "Hello";
		String y = "World";
		System.out.println(x+y); //HelloWorld

		int a = 100;
		int b = 200;
		System.out.println(a+b);  // 300

		System.out.println(x+y+a+b); //HelloWorld100200 // from left to right to ADD
		System.out.println(a+b+x+y);  //300HelloWorld
		System.out.println(x+y+(a+b)); //HelloWorld300



		// Split

		String s = "I_Am_Automation_Tester"; //multiple String for split so i have to use String array

		String stri[] = s.split("_");

		for(int i=0; i<=s.length();i++)
		{
			System.out.println(stri[i]);
		}


	}


}
