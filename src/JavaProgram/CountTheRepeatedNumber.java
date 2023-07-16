package JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class CountTheRepeatedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {10,20,10,30,40,20};
		int size = arr.length;
		countTheRepeatedNum(arr, size);
	}

	public static void countTheRepeatedNum(int arr[] , int size)
	{
		HashMap<Integer, Integer> hashMap = new HashMap<Integer,Integer>();	

		for(int i=0;i<arr.length;i++)
		{
			if(hashMap.containsKey(arr[i]))
			{
				hashMap.put(arr[i],hashMap.get(arr[i])+1);
			}

			else
			{
				hashMap.put(arr[i], 1);
			}
		}



		for( Map.Entry entry:hashMap.entrySet())
		{
			System.out.println(entry.getKey() + " " +entry.getValue());
		}

	}
}