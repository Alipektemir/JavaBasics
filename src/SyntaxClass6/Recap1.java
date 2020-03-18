package SyntaxClass6;

import java.util.Scanner;
public class Recap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1= sc.nextInt();
		System.out.println("Please enter second number");
		int num2= sc.nextInt();
		System.out.println("Please enter third number");  
		int num3= sc.nextInt();
		
		int largest =0;
		
	if (num1>num2 && num1>num3) {
	
			largest = num1; 
		}else if
			(num2>num1 && num2>num3) {
				largest = num2; 
			
		}else {
				largest = num2;
		}
			
		System.out.println("the largest number is " + largest);
		
		
		
		
	}

}
