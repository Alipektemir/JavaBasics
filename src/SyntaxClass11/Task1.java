package SyntaxClass11;

public class Task1 {

	public static void main(String[] args) {
		/*Create an array of cars :
			american, german, korean, italian.
			Then retrieve all values from that array using 2 different loops
*/
		String [][] brend = {{"american","wdd","gfe"}, {"german","dwqd","adxa"}, {"korean","dws","adxa"}, {"italian","das","dasd"}};
		for (String [] car:brend) {
			for(String mod:car) {
				System.out.print(mod+" ");
			}
		
		System.out.println();
		}
	}

}
