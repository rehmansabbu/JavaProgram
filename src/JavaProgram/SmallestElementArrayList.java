package JavaProgram;

public class SmallestElementArrayList {
	
	
	public static void  main(String[] args)
	
	{
		int arr[] ={30, 90, 10, 40, 60};
		int smallest = arr[0];
		int secondSmallest = arr[0];
		
		for (int i = 0; i < arr.length; i++)
		
		{	
			if(arr[i] < smallest)
			{
				secondSmallest = smallest;
				smallest = arr[i];
			} 
			
			else if(arr[i] < secondSmallest)
			
			{
				secondSmallest = arr[i];
			}
		}
		System.out.println("Smallest Element is : "+smallest);
		System.out.println("Second Smallest Element is : "+secondSmallest);
	}	

	

}
