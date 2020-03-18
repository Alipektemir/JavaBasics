package SyntaxClass10;

public class TwoDimensionalMoreexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] month= {{"January", "February","December"},
				{"March","April", "May"},
				{"June", "July","August"},
				{"September","October","November" }
				
		};
		
	//	int	rows = month.length;  //how many arrays
	//	int firstArray = month[0].length;
	//	System.out.println(firstArray);
		
		for(int i=0; i<month.length; i++)  {
			for(int j=0; j<month[i].length;j++) {
				
				System.out.print(month[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
