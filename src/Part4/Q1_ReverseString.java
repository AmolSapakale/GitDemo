package Part4;

public class Q1_ReverseString {
	private static void reverseString(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		
		for(int i=0;i<str.length()/2;i++) {
			char front = str.charAt(i);
			char end = str.charAt(str.length()-1-i);
			
			sb.setCharAt(i, end);
			sb.setCharAt(str.length()-1-i,front);
		}
		System.out.println(sb);
				
	
	}
	
	
	public static void main(String[] args) {
		
		reverseString("Hello");
		
	}


}
