import java.util.Arrays;

public class FindLargestAndSmallestInArray {
	
	public static void main(String[]args)
	{
		int numbers[]= {5,2,1,8,9};
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
			{
			 largest=numbers[i];
			}
			else if(numbers[i] < smallest)
			{
				 smallest=numbers[i];
			}
			
		}
		
		System.out.println("Given array is::::::" +Arrays.toString(numbers));
		System.out.println("largest number is :::::" +largest);
		System.out.println("Smallest number is :::::" +smallest);
		
		
		
		
	}
	
	
	
	
	
	
	

}
