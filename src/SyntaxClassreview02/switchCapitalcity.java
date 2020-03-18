package SyntaxClassreview02;
import java.util.Scanner;

public class switchCapitalcity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Which country?");
		Scanner sc = new Scanner(System.in);
		String country =sc.nextLine();
		String capitalcity = "";
		
		switch (country) {
		case "US":
			capitalcity = "washington DC";
		break;
		case "Russia":
			capitalcity = "Moscow";
		break;	
		case "Turkey":
			capitalcity = "Ankara";
		break;	
		case "Kyrgyzstan":
			capitalcity = "Bishkek";
		break;	
		default:
			capitalcity = "Invalid";
		
		break;
		
		
		
		
		
		
		
		}
		
		System.out.println("The capital city of "+capitalcity+"");
		
		
		
		
	}

}
