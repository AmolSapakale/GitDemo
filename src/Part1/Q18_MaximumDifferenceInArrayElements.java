package Part1;

public class Q18_MaximumDifferenceInArrayElements {

	
	private static void getMaxDifference(int[] arr) {

		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("Max element in array is "+arr[arr.length-1]);
		System.out.println("Min element in array is "+arr[0]);
		System.out.println("Max difference is "+(arr[arr.length-1]-arr[0]));
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,3,23,5342,3234,33,22,33,21};
		getMaxDifference(arr);
	}


}
