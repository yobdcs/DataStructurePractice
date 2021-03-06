package stringReverser;

import java.util.Stack;

public class StringReverser {

	public String reverse(String str) {
		if(str == null) {
			throw new IllegalArgumentException();
		}
		
		Stack<Character> org = new Stack<Character>();
//		for(int i = 0 ; i < str.length() ; i++) {
//			org.push(str.charAt(i));
//		}
		for(char c : str.toCharArray()) {
			org.push(c);
		}
		
		StringBuilder rev = new StringBuilder();
//		for(int i = 0 ; i < str.length() ; i++) {
//			rev.append(org.pop());
//		}
		while(!org.empty()) {
			rev.append(org.pop());
		}
		
		return rev.toString();
	}
	
}
