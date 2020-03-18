package SyntaxClass12;

public class MoreStringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String me="Iam a good tester";
		System.out.println("replace() function");
		
		String newString = me.replace("a", "c");
		System.out.println(newString);
		me=me.replace("good", "great");
		System.out.println(me);
		me=me.replace("great", "Awesome");
		System.out.println(me);
		
		String car="I have a honda";
		car=car.replace("honda", "Lexus");
		System.out.println(car);
		String str="Phone number is 2535235";
		System.out.println(str);
		str=str.replaceAll("[A-Z]", "");
		System.out.println(str);
		String str1="Hello324342%##^";
		str1=str1.replaceAll("[0-9]", "");
		System.out.println(str1);
		str1=str1.replaceAll("[A-Za-z]", "");
		System.out.println(str1);
		String str3="DFGDF34634#$@#" ;
		str3=str3.replaceAll("[A-Z-0-9]", "");
		System.out.println(str3);
	}

}
