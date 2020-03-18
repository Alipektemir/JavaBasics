package SyntaxClassreview02;

public class DOWhiledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		int totalOdd = 0 ,totalEven =0 ;
		
		
		while (count<=50 ) { 
			
		if (count%2==0)  {
			
			totalEven +=count;
			
		}else {
			totalOdd +=count;
		}
			count++;
		}
		
			System.out.println(totalEven);
			System.out.println(totalOdd);
		
			count=1;
			totalOdd+=count;
			count+=2;
	 while (count<=50);  {
	
	System.out.println(totalOdd);
	
	}
			
			
			
		
		}
	
}
