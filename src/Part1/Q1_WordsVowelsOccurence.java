package Part1;

import java.util.LinkedHashMap;

public class Q1_WordsVowelsOccurence {

	private static void getCount(String str) {

		String[] str2 = str.split(" ");
		int vw=0,con=0;
		
		LinkedHashMap<Character,Integer> map = null;
		
		//Total words count got
		System.out.println("total words are = "+ str2.length);
		
		map = new LinkedHashMap<>();
		
		//Each word extracted
		for(String a:str2) {
			
			//from each word->each character extracted
			for(char b:a.toLowerCase().toCharArray()) {
				if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u') {
					vw++;
				}else con++;
				if(map.containsKey(b)) {
					map.put(b,map.get(b)+1);
				}else map.put(b,1);
				
			}
			
			
		}
		System.out.println(map);
		System.out.println("Vowels = "+vw);
		System.out.println("Consonants = "+con);

		
		
	}
	
	public static void main(String[] args) {
		getCount("I am a good boyzz");
	}


}
