package com.javaex.basic.loop;

public class WhileEx {

	public static void main(String[] args) {
		
		// while 반복문 조건을 만족하는 동안 블록 반복
		int x = 0;
		
		while(x <= 20) {
			System.out.println("I LIKE JAVA" + " " + x);
			x = x + 1; // -> 제어변수 ' x += 1' 같은뜻
		} 
		
	
	}

}
