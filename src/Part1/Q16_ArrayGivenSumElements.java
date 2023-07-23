package Part1;

import java.util.Scanner;

public class Q16_ArrayGivenSumElements {

	private static void getSumElements(int[] arr,int n) {

		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]+arr[j]==n) {
					System.out.println("Number of array elements for sum pair are "+ arr[i] +" "+arr[j]);
				}
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,65,33,22,32,64};
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the sum you want to pair with array elements");
		int n = sc.nextInt();
		getSumElements(arr,n);
	}


}
