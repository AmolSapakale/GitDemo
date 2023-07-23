package Part2;

public class Q15_LeapYear {


	private static void isLeapYear(int n) {

		if(n%400==0 || (n%4==0 && n%100!=0))
			System.out.println("Leap year");
		else System.out.println("Not leap");
		
		
	}
	public static void main(String[] args) {
		isLeapYear(2024);
	}

}
