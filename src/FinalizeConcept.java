public class FinalizeConcept {
	
	
	public void finalize()
	{
		
		System.out.println("Finalize Method....");
	}
	
	
	
	public static void main (String[]args)
	{
		
     // Finalize is something related to Garbage collector
	// Finalize keyword method basically used to perform the cleanup memory processing
    // In side the memory lot of garbage is their and lot of object are their , its doesn,t have any references
	// Just before we are calling the garbage collector ,if you declare particular method  as a FINALIZE then before the garbage
	// collector , it will start the clean up the process.
	// before the garbage collector first it will call finalize method , just for cleanup process of object
		
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		 f1 =  null;
		 f2 =  null;
		 
		 System.gc();
		
	}
	

}
