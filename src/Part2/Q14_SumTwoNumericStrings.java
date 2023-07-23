package Part2;

public class Q14_SumTwoNumericStrings {

	
	private static void sumTwoStrings(String str1, String str2) {

		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		
		int sum=a+b;
		System.out.println(sum);
		
		
		
	}
	
	public static void main(String[] args) {
		
		sumTwoStrings("10","20");
	}


}
