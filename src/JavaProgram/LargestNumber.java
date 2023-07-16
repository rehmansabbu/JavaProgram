package JavaProgram;

public class LargestNumber {
	
public static void main(String args[]) 
{
		
		int[] arr = {20, 30, 200, 4, 71, 100};
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) 
		{
			
			System.out.println("Given number is : "+ arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}		
		}
		
		
		System.out.println("\n");
		System.out.println("Max number is : "+max);
	}


}
