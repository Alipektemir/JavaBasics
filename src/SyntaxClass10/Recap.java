package SyntaxClass10;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] grades=new int[4];
		grades[0]=90;
		grades[1]=67;
		grades[2]=56;
		grades[3]=47;
		
		//average?
			int average=(grades[0]+grades[1]+grades[2]+grades[3])/4;
		System.out.println("Average is "+ average);
		
		System.out.println("..........Creating an array of cities.......");
		String[] cities= {"Washington", "Paris", "Miami"};
		
		
		System.out.println("i live in "+cities[2]);
		
		int x=1;
		System.out.println(cities[x]);
		x+=1;
		System.out.println("I moved to " +cities[x]);
		
		//how many elements stored in the array
		int arraySize=cities.length;  //3
		
		System.out.println("Total elements "+arraySize);
		//how can i access last element from an array?
		System.out.println(cities[arraySize-1]);
		System.out.println("......................");
		//access all elements from an array
		// cities[0], cities[1], cities[2]
		
		for(int i=0; i<arraySize; i++) {
			System.out.println(cities[i]);
		}
		
	}

}
