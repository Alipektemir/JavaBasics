package SyntaxClassreview02;
import java.util.Scanner;
public class ReviewTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int total=0;
		System.out.println("Enter a number. to stop enter -1");
		int number = sc.nextInt();
		
  while (number!=-1) {
		total +=number;   
		number = sc.nextInt();	
  System.out.println("Total number is: " + total);
	
		
	  
	
  }
	}
}