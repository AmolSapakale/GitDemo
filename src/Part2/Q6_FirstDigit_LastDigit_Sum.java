package Part2;

public class Q6_FirstDigit_LastDigit_Sum {
	
	private static void getDigitsAndSum(int n) {
		int lastDigit=n%10;
		int sum=0;
		System.out.println("Last Digit is = "+lastDigit);
		
		while(n>0) {
			int a=n%10;
			sum=(sum) + a;
			if(n<=10)//This condition is to keep checking before n becomes 0 after dividing by 10
				System.out.println("First Digit is ="+n);
			n/=10;
		}
		System.out.println("Sum of digits = "+sum);
	}
	
	
	
	public static void main(String[] args) {
		getDigitsAndSum(1983);
	}


}
