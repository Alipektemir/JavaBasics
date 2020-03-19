package SyntaxClass13;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//prime number
		//2,3,5,7,11,13,17
		int given=20;
		boolean prime=true;
		if(given>1) {
			for(int i=2;i<given; i++) {
				if(given%i==0) {
					prime=false;
				}
			}
		}else {
			prime=false;
		}
		System.out.println("Given number "+given+" is prime? "+prime);
	}

}
