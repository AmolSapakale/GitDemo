package Part2;

public class Q12_LargestOf3Numbers {
	
	
	private static void largest(int a, int b, int c) {
		
		if(a>b && a>c)System.out.println(a);
		else if(b>c)System.out.println(b);
		else System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		
		largest(2,3,5);
		
	}


}
