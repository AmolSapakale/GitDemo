package Part2;

import java.util.Stack;

public class Q3_BalancedBrackets {

	private static void isBalanced(String str) {
		Stack<Character>st = new Stack();
		
		for(char a : str.toCharArray()) {
			
			if(a=='[' || a=='(' || a=='{')st.push(a);
			else if(a==']' && st.peek()=='[') st.pop();
			else if(a=='}' && st.peek()=='{') st.pop();
			else if(a==')' && st.peek()=='(') st.pop();
				
		}
					
		if(st.isEmpty())System.out.println("balanced");
		else System.out.println("not balanced");
		
	}
	
	public static void main(String[] args) {
		isBalanced("HE{}ll[o](123[rt]4)");
	}


}
