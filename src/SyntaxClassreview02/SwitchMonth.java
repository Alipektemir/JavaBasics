package SyntaxClassreview02;
import java.util.Scanner;
public class SwitchMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number for the month");
		int month = sc.nextInt();
		
		
		String monthString;
		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
									
		case 9:
			monthString = "May";
		   break;						
		case 10:
			monthString = "May";
			break;
		case 11:
			monthString = "May";
			break;
		case 12:
			monthString = "May";
			break;
			default:
			monthString = "May";
			break;
									
									
		}
		
		
		
		
		System.out.println("The month is " +monthString );
		
	}

}
