package ArrayManipulation;

public class InsertElementInArray {

	public static void main(String[]args)
	{
		int [] a = new int [5];

		/*
		 * a[0] = 10; 
		 * a[1] = 20;
		 *  a[2] = 30; 
		 *  a[3] = 40; 
		 *  a[4] = 50;
		 */
		//a[5] = 60; Array index out of bond
		// We can insert by j Loop

		for(int j=0; j<a.length;j++)
		{
			a[j] = j;
		}

		for(int i=0;i<a.length;i++)
		{

			System.out.println(a[i]);

		}


	}






}