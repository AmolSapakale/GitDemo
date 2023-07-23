package Part1;

public class Q12_ReverseWords {

	private static void reverseWords(String str) {

		String[] words = str.split(" ");
		String newString="";
		
		for(String word: words) {
			
			for(int i=word.length()-1;i>=0;i--) {
				newString+=word.charAt(i);
			}
			newString+=" ";
		}
		System.out.print(newString);
	}
	
	public static void main(String[] args) {
		reverseWords("Hello I am a good boy");
	}


}
