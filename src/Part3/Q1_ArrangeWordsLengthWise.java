package Part3;

public class Q1_ArrangeWordsLengthWise {

	private static void arrangeWordsLengthWise(String str) {

		String[] words = str.split(" ");
		for(int i =0;i<=words.length-1;i++) {
			for(int j=i+1;j<=words.length-1;j++)
			{
				if(words[i].length()<words[j].length()) {
					String temp = words[i];
					words[i]=words[j];
					words[j]=temp;
				}
			}
		}
		for(String word:words) {
			System.out.print(word + " ");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		arrangeWordsLengthWise("Hello World AAAAABBBBB jjjjjj okook o");
	}


}
