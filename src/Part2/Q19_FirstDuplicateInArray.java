package Part2;

public class Q19_FirstDuplicateInArray {
	
	private static void getFirstDuplicate(int[] arr) {
		boolean flag = false;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j])
				{
				flag = true;
				System.out.println("First Duplicate = "+arr[i]);
				
				break;
				}
			}
			if(flag==true)break;
		
		}
	}
	
	
	
	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4,4,5,5,6};
		getFirstDuplicate(arr);
	}


}
