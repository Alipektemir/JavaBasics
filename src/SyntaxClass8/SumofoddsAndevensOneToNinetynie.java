package SyntaxClass8;
import java.util.Scanner;
public class SumofoddsAndevensOneToNinetynie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//sum of odds and evens from 1 to 99
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Please write number range");
		
		int i = sc.nextInt();
		int s = sc.nextInt();
		
			if (i % 2 != 0 || i %2 !=1) {
				s = s + i;
			
				

		System.out.println("The Sum Of " + i + " to " + s + " Odd and Even Numbers are: " + s);
		
	}	
		
	}

}
