package JavaProgram;

public class PrimeNumber {
	
	
	public static void main(String[]args)
	{
		int num=8;
		int flag =0;
		
		
		if(num ==0|| num==1)
		{
			System.out.println(num +" Not Prime number");
		}
		
		else
		{
			for(int i=2;i<num/2;i++)
			{
				if( num%2 == 0 )
				{
					System.out.println(num +" Not prime number ");
					flag =1;
					break;
				}
			}
		}
		
		
		if(flag==0)
		{
			System.out.println(num + " Prime number");
		}
	}
	

}
