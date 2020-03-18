package SyntaxClass8;
import java.util.Scanner;
public class LoopREview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		/*
		 * Ask a user to pay for a candy
		 * as long as the entered price is not 2
		 * we need to keep asking
		 * one omunt is correct "enjoy"	
		*/
		
		Scanner sn;
		double price;
		sn= new Scanner(System.in);
		do {
			System.out.println("Please pay");
			price= sn.nextDouble();
			
		}while (price!=2);
		System.out.println("Enjoy");
		
		
		
		
		
		
		
		
	}

}
