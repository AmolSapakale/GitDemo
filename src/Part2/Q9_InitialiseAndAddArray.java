package Part2;

import java.util.Scanner;

public class Q9_InitialiseAndAddArray {

	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of elements you want in array ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter element ");
			int a=sc.nextInt();
			arr[i]=a;
		}

		System.out.println("The initialised array is as follows:");
		for(int i:arr) {
			System.out.print(i+ ",");
		}
		
	}
}
