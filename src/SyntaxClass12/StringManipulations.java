package SyntaxClass12;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Good Morning Students!";
System.out.println("charAt() function");
	char letter1 = str.charAt(0);
	System.out.println(letter1);
		
	
	char letter5=str.charAt(4);
	System.out.println("Letter at index 4 is"+letter5+".");
	
	//get all characters one by one froma string?
	char letters;
	for(int i=0; i<str.length(); i++) {
		letters=str.charAt(i);
		System.out.print(letters+" ");
	}
	
	//System.out.println("........indexOf() function"..);
	String name="Syntax Technologies";
	int index=name.indexOf("y");
	System.out.println(index);
	index=name.indexOf("Syntax");
	System.out.println(index);
	
	int index1;
	index1=name.indexOf("!");
	System.out.println(index1);
	
	
	index1=name.indexOf("Technologies");
	System.out.println(index);
	name.indexOf("o");
	System.out.println("Index of first o="+index1);  {
		name.lastIndexOf("o");
		System.out.println("Index of second o="+index1);
	}
	}

}
