package Part1;

import java.util.LinkedHashMap;

public class Q14_OccurencesOfCharacters {

	private static void getOccurences(String str) {
		
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		for(char a : str.toCharArray()) {
			if(map.containsKey(a)) {
				map.put(a,map.get(a)+1);
			}
			else map.put(a,1);
		}
		System.out.println(map);
		
	}
	
	
	public static void main(String[] args) {
		
		getOccurences("HELLO");
	}


}
