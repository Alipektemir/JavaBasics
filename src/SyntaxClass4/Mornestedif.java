package SyntaxClass4;

public class Mornestedif {

	public static void main(String[] args) {
		// declare date and day
		// if day is Friday =if date is 13=watch ascary movie
		// =if date is not 13 =watch a comedy
		boolean isFriday=false;
		int date=13;
		if (isFriday) {
			System.out.println("Today is not Friday, i am going to a movie");
		if(date==13)	{
			System.out.println("I will watch scary movie");
		}else 	 {
			System.out.println("I will watch comedy movie");
		}
		}else {
			System.out.println("Today is not Friday, i am staying at home");
		}
		
		
	}

}
