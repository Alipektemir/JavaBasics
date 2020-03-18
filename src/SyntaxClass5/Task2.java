package SyntaxClass5;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*   Write a program that will print whether it 
		 * is a weekend or weekday. If any day from 1-5 → output “It is a weekday”, 
		 * any day from 6-7 → output “It is a weekend”, 
		 * any other day → output “Invalid day”  */
			
		
		int day=1;
		if (day>5 && day<=7) {
			System.out.println("It is a weekend");
		}else if (day>6 && day<=7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("It is a weekday");
	}

}
}