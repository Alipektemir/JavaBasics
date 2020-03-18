package SyntaxClassreview10;

public class ArrayDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1 = 5;
		int a2 = 7;
		int a3 = 8;
		int a4 = 9;
		int a5 = 10;
		System.out.println(a1);
		System.out.println(a2);
		//prof way
		int[] numbers = new int[5];
		//initializing values for array elements
		numbers[3] = 9;
		numbers[2] = 8;
		numbers[1] = 7;
		numbers[0] = 5;
		numbers[4] = 20;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		//printing the element with index 2, third element
		System.out.println("printing using index with variable");
		int i = 2;
		System.out.println(i);
		i++;
		System.out.println(numbers[i]);
		}

}
