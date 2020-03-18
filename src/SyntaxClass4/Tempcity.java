package SyntaxClass4;
import java.util.Scanner;
public class Tempcity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("What City?");
		String city = scan.nextLine();
		System.out.println("What temperature?");
		int temp = scan.nextInt();
		int transfer=((temp-32)*5/9);
		System.out.println("The temperature is the city "+city+" is "+temp);
	}

}
