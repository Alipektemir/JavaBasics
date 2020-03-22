package SyntaxClass15;

public class Methods {

	//create amethod that will say welcome 10 times
	void sayWelcome() {
		for(int i=0; i<10; i++) {
			System.out.println("Welcome");
		}
	}
	void sayAnything(String word, int times) {
		for(int i=1; i<=times; i++) {
			System.out.println(word);
		}
	}
	//create a method isItRaining that will 
	//accept boolean value as a 
	//parameter, will print message accorgingly
	void isItRaining(boolean isRain) {
		if(isRain) {
			System.out.println("It is raining stay home and learn java");
		}else {
	System.out.println("It is not raining go for a walk");
		}
	}
	
	
	
}
