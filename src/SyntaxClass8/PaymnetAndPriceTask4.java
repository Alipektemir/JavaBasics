package SyntaxClass8;
import java.util.Scanner;
public class PaymnetAndPriceTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to ask a user to enter item 
		 * they want to buy and the price of that item. 
		 * Every time user enters money accumulate the 
		 * amount and tell the user how much is left to pay off the amount.
		 *  If user give more money program should return a change. 
		 *  Whenever a user done with payments program should say “Thank you for shopping!”
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("item and price");
		
		String item;
		double price;
		double amount=0;
		double change;	
		double money;	
		double remainingBalance;
			System.out.println("What to buy");
			item=sc.nextLine();
			System.out.println("price" +item);
			price = sc.nextDouble();
			
			do {
				System.out.println("Payment");
				money=sc.nextDouble();
				amount = amount+money;
				
				if (amount<price) {
					remainingBalance=price-money;
					System.out.println("Please give more " +remainingBalance);
					
				}else if (amount>price) {
					change=amount-price;
					System.out.println("Here is your change " +change );
					break;
				}else {
					System.out.println("We got correct paymnet");
				}
				
				
			}while(price!=amount);
			
			System.out.println("Thank you for shopping");
	}

}
