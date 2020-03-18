package SyntaxClass7;
import java.util.Scanner;


public class LoopsAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// we want yo ask users name and print good afternoon
		
		Scanner sc;
		String name;
		int num=1;
		
		
		sc = new Scanner (System.in);
		
		while(num<=3) {
		System.out.println("What is your name?");
		
		
		name = sc.nextLine();
		System.out.println( "Good aftenoon "+name);
		num++;
		
		  }
		
		
		
		
		
	}

}
