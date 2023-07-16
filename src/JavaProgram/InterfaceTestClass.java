
package JavaProgram;


	interface Abc {
		 void function1();
		 
	}

	public class InterfaceTestClass {
		
		public static void  main(String[] args) {
				
			 Abc obj = new Abc() {
				
				@Override
				public void function1() {
					// TODO Auto-generated method stub
					System.out.println("Hi");
				}
			};
		}	
	}

	
	
	
	
	


