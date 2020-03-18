package SyntaxClass11;

public class StringDemo {

	public static void main(String[] args) {
		
		String school="Syntax  ";
		String str=new String("HELLO ");
	    String str1="This a String 767 ";
		System.out.println(school.length());
		int size= str.length();
		System.out.println("String length is "+size);
		
		//convert string to lowercase or uppercase
		System.out.println(school.toUpperCase());
		System.out.println(str.toLowerCase());
		
		str=str.toLowerCase();
		System.out.println(str);
		
		// concatinate 2 string
		String newString=str+school;
		
		System.out.println(newString);
		String day="Saturday ";
		String date="14";
		String newDate=day.concat(date);
		System.out.println(newDate);
		char grade='A';
		String str2="Student";
	//	str2.concat(grade);		//concat for only string-string
		String str4 = "     welcome to Syntax!     ";
			str4=str4.trim();
		System.out.println(str4);
		
		

	}
}
