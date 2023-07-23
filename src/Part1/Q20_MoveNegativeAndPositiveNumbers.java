package Part1;

public class Q20_MoveNegativeAndPositiveNumbers {

	private static void moveElements(int[] arr) {
		int[] newarr = new int[arr.length];
		int j=0;
		for(int i = 0 ; i<=arr.length-1;i++) {
			
			if(arr[i]<0) {
				newarr[j]=arr[i];
				j++;
			}
		}
		
		for(int i = 0;i<=arr.length-1;i++) {
			if(arr[i]>0) {
				newarr[j]=arr[i];
				j++;
			}
		}
		for(int a:newarr) {
			System.out.print(a+ " ");
		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, -4, -5, -1, 5, 6, 7, -8 };
		moveElements(arr);
	}

}
