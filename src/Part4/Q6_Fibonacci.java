package Part4;

public class Q6_Fibonacci {

	private static void fibonacci(int n) {
		
		int a=0,b=1,c=0;
		while(n>0) {
			
			c=a+b;
			a=b;
			b=c;
			
			System.out.print(c+ " ");
			fibonacci(n-1);
		}
		
		
	}
	
	public static void main(String[] args) {
		fibonacci(5);
	}


}
