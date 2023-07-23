package Part1;

public class Q9_StringRotation {

	
	private static void isRotation(String str1, String str2) {

		int rotations=0;boolean flag=false;
		for(char a : str1.toCharArray()) {
			rotations++;
			str1+=a;			
			String newSub = str1.substring(rotations,str1.length());
			if(newSub.equals(str2)) {
				flag=true;
				System.out.println("Both Strings are rotations of each other");
				System.out.println("Rotations required "+ rotations );

			}
			
			
		}
		if(flag!=true) System.out.println("Not rotations of each other");
	}
	
	public static void main(String[] args) {
		isRotation("MYPENCIL","ENCILMYP");
		isRotation("ABCD","CDAB");
		isRotation("ABCDE","XCDAB");
		
	}


}
