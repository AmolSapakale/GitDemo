package Part1;

import java.util.HashSet;

public class Q7_LongestSubstring {

	
	private static void getLongestSubstring(String str) {
		
		String longestTillNow="";
		String longestOverall="";
		
		HashSet<Character> set = new HashSet<>();
		for(char a:str.toCharArray()) {
			if(set.contains(a)) {
				longestTillNow="";
				set.clear();//IMPORTANT TO CLEAR THE SET ONCE DUPLICATE CHARACTER IS FOUND
			}
			else {
				longestTillNow+=a;
				set.add(a);
			}
			
			if(longestTillNow.length()>longestOverall.length()) {
				longestOverall=longestTillNow;
			}
		}
		System.out.println("Longest Substring without repetition is "+longestOverall );
		
	}
	
	public static void main(String[] args) {
		getLongestSubstring("abcdeabf");
	}


}
