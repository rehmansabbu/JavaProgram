package JavaProgram;

public class CapitalizeFirstChar {
	
	
	public static void main(String[] args) {
		 
	      String str = "this sentence needs to be capitalized";
	      String wordSplit[]=str.split(" ");
	      
	      for(String words:wordSplit)
	      {
	    	 String StringCapitalizeFirstChar = words.substring(0, 1).toUpperCase()+ words.substring(1,words.length());
	    	 
	    	 System.out.print(StringCapitalizeFirstChar);
	      }
	}

		

}
