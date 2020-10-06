package com.interview.balanceParenthesis;

import java.util.Stack;

public class BalanceParenthesis {

	public static void main(String[] args) {
		System.out.println( isBalanced("{[()]}")); // Should be YES
		System.out.println( isBalanced("{{[[(())]]}}")); // Should be YES
		System.out.println( isBalanced( "[]{}")); // Should be YES
		System.out.println( isBalanced( "{[(])}" ) ); // Should be NO
		System.out.println( isBalanced( "[({}" ) ); // Should be NO
		System.out.println( isBalanced( "[]}" ) ); // Should be NO
		System.out.println( isBalanced( "[}]" ) );
	}
	
	public static boolean isBalanced(String s) {
		if(s.length() % 2 != 0) return false;
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char c : s.toCharArray()) {
			//if opening bracket is found, push it in the stack
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}
			// if current character is closing brackets, then the top of the stack must be the opening one
			else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			}
			else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			}
			else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
	
}
