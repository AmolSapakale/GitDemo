package Part2;

import java.util.Arrays;

public class Q7_SwapFirstLastDigits {

	private static void swapDigitsMethod1(int n) {

		// Method 1 -> Take out 1st and last digit and swap
	
		//Take out 1st digit
		int power = (int)Math.log10(n);
		int firstDigit = (int)(n/Math.pow(10, power));
		
		int lastDigit = n%10;

		System.out.println("first Digit " +firstDigit );
		System.out.println("last Digit " +lastDigit );
		
		int a =(int)( firstDigit* Math.pow(10,power));
		int b =(int)(n%a);
		n=b/10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);
		n=(int)((lastDigit*Math.pow(10,power))+(n*10 + firstDigit));
		System.out.println("-------");
		System.out.println(n);

	}

	private static void swapDigitsMethod2(int n) {

		// Method 2 -> Change all digits to String array
		String number = String.valueOf(n);
		String[] digits = number.split("");

		String temp = digits[0];
		digits[0] = digits[digits.length - 1];
		digits[digits.length - 1] = temp;

		for (String a : digits) {
			System.out.print(a + " ");
		}
	}

	public static void main(String[] args) {

		swapDigitsMethod1(12345);
		//swapDigitsMethod2(12345);
	}

}
