package SyntaxClass2;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 1000000;
		int remainder;
		String durum ="";
		for (int u = 1; u <= b; u++) {
			remainder = (a*u)%2;
			if (remainder == 1) {
				durum= "TEK SAYI";
			} else {
				durum = "CIFT SAYI";
			}
			System.out.println(a + " X " + u +" = "+ a*u + "  " + durum);
			
		}

	}

}
