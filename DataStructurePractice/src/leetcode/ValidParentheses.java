package leetcode;

import java.util.Stack;

public class ValidParentheses {

	/*  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
	 	
	 	determine if the input string is valid.
	
		An input string is valid if:

		Open brackets must be closed by the same type of brackets.
			
		Open brackets must be closed in the correct order.
	*/
	
	public static void main(String[] args) {
//		String str = "{[]}";
//		String str = "([)]";
		String str = "(){}}{";
		
		System.out.println(validParentheses(str));
	}

	private static boolean validParentheses(String str) {
		if(str == null || str.isEmpty() || str.length() == 1)
			return false;
		
		Stack<Character> stack = new Stack<Character>();

		int i = 0;
		while(i < str.length()) {
			char ch = str.charAt(i);
			
			if(ch == ')' && stack.isEmpty() ||
				ch == ']' && stack.isEmpty() ||
				ch == '}' && stack.isEmpty())
				return false;
			
			if(ch == ')' && stack.peek() != '(' ||
				ch == ']' && stack.peek() != '[' ||
				ch == '}' && stack.peek() != '{')
				return false;
			
			if(ch == ')' && stack.peek() == '(' ||
				ch == ']' && stack.peek() == '[' ||
				ch == '}' && stack.peek() == '{') {
				stack.pop();
				i ++;
				continue;
			}
			
			stack.push(ch);
			i ++;
		}
		
		return stack.isEmpty();
	}
	
}
