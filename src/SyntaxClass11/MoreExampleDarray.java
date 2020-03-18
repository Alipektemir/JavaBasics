package SyntaxClass11;

public class MoreExampleDarray {

	public static void main(String[] args) {
		// Tlets create 2D array in which we store professions
		String[][] professions= {{"QA Tester", "Deveopers", "Product Owner", "Scrum  Master"},
				{"Math Teacher", "Science Teacher", "ESL Teacher"}, 
				{"Dentist", "Surgeon"}};
		//gets elements using advanced for loop
		for( String[] occup:professions) {
			for(String title:occup) {
				System.out.print(title+" ");
			}
			System.out.println();
		}
		
	}

}
