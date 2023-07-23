package Part1;

import java.util.Arrays;

public class Q6_PanagramString {

	private static boolean isPanagram(String str1, String str2) {

		char[] a = str1.toLowerCase().toCharArray();
		char[] b = str2.toLowerCase().toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);

		return Arrays.equals(a, b);
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(isPanagram("Listen","Silent"));
		System.out.println(isPanagram("Heart","Earth"));
		
	}


}
