package SyntaxClass11;

public class Task2 {

	public static void main(String[] args) {
		/*Create an array of countries: 
		north america countries, south america countries, europe countries, asian countries, african countries.
		Then print all values from that array using 2 different loops and 
		calculate how many total countries been stored.
*/	int total=0;
		String[][] countries = {{"Bahamas", " Haiti"," Nicaragua"},
				{"Argentina", "Suriname", "Bolivia"}, 
				{"	Russia", "Germany", "United Kingdom"}, 
				{"China", "Mongolia","Pakistan"},
				{" Uganda	", "Mozambique", "Sudan"}};
		
		for(int x=0; x<countries.length; x++) {
			for (int y= 0; y<countries[x].length; y++)
				System.out.print(countries[x][y]+" ");
			total++; 
		System.out.println();  {
			
			}
		}System.out.println("Number of total countries: "+total);
		
		System.out.println(".............................................");
		
		for( String[] count:countries) {
			for(String region:count) {
				System.out.print(region+" ");
				total++;
			}
			System.out.println();
	}
		System.out.println("Number of total countries: "+total);
	}
}
