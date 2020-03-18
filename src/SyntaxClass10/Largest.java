package SyntaxClass10;

public class Largest {

	public static void main(String[] args) {
		// Find the largest element from an array

		int[] nums= {200,30, -1, 900,56, 787,424,424,426,64322,89};
		
		int largest = nums[0];
		for(int i = 1; i < nums.length;i++)
		{
			if(nums[i] > largest)
			{
				largest = nums[i];
			}
		}
		
		System.out.println("The Given Array Element is:");
		for(int i = 0; i < nums.length;i++)
		{
			System.out.println(nums[i]);
		}
		
		System.out.println("From The Array Element Largest Number is:" + largest);
		
		
	}

}
