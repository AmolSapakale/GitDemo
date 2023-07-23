package Part2;

public class Q5_PrintElementAtEvenPlace {

	private static void getEvenElements(int[] arr) {

		for(int i=0;i<=arr.length-1;i+=2) {
			System.out.println(arr[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5};
		getEvenElements(arr);
	}

}
