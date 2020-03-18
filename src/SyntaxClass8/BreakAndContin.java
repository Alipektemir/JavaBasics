package SyntaxClass8;

public class BreakAndContin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for (int i=1; i<=10 ; i++)	{
		
		if (i==4 ) {
			System.out.println("I am stopping the loop");
			
			break;
		
		}
		System.out.println("I am inside the loop");
			System.out.println(i);
		}

		System.out.println("I am outside the loop");
		
	System.out.println("...............................CONTINOIU");
	
	for (int y=1; y<=10; y++)  {
		
		if (y==4) {
			
			System.out.println("Skip iteration");
			continue;
		}
		System.out.println("....................");
		for (int z=1; z<20; z++  ) {
			if (z==5 || z==6 || z==7)  
				break;  {
				System.out.println(z);
			}
			
		}
		
	}
	
	
	
	
	}

}
