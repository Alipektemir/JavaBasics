package SyntaxClass14;

public class DogPark {
	String breed;
	String color;
	String name;
	int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DogPark dog1= new DogPark();
		dog1.breed="Sivas";
		dog1.color="Brown";
		dog1.name="Pony";
		dog1.age=3;
		
		dog1.bark();
		dog1.eat();
		
	}
	void eat() {
		System.out.println(name+" can eat");
	}
	void bark()	{
		System.out.println(name+" can bark");
		
	}

}
