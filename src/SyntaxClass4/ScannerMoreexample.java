package SyntaxClass4;
import java.util.Scanner;public class ScannerMoreexample {
public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);

		System.out.println(" Please enter your loan amount");
		int loan=input.nextInt();
		System.out.println(loan);
		if (loan<=200000) {
			System.out.println("Congratulations you will get the money");
		}else {
			System.out.println("Sorry it is too high to give");
		}
		
	}

}
