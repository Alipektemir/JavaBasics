package SyntaxClass6;
import java.util.Scanner;
public class SwitchwithStings {

	public static void main(String[] args) {
		

		Scanner sc;
		String country;
		String favoriteFood;
		sc = new Scanner(System.in); 
		System.out.println("Please enter your country");
		country = sc.nextLine();
		
		switch (country) {
		case "Mor":
		favoriteFood = "kek";
		break;
		case "Tr":
		favoriteFood = "kebap";	
		break;
		default:
		favoriteFood = "Unkonwn";
		}
		System.out.println("Favorite food is "+favoriteFood);
			
		
		}
		
		
	}


