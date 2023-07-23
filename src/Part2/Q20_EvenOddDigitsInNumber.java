package Part2;

public class Q20_EvenOddDigitsInNumber {

	
	private static void getEvenOddCount(int n) {
	int even=0,odd=0;
	while(n>0) {
		int a=n%10;
		if(a%2==0)even++;
		else odd++;
		n/=10;
	}

	System.out.println("Even Digits="+even);
	System.out.println("Odd Digits="+odd);
	}
	
	public static void main(String[] args) {
		
		getEvenOddCount(123456789);
	}


}
