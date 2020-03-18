package SyntaxClass11;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="Hello";
		String str2=new String("Hello");
		String str3="Hello";
		
		if (str1.equals(str2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
			
		System.out.println("Comparing using ==Operator");
		
		
	}

}
