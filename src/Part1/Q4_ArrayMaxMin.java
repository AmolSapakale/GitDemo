package Part1;

public class Q4_ArrayMaxMin {

	private static void getMinMax(int[] arr) {
		
		for(int i=0;i<=arr.length-1;i++) {
			
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		
		}
		
		System.out.println("Mininum element is "+arr[0]);
		System.out.println("Second Mininum element is "+arr[1]);
		System.out.println("Maximum element is "+arr[arr.length-1]);
		System.out.println("Second Maximum element is "+arr[arr.length-2]);

	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		getMinMax(arr);
	}


}
