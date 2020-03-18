package SyntaxClassreview10;
import java.util.Scanner;
public class ScannerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("How many elements?");{
			int size=sc.nextInt();
			int[] nums = new int[size];
			for(int i=0; i<size; i++) {
				System.out.println("give"); {
					nums[i] = sc.nextInt(); 
					
				}
				System.out.println();
				for (int n:nums) {
					System.out.println();
				}
			}
			
		}
	}

}
