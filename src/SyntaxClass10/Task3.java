package SyntaxClass10;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String[] countries= {"Tur", "Italy", "USA", "Netherlands"};
  for(String country:countries) {
		System.out.println(country);
		
	if (country.equals("Tur")) {
		System.out.println("Capital city of "+country+" is Ankara");
	} else 	if (country.equals("Italy")) {
		System.out.println("Capital city of "+country+" is Paris");  }
			
		 else 	if (country.equals("USA")) {
			System.out.println("Capital city of "+country+" is Washington");
	
		}else {
			System.out.println("Capital city of "+country+" is Amsterdam");

		}

		
		
			}	
	
	}
}
