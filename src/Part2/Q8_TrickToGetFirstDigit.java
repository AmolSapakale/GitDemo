package Part2;

public class Q8_TrickToGetFirstDigit {

	
	private static void getFirstDigit(int n) {

		int power = (int)Math.log10(n); //Math.log10(number)
		System.out.println("power is "+power);
		int firstDigit = (int)(n/Math.pow(10,power)); //1234/10^3 = 1234/1000 = 1(first digit)
		
		System.out.println(firstDigit);
		
	}
	
	
	
	public static void main(String[] args) {
		
		getFirstDigit(1234);
	}


}
