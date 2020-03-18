package SyntaxClass11;

public class StringVerifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String message="Welcome Admin!";
		//verifynthat message contains username which is admin
		
		System.out.println(message.contains("Admin"));
		
		boolean flag=message.contains("Welcome");
		System.out.println(flag);
		
		boolean starts=message.startsWith("Welcome");
		System.out.println(starts);
		
		// we want to verify that welcome message ends with username and !
		String username="Admin";
		boolean ends=message.endsWith(username);
		System.out.println(ends);
	//	System.out.println(message.endsWith(suffix));
		
		
	}

}
