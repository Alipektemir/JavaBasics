package SyntaxClass6;
import java.util.Scanner;
public class AllinOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;
		String sale;
		double price;
		double discount;
		double finalPrice;
		
		scan = new Scanner(System.in);
		System.out.println("Do you have sale?");
		sale = scan.nextLine();
		if (sale.equalsIgnoreCase("Yes")) {
			System.out.println("How much?");	
			price=scan.nextDouble();
			if (price<=20) {
				discount=price*0.1;
			}else if (price>20 && price<100) {
				discount=price*0.2;	
			}else if (price>100 && price<=500) {
				discount=price*0.3;  
					
				}else {
					discount=price*0.5;  }
					finalPrice = price - discount;
				
				
			
			
			System.out.println("After discount " +discount +" the price is reduced from " +price +" to "+finalPrice);
			
			
			
			
		}else {
			System.out.println("No shoping");
		}
				
			}
				
		
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


