package com.shailu.stackimpl;

public class StackClient {

	public static void main(String[] args) {
		
		Stack<Integer> stack= new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		
		System.out.println("Top Element " + stack.topElement());
		System.out.println("Is Empty  "+ stack.isEmpty());
		/*stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		*/
		System.out.println("Top Element " + stack.topElement());
		stack.push(110);
		System.out.println("Top Element " + stack.topElement());
		stack.push(111);
		stack.push(111);
		stack.push(111);
		stack.push(111);
		
	}
}
