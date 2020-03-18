package SyntaxClass9;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		 int num1;
		 num1=10;
		 //declare an array and initiliaze it
		 int[] array=new int[4];
		 array[0]=10;
		 array[1]=20;
		 array[2]=30;
		 array[3]=40;
		 //access elements from an array
		 System.out.println(array[1]);
		 //2 way
		 String[] carArray;   //better way
		 String carArray1[];
		 
		 carArray=new String[3];
		 
		 carArray[0] ="BMW";
		 carArray[1] ="Honda";
		 carArray[2] ="Toyota";
		 
		 //i am driving toyota
		 
		 System.out.println("Iam driving "+carArray[2]);
	}

}
 