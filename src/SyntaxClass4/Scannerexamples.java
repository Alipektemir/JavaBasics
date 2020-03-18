package SyntaxClass4;
import java.util.Scanner;
public class Scannerexamples {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	System.out.println(" Please enter your first number");
	int num1=sc.nextInt();
	System.out.println(" Please enter your second number");
	int num2=sc.nextInt();
	System.out.println(num1);
	System.out.println(num2);
	
	if (num1>num2) {
		System.out.println(num1+" is larger than "+num2);
	}else if (num2==num1) {
		System.out.println(num1+" is equal to "+num2);
	}else {
		System.out.println(num2+" is larger than "+num1);
	}
	}

}
