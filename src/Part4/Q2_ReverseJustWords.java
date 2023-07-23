package Part4;

public class Q2_ReverseJustWords {


	private static void ReverseWords(String str) {
		
		//Split into each words array
		String[] words = str.split(" ");
		
		//assign new string
		String str2="";
		
		//Iterate each word
		for(String word : words) {
			
			//Iterate each letter and add it to str2
			for(int i=word.length()-1;i>=0;i--) {
				str2+=word.charAt(i);
			}
			
			//Once one word's all characters are added to str2, just add a space
			str2+=" ";
			
		}
		//at the end print the new string		
		System.out.println(str2);
	}
	
	public static void main(String[] args) {
		
		ReverseWords("I am a good boy");
	}

}
