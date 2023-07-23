package Part1;

import java.util.HashSet;

public class Q3_MissingNumbersInArray {
	
	private static void getMissing(int[] arr) {
		
		HashSet<Integer> set = new HashSet<>();
		for(int a: arr) {
			set.add(a);
			
		}
		for(int i=0;i<=arr.length-1;i++) {
			if(!set.contains(i))
			System.out.println("Missing Element = "+ i);
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,5};
		getMissing(arr);
	}


}
