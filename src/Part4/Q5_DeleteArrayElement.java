package Part4;

public class Q5_DeleteArrayElement {

	private static void deleteArrayElement(int index) {
		int arr[] = {1,2,3,4,5};
		int newarr[] = new int[arr.length-1];
		for(int i=0,k=0;i<=arr.length-1;i++) {
			if(i!=index) {
				newarr[k]=arr[i];
				k++;
			}
			
		}
		for(int a:newarr) {
			System.out.println(a);
		}
	}
	
	
	public static void main(String[] args) {
		
		deleteArrayElement(2);
	}

}
