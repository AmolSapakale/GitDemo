package Part3;

public class Q4_ReverseStringCharactersOnly {

	private static void reverseOnlyChar(char[] a) {
		
		int i=0;
		int j=a.length-1;
		for(i=0;i<a.length-1;i++) {
			
			if(!Character.isAlphabetic(a[i])){
				i++;
			}
			else if(!Character.isAlphabetic(a[j])) {
				j--;
			}
			else {
				char temp = a[j];
				a[j]=a[i];
				a[i]=temp;
				i++;
				j--;
				
			}
			
			}
		
		
		
	}
	
	public static void main(String[] args) {
		String str="HE23LLO";
		char[] b = str.toCharArray();//OLL32EH
		reverseOnlyChar(b);
		String rev = new String(b);
		System.out.println(rev);
	}


}
