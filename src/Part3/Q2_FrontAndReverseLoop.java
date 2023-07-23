package Part3;

public class Q2_FrontAndReverseLoop {

	private static void frontAndBack(int a, int b) {
		//3+4+5+6+5+4+3
		int sum=0;int i=0;
		for (i=a;i<b;i++) {
			
			sum+=i;

		}
		sum=(sum*2)+b;
		
		System.out.println(sum);
	}
	
	private static void frontAndBackMethod2(int a, int b) {
		//3+4+5+6+5+4+3
		int sum=0;int i=0;int k=b-1;
		for (i=a;i<=b;i++) {
			
			if(i!=6) {
			sum=sum+i+(k);
			}
			else {
				sum=sum+i;
			}
			k--;

		}
		//sum=(sum*2)-i;
		
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		//frontAndBack(3,6);
		frontAndBackMethod2(3,6);
	}


}
