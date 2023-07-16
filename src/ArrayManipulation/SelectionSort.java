package ArrayManipulation;

public class SelectionSort {
	
	public static void main(String[]args)
	{
		int a[] = {38,52,9,18,6,62,13};
		int min ;
		int temp;
		
		  for(int i=0;i<a.length;i++)
		  {
			   min=i;
			  
			  for(int j=i+1;j<a.length;j++)
			  {
				  if(a[j]<a[min])
				  {
				     min = j;
				  }
				  
			  }
			  
			  
			  
			  
		  }
		
		
		
		
	}
	
	
	
	

}
