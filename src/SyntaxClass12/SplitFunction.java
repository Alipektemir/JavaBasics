package SyntaxClass12;

public class SplitFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(".....split() function....");
		
		String today1="Today is my favorite java class";
		String[] stringArray=today1.split("i");
		for(String arr:stringArray) {
			System.out.print(arr+"@");
		}
		System.out.println(".................");
		
		String today2="Today is my favorite java class";
		String[] words=today2.split(" ");
		for(int i=0; i<words.length; i++){
			System.out.print(words[i]);
			
			
		}
		
	}

}
