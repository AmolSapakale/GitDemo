package Part2;

public class Q11_SumofDigits {

	private static void getSum(int n) {
		int sum=0;
		
		while(n>0) {
			
			int a=n%10;
			sum+=a;
			n=n/10;
			
		}

		System.out.println(sum);
		
		
		
	}
	
	public static void main(String[] args) {
		
		getSum(12345);
	}

}
