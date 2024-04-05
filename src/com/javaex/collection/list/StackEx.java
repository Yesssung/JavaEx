package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {

		// Stack 선언
		Stack <Integer> stack = new Stack<>();

		// 데이터 입력 
		for(int i = 0; i < 10; i++) {
			stack.push(i);
			System.out.println("STACK: " + stack);
		}
		
		// 가장 마지막에 있는 데이터가 무엇인지 확인
		System.out.println("PEEK: " + stack.peek());
		System.out.println("STACK: " + stack);
		
		// 인출
		System.out.println("POP: " + stack.pop());
		System.out.println("STACK: " + stack);
		
		// Stack이 비어있는지 확인해야 한다.
		
		while(true) {
			System.out.println("POP: " + stack.pop());
			System.out.println("STACK: " + stack);
		}
		
//		while(!stack.empty()) { // Stack이 비어있지 않으면
//			System.out.println("POP: " + stack.pop());
//			System.out.println("STACK: " + stack);
//		}
	}

}
