package CanOverrideStaticMethod;

public class TestCar {

	public static void main(String[] args) {	

	BMW bmw= new BMW();
	bmw.start(); // This is the Overridden method will be called
	bmw.stop();  // from Car class
    bmw.refule(); // from Car class
 }
}