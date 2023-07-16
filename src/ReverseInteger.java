
public class ReverseInteger {
	
	public static void main(String[] args)
	
	{
		 // 1. Algorithm
		long num =  12345;  //54321
		
		long rev =  0;
		
		while(num != 0)
		{
			rev = rev * 10 + num%10; 
			num = num/10;
			
			
		}
		
		System.out.println("Reverse integer is :::::::"+rev);
		
		
		//2. StringBuffer Reverse method
		
		long num1= 123456;
		
	    StringBuffer sb=new StringBuffer(String.valueOf(num1));
	    
	    System.out.println("Buffer using reverse ::::::"+sb.reverse());
			
	}
	

}
