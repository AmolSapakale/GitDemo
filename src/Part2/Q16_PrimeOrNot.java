package Part2;

public class Q16_PrimeOrNot {

	//Print prime 1 to 100
	private static void isPrime(int n) {
		int ctr=0;
		for(int i=1;i<=100;i++) {
			
		for(int	j=1;j<=i;j++) {
			if(i%j==0)ctr++;
		}
		if(ctr==2)System.out.println(i+"=Prime");
		ctr=0;
	}
	}
	
	public static void main(String[] args) {
		
		
		isPrime(5);
	}


}
