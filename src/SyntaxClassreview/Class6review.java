package SyntaxClassreview;
import java.util.Scanner;


public class Class6review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc;
		String country;
		String favoriteFood;
		Scanner scanner = sc = new Scanner(System.in);
		System.out.println("Please enter your country");
		country = sc.nextLine();
		switch (country) {
		case "Morocco":
			favoriteFood = "couscous";
			break;
			case "Belarus":
				favoriteFood = "Potato";
				break;
		default:
			favoriteFood = "Unknown";
			break;
			
			
		
		
		
		
		}
		
		System.out.println(("favorite food is ") + favoriteFood);
		
		
		
	}

}
