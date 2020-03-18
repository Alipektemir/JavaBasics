package SyntaxClass8;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input=new Scanner (System.in);
		boolean answer;
		for (int x=1; x<=10;x++) {
			System.out.println("Please apply for credit card");
			 answer=input.nextBoolean();
			 if (answer==true) {
				System.out.println("We glad to help you");
		    break;
			 }
		}
		System.out.println(" ");
	}
		
		
	}


