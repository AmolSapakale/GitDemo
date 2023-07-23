package Part1;

public class Q11_SquareAndSortArray {
	
	private static void squareAndSort(int[] arr) {

		for(int i=0;i<=arr.length-1;i++) {
		
			arr[i]=arr[i]*arr[i];
			
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int a:arr) {
			System.out.println(a);
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {-2,-5,-1,-8,2,6,3};
		squareAndSort(arr);
	}


}
