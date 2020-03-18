package SyntaxClass12;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		/* Create a String and if the String
		is not empty perform the following:
		if the String has an odd number of 
		characters and has 3 or more characters,
		print the character in the middle of the String
*/
		
		String str= "Hello";
		
		if(!(str.isEmpty())) {
			if (str.length()%2!=0 && str.length()>3)  {
				
				int len=str.length();
				int c=len/2;
				char ch[]=str.toCharArray();
				System.out.println("Middle Character is: "+ch[c]);
			}
		}
		
		
	}

}
