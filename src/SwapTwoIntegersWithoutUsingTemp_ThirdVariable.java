public class SwapTwoIntegersWithoutUsingTemp_ThirdVariable {

	public static void main(String[]args)
	{
		// With using Third variable

		int a=5;
		int b=10;
		
		//a=10 , b=5 (swap)
		/*

		int temp;

		temp = a;  // 5

		a = b ; //10

		b =  temp;
		*/ 
		
		// Without using third variable + (operator)

       a= a+b; //15
       b= a-b; //5
       a= a-b; //15-5 = 10ss


    // Without using third variable * (operator)
	/*
	 * a = a*b; //50 b = a/b ; // 5 a = a/b ;// 50 /5 = 10
	 */		
		System.out.println(a);
		System.out.println(b);

	}

}
