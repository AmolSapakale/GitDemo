package Part2;

public class Q10_PerfectSquareOrNot {

	private static void isPerfectSquare(int n) {
		boolean flag=false;
		int a=0;
		for(int i=0;i<=n;i++) {
			
			if(i*i == n) {
				flag=true;
				 a=i;
			}
			
			
		}
		if(flag==true)System.out.println("Perfect Square of "+ a);
		
		else System.out.println("Not a perfect square");
	}
	
	
	public static void main(String[] args) {
		
		isPerfectSquare(144);
	}


}
