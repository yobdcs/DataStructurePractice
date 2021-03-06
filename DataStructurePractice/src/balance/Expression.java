package balance;

import java.util.Stack;

public class Expression {
	
	String str;
	char left;
	char right;
	
	public Expression(String str) {
		this.str = str;
	}

	public boolean isBalanced() {
		Stack<Character> stack = new Stack<Character>();
		
		for(char c : str.toCharArray()) {
			
			if(c == '(' || c == '[' || c == '{' || c == '<') {
				left = stack.push(c);
				System.out.println("left : "+left);
			}
			
			if(c == ')' || c == ']' || c == '}' || c == '>') {
//				System.out.println(left);
				if(stack.empty() || (c == ')' && left != '(') ||
						            (c == ']' && left != '[') ||
						            (c == '}' && left != '{') ||
						            (c == '>' && left != '<') ) {
					return false;
				}
				right = stack.pop();
				System.out.println("pop : "+right);
			}
		}
		return stack.empty();
	}

}
