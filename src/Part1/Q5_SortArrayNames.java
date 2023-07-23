package Part1;

public class Q5_SortArrayNames {

	
	private static void sortNames(String[] arr) {
		
		for(int i=0;i<=arr.length;i++) {
			
			for(int j=i+1;j<=arr.length-1;j++) {
				
				if(arr[i].compareTo(arr[j])>0) {
					String temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(String a : arr)
		System.out.println(a);
		
	}
	
	
	public static void main(String[] args) {
		String[] arr = {"Camel","Banana","Apple","Dance","Czech"};
		sortNames(arr);
		
	}


}
