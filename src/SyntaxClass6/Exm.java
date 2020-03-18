package SyntaxClass6;

public class Exm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Today;
		int day =8;
		
		switch(day){
        case 1: 
        	Today = "Monday";
            break;
        case 2: 
        	Today = "Tuesday";
            break;
        case 3: 
        	Today = "Wednesday";
            break;
        case 4: 
        	Today = "Thursday";
            break;
        case 5:
        	Today = "Friday";
            break;
        case 6:
        	Today = "Saturday";
            break;
        case 7: 
        	Today = "Sunday";
           break;
           default:
      
        	Today = "Invalid";
           break;
		}
            System.out.println("Today is " +Today);
                            
  }
   
}
