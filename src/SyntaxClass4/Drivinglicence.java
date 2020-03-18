package SyntaxClass4;

import java.util.Scanner;

public class Drivinglicence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("What is your age?");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("You are eligible for licence");
		}else {
			System.out.println("Sorry permit only");
		}
		
		
		
	}

}
