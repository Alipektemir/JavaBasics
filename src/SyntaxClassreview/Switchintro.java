package SyntaxClassreview;

public class Switchintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				int day=3;
								String dName;
								if (day==1) {
									dName="Monday";
								}else if(day==2) {
									dName="Tuesday"; 
			
								}else if(day==3) {
		
										dName = "wednesday";
										} else {
		dName = "Invalid";
		}
		System.out.println("Today is " + dName);

		
		System.out.println("..................................................");
		String today;
		
		
		switch (day) {
		
		case 1:
			today ="monday";
			break;
		case 2:
			today ="tuesday";
		case 3:
			today ="wednesday";
			break;
			default:
				today ="invalid";
				
		
		
		}
		
		System.out.println("Today is "+ today);
		
		
		
		
		
		
		
		
		
		
	}

}
