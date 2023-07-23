package Part2;

public class Q18_PrintNumbersWithoutLoop {
	private static void NoLoop(int n) {
		
		if(n<=10) {
			
			System.out.println(n);
			NoLoop(n+1);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		NoLoop(1);
		
	}


}
