package Part3;

import java.util.LinkedHashMap;

public class Q3_RenameDuplicateStrings {

	private static void renameDuplicates(String[] arr) {

		LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<=arr.length-1;i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i],(map.get(arr[i])+1));
				arr[i]=arr[i]+""+(map.get(arr[i])-1);
			
				}
			else map.put(arr[i],1);
			}
		System.out.println(map);
			for(String a:arr) {
				System.out.print(a+ " ");
			}
	}
	
	public static void main(String[] args) {
		
		String[] arr = {"tv","watch","tv","club","music","tv","horse","watch","clock"}; 
		renameDuplicates(arr);
		
	}


}
