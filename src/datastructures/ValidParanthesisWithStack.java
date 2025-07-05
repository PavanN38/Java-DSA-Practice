package datastructures;

import java.util.Stack;

public class ValidParanthesisWithStack {
	
	//check the given string ins valid, valid only if opening has closiong for it like '(){}[]'
	
	public static void main(String[] args) {	
		
	System.out.println(checkValidString("{{{}}}{}"));	
		
	}
	
	public static boolean checkValidString(String paranthesis) {
		
		char[] charArray = paranthesis.toCharArray();
		
		Stack<Character> charStack= new Stack<>();
	
		
		
		for(char presentChar: charArray) {
			if(presentChar=='(') {
				charStack.push(')');
			}else if(presentChar=='{') {
				charStack.push('}');
			}else if(presentChar=='[') {
				charStack.push(']');
			}
			else if(charStack.isEmpty() || charStack.pop()!=presentChar) {
				return false;
			}	
		}
		
		return charStack.isEmpty();
		
		
	}

}
