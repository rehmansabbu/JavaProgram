package JavaProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayWithoutUsingNewArray 

{
	
	public static void main(String[] args)
	
	{		
		int[] arr = {2, 3, 6, 7, 1, 5, 4};
		String[] arrStr = {"One", "Two", "Three", "Four", "Five"};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrStr));
		
 ArrayList<Integer> intArr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
	   Collections.reverse(intArr);
	   System.out.println(intArr);
	   
 ArrayList<String> strArr = new ArrayList<>(Arrays.asList("One", "Two", "Three", "Four"));
	   Collections.reverse(strArr);
	   System.out.println(strArr);
		
	}


}
