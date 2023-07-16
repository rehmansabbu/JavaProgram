package JavaProgram;

public class CountTheReapetedWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "my name is khan is khan and java and java";
		String spWrd [] = str.split(" ");
		int wrc = 1;


		for(int i=0;i<spWrd.length;i++)
		{
			for(int j=i+1;j<spWrd.length;j++)
			{
				if(spWrd[i].equals(spWrd[j]))
				{
					wrc = wrc +1;
					spWrd[j]="0";

				}
			}



			if(spWrd[i]!="0")
			{
				System.out.println(spWrd[i] + " " +wrc);
				wrc =1;
			}
		}
		
		
		

	}

}
