package SyntaxClass4;

public class Nestedif {

	public static void main(String[] args) {
		// one if in another if

	boolean flag=true;
	boolean classToday=true;
	if (flag)	{
		System.out.println("Hello");
		if (classToday) {
			System.out.println("Hello friend");
		}else{
			System.out.println("Hello family");
			
		}
	}else {
		System.out.println("Bye");
	}
	System.out.println("I am outside of if condition");	
	}

}
