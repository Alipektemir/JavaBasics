package SyntaxClass6;

public class SwitchIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//int day=5;
	//String dayName;
	//if (day==1)  {
		//dayName="Monday";
		
		
	//}else if (day==2)  {
		//dayName="Monday";
	//}else if (day==3)  {
	//	dayName="Monday";	
//	}else if (day==4) {
	//	dayName="Monday"; {
//			
	//	}else if (day==5)  {
	//		dayName="Monday";   {
				
		//	}else if (day==6)
		//		dayName="Monday";	
				
//		}else if (day==7 ) {
//			dayName="Monday";
	//	}else
		//	dayName="Invalid";

	//	System.out.println("...............switch");
		
		int day=4	;
		String today;
	
		switch (day) {
		case 1:
		today="Monday";
		break;
		case 2:
			today="Tuesday";
		break;
		case 3:
		today="Wednesday";
		break;
				 
		case 4:
		today="Thursday";
		break;
				
		case 5:
		today="Friday";
		break;
	 
		case 6:
		today="Saturday";
		break;
						 
		case 7:
	    today="Sunday";
	    break;
									 
		default:
		today="Invalid";
		   
		System.out.println("Today is " + today);
		break;
	
		}
	
	
		
		
	}

}
