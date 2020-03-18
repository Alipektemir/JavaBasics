package SyntaxClass11;

public class StringValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Welcome Syntax students";
		String str2="Welcome Syntax Students";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		
		String expected="Home-Synt Techno";
		String actual= "Home-Synt Techno ";
		if(actual.contentEquals(expected)) {
			System.out.println("Teast case pass.");
		}else {
			System.out.println("Teast case failed.");
			if(actual.trim().contentEquals(expected)) {
				System.out.println("Teast case pass.");	
			}else {
				System.out.println();
			}
	}
	
	}

}
