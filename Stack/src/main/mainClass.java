package main;

import stack.ArrayStack;

public class mainClass {
	public static void main(String[] args) {
		/*
		 
		 	Stack :First In Last Out
		 		   실린더에 공을 넣고 빼는 경우
		 		   in ->Push 
		 		   out -> pop
		 		   
		 */
		ArrayStack stack = new ArrayStack(10);
		
		String str ="AAA";
		stack.push(str);
		
		String peekStr = (String)stack.peek();
		System.out.println("top Object = "+peekStr);
		
		str ="BBB";
		stack.push(str);
		
		peekStr =(String)stack.peek();
		System.out.println("top Object = "+peekStr);
		
		String popStr = (String)stack.pop();
		System.out.println("pop Object = "+popStr);
		
		peekStr =(String)stack.peek();
		System.out.println("top Object = "+peekStr);
		
		Integer in = 123;
		stack.push(in);
		int topInt = (Integer)stack.peek();
		System.out.println("topInt ="+topInt);
	}
}
