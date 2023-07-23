package Part1;

public class Q17_DuplicatesInArray {

	

	private static void findDuplicates(int[] arr) {

		for(int i=0;i<=arr.length-1;i++) {
			for(int j = i+1 ;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate element found =" + arr[i]);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,1,2,6};
		findDuplicates(arr);
	}

}
