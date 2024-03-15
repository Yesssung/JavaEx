package com.javaex.basic.operators;

public class ConditionalOperEx {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		// if a가 짝수면 짝수출력, 홀수면 홀수출력
		
		String result = a % 2 == 0 ? "짝수" : "홀수";
		System.out.println(a + "은" + result + "입니다");
		
		int score = 90;
		String message;
		
		// score가 80점 이상: GOOD
		// score가 50~80 : PASS
		// score가 50점 미만 : FAIL
		
		message = score >= 80? "GOOD":
			score >= 50? "PASS": "FAIL";
		System.out.println(score + "는" + message + "입니다.");
		
		
		
	}
}
