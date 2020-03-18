package SyntaxClass4;

public class NestedifC {

	public static void main(String[] args) {
		// check if patient has any allergies
		//if no allergies=you are healthy
		//otherwise check if patient has:
		//orange allergy=do not eat orange
		//apple allergy=do not eat apples
		
		boolean allergy=true;
		boolean appleAllergy=false;
		boolean orangeAllergy=true;
		if (allergy) {
			System.out.println("Please answer below");
			if (orangeAllergy) {
				System.out.println("do not eat oranges");}
			 if (appleAllergy) {
			System.out.println("do not eat apples");
			}
			
		}else {
			System.out.println("You are healthy");
		}

	}

}
