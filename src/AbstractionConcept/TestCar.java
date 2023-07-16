package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {
	
		
		Bmw bmw=new Bmw();
		bmw.start();
		bmw.stop();
		bmw.refule();
		
		Car car = new Bmw();
		car.start();
		car.stop();
		car.refule();
		//car.thredSafe();   we cannot call
		
	
	}

}
