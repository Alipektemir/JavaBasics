package SyntaxClass6;
import java.util.Scanner;
public class ScannerandSwitch {

	public static void main(String[] args) {
		
		Scanner sc;
		sc = new Scanner(System.in);
		char gender;
		String genderType;
		System.out.println("Please enter gender: M or F");
		gender= sc.next().charAt(0);
		switch (gender)  {
			case 'M':
				genderType = "Male";
				break;
			case 'F':
				genderType = "Female";
				break;
				default:
					genderType = "Unknown";
					
		}
		System.out.println("Gender type is " + genderType);
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
