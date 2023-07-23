package Part1;

public class Q19_MoveZeroesToEnd {

	private static void moveZeroesToEnd(int[] arr) {
		int[] newArr = new int[arr.length];
		int j=0;
		
		
		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(arr[i]!=0) {
				newArr[j]=arr[i];
				j++;
			}
			
		}
		System.out.println("reached 2nd half");
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==0) {
				newArr[j]=arr[i];
				j++;
			}
			
			
		}
		for(int i:newArr) {
			System.out.print(i+ " ");
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,0,3,0,5,0,8,0,9};
		moveZeroesToEnd(arr);
	}


}
