public class employee {
	
	String name;
	int rollNo;
	String city;
	 
	public static void main(String[]args)
	{
		employee e1=new employee();
		 
		e1.name="Sanju";
		e1.rollNo=123;
		e1.city= "blre";
		 
		employee e2=new employee();
		 
		e2.name="Sonu";
		e2.rollNo=456;
		e2.city="pune";
		 
		employee e3=new employee();
		 
		e3.name="Sagar";
		e3.rollNo=789;
		e3.city="Delhi";
		 
		e1=e2;  
		e2=e3; 
		e3=e1; 
		 
		System.out.println(e3.name);
		 
		System.out.println(e3.rollNo);
		 
		System.out.println(e3.city); 
		 
		}
			
		
		
	}
	
	
	
	
	


