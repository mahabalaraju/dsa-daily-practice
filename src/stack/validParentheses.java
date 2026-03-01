package stack;

import java.util.Stack;

public class validParentheses {

	public static void main(String[] args) {
		String s = "{()]}";
		validParentheses parantheses = new validParentheses();
	System.out.println(parantheses.isValid(s));
		
	}
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		boolean flag =false;
		for(char c: s.toCharArray()) {
         if(c =='{')
        	 stack.push('}');
         else  if(c =='[')
        	 stack.push(']');
         else  if(c =='(')
        	 stack.push(')');
		
		else if(stack.isEmpty()||stack.pop()!=c ) {
			return false;
		}
	}
		return  stack.isEmpty();
}
}