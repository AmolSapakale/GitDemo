package Part1;

public class Q8_FirstLetterOfEachWord {

	private static void getFirstLetter(String str) {

		String[] words = str.split(" ");
		for(String word : words ) {
			System.out.println("First letter of "+ word + " is "+word.charAt(0));
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		getFirstLetter("I am a good boy");
	}


}
