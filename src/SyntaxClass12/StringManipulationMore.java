package SyntaxClass12;

public class StringManipulationMore {

	public static void main(String[] args) {
		// to get a substring from a given string
		//substring=String inside your string

		System.out.println("---substring() FUNCTION");
	String str= "Today is rainy day";
	String partialString=str.substring(15);
	 partialString=str.substring(5);
	System.out.println(partialString);
	partialString=str.substring(8);
	System.out.println(partialString);
	
	partialString=str.substring(0, 5);
	
	System.out.println(partialString);
	
	partialString=str.substring(9, 18);
System.out.println(partialString);

	
	}

}
