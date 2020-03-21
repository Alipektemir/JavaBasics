package SyntaxClass13;

public class Q5 {

	public static void main(String[] args) {
		// Reverse string
		String reversed="";
		String given="I Iove Java";
		for(int i=given.length()-1; i>=0; i--) {
			reversed=reversed+given.charAt(i);
			
		}
		System.out.println("Reversed String = "+reversed);
		
	}

}
