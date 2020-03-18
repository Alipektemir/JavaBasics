package SyntaxClass5;

import java.util.Scanner;

public class ScannerANDLogical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter your born of month");
		Scanner sc = new Scanner(System.in);
		String month = sc.nextLine();
				
		
		
		
		if ((month.equals("december" )) || (month.equals("january")) || (month.equals("february")) ) 
			
			System.out.println("You born in winter");
		
	else if ((month.equals("march" )) || (month.equals("april")) || (month.equals("may")) )
		
		System.out.println("You born in spring");
		
	else if	((month.equals("June" )) || (month.equals("July")) || (month.equals("August")) )
	
		System.out.println("You born in summer");
		
	
	else 
	
		System.out.println("You born in autumn");
		
	}

}
