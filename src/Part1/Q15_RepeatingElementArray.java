package Part1;

public class Q15_RepeatingElementArray {

	private static void findRepeatingElement(int[] arr) {

		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Repeating element found");
					System.out.println(arr[i]);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,4,5,5,6};
		findRepeatingElement(arr);
	}


}
