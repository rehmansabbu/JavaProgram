package JavaProgram;

import java.util.HashSet;

public class RemoveDublicateEleFromArray {
	
	
	public static void main(String[]args)
	{
		
		int numArray [] = {8,8,2,3,3,4,5,5,6,7};
		
		HashSet<Integer> hashSet= new HashSet<Integer>();
		
		for(int i=0;i<=numArray.length-1;i++)
		{
			hashSet.add(numArray[i]);
		}
		
		for(int remDubEle : hashSet)
		{
			System.out.println(remDubEle + " ");
			
		}
		
		
		
	}
	

}
