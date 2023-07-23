package Part2;

public class Q1_LeftRotateArray {

	private static void leftRotateArray(int[] arr) {

		int j=0;
		int temp=arr[0];
		for(int i =1;i<=arr.length-1;i++) {
			
			
			arr[j]=arr[i];
			j++;
			
		}
		arr[j]=temp;
		
		for(int a:arr) {
			System.out.print(a+ " ");
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		leftRotateArray(arr);
	}


}
