package Part4;

public class Q3_ReverseStringRecursion {

	private static String reverseRecursion(String str) {
		
		if(str==null || str.length()<1)return str;
		
		return ( reverseRecursion(str.substring(1)) )     +    str.charAt(0);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(reverseRecursion("HELLO"));
	}


}
