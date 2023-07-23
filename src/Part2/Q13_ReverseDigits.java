package Part2;

public class Q13_ReverseDigits {

	private static void reverse(int n) {
		int newnum=0, a=0;
		while(n>0) {
			
			a=n%10;
			newnum=(newnum*10)+a;
			n/=10;
			
		}
		
		System.out.println(newnum);
		
	}
	public static void main(String[] args) {
		
		reverse(12345);
	}


}
