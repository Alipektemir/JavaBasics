package SyntaxClass10;

public class RetrieveElemts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		//getting all elements
		for (int i=0; i<grades.length; i++) {
			System.out.print(grades[i]);
		}
		System.out.println();
		System.out.println("printing using advanced for loop...");
		
		for(char grade:grades) {
			
			System.out.print(grade+" ");
			System.out.println();
			
		}System.out.println("............");

		//create an array of fruits and retrieve all elemnts
		
		String[] fruits = {"ban","ap","mango"}  ;
		//advanced for loop,enhanced for loop,for each loop
		for(String fruit:fruits)  {
			if(fruit.equals("ap")) {
				System.out.println(fruit+" your fv food ");
			}else
			System.out.println(fruit);
		}
		for(int i=0; i<fruits.length; i++)  {
			System.out.println(fruits[i]);
		}
		
		
	}

}
