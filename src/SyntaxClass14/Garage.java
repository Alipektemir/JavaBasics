package SyntaxClass14;

public class Garage {

	public static void main(String[] args) {
		// build individual objects
		Car car1=new Car();
		car1.make="Lamburgini";
		car1.model="Gallardo";
		car1.year=2020;
		car1.color="Blue";
		
		Car car2=new Car();
		car2.make="BMW";
		car2.model="m5";
		car2.year=2020;
		car2.color="Black";
		System.out.println(car1.make);
		car1.drive();
		car1.stop();
		
		Car car3=new Car();
		car3.make="Honda";
		car3.speed=200;
		//print BMW
		System.out.println(car2.make);
		
		//I drive black bmw
		System.out.println("I drive "+car2.color+" "+car2.make);
		//new bike(); cannor create an oblcest if you dont have a class
		
		car2.drive();
		car2.stop();
	}

}
