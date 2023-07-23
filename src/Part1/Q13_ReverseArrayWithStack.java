package Part1;

import java.util.Stack;

public class Q13_ReverseArrayWithStack {

	
	private static void reverseWithStack(int[] arr) {

		Stack st = new Stack();
		for(int n:arr) {
			st.push(n);
		}

		for(int a : arr)
		System.out.print(st.pop() + " ");
		
		
	}
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		reverseWithStack(arr);
		
		
	}


}
