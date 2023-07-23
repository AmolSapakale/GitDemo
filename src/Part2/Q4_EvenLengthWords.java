package Part2;

public class Q4_EvenLengthWords {

	private static void printEventLengthWords(String str) {

		String[] words = str.split(" ");
		for(String word:words) {
			if(word.length()%2==0) {
				System.out.println(word);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		printEventLengthWords("I am a good boy");
		
	}


}
