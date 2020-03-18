package SyntaxClass11;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name;
			String pass;
			String confirmedPass;
			String message=null;
		System.out.println("please input username?");
		Scanner sc= new Scanner(System.in);
		name=sc.nextLine();
		System.out.println("please input password?");
		pass=sc.nextLine();
		
		if(!(name.isEmpty() && pass.isEmpty()))  {
		message="Lets proceed";
		System.out.println(message); }
			
		
			if((pass.length()>=8)) {
				
				if(!pass.contains(name)) {
					
				System.out.println("please confirm password");	}
				confirmedPass=sc.nextLine();
				
				if (pass.contentEquals(confirmedPass)) {
					System.out.println("Your account is created");  }
				
						else {
							System.out.println("Passwords are not matched"); }
			}else {
							System.out.println("Password cannot contain username");
						}
			 {
				System.out.println("Password is too short");
							
			}
			
		
			 {
		
		System.out.println("Password cannot contain password");
		
		
		}
	}	
		
	}


