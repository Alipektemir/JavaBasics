package SyntaxClass12;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="   Good morning    ";
		str =str.trim();
		System.out.println(str);

System.out.println("...........................");
		
		String str1= "";
		
		System.out.println(str1.isEmpty());
		
		System.out.println("............................");
		String str2= "Good Morning ";
		String str3="Students ";
		String str4="!";
		str2=str2.concat(str3).concat(str4);
		System.out.println(str2);
		
		System.out.println("...........");
		
		str2=str2.    trim().    concat(str4);
		System.out.println(str2);
		
		System.out.println("................");
		String str6=" Hello ";
		String str7="Syntax";
		

		//str6=str6.trim().concat(str7);
		//HelloSyntax
		str6=str6.concat(str7).trim();
		System.out.println(str6);
		//Hello Syntax

		
		
	}

}
