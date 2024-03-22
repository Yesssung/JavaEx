package com.javaex.oop.methods;

public class MethodPractice {
	
	public static void main(String[]args) {
		
		
		
		
		// 입력이 없고 출력도 없는 메서드
/*		
		문제1. 콘솔에 "Hello Method"를 출력하는 메서드를 작성하세요.
		
		printHelloMethod();
		
		private static void printHelloMethod() {
			System.out.println("Hello Method"); // 시스템아웃프린트는 다른 객체이기 때문에 입출력과는 상관 없는 부분
		}
		
		
		
		문제2. 1부터 10까지의 숫자를 콘솔에 출력하는 메서드를 작성하세요
		
		printNumbers();
		
		private static void printNumbers() {
		for (int i = 1; i <= 10; i++){
			System.out.println(i + "\t");
			}
			System.out.println();
		}
		
		
==================================================================================
		
		
		// 입력이 없고 출력이 있는 메서드
		
		문제3. 0 ~ 100사이의 랜덤한 정수를 반환하는 메서드를 작성하세요.
		
		int rnd = getRandomNumber();
		System.out.println(rnd);
		
		private static int getRandomNumber() {
		int rnd = (int)(Math.random()*101); 
		return rnd; // rnd는 로컬변수이기 때문에 위에서 호출해도 소용x
		}
	
		
	
		문제4. 1부터 10까지의 합(55)을 반환하는 메서드를 작성하세요
		
		int result = getSum();
		System.out.println(result);
		
		private static int getSum() {
		int result = 0;
		for(int i = 0; i < 10; i++) {
			result += i;
			}
			return result; 
		}
		
		
======================================================================================

		// 입력은 있고 출력은 없는 메서드
		 * 
		문제5. 정수를 하나 받아 그 정수가 짝수인지 홀수인지를 콘솔에 출력하는 메서드를 작성하세요.
		
		printOddOrEven(6);
		
		// if 문
		private static void printOddOrEven(int value) {
		if(value % 2 == 0) {
			System.out.println("짝입니다.");
			} 	
		}
		
		// 3항연산
		 System.out.println(
		 value % 2 == 0?"짝입니다.":"홀입니다."
		);
				
				
		문제6. 문자열을 하나 받아 그 문자열의 길이를 콘솔에 출력하는 메서드를 작성하세요
		
		printStringLength("apple");
		
		private static void printStringLength(String str) {
		System.out.println(str.length());
		
=================================================================================
		
		// 입력도 있고 출력도 있는 메서드

		문제7. 두 정수를 받아 큰 수를 반환하는 메서드를 작성하세요

		int value = getLargeNumber(15,30);
		System.out.println(value);
		
		private static int getLargeNumber(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
			}
	 	}
		
		
		
		문제8. 문자열 두 개를 받아 하나로 합쳐 반환하는 메서드를 작성하세요
		
		1. -> String value = concatenateString("apple","cat");
			  System.out.println(value);
		2. -> System.out.println(concatenateString()"apple","cat");
		
		private static String concatenateString(String a, String b) {
		return a + b;
	 	}

    =============================================================================
    
		// 가변인자 연습

		문제9. 가변인자로 전달된 모든 정수의 합을 반환하는 메서드를 작성하세요
		
		System.out.println("sumAll: " + sumAll(1,2,3,4,5));
		private static int sumAll(int...values) {
			int total = 0;
		
			for(int val: values) {
				total += val;
			}
			return total;
		}

		문제10. 가변인자로 전달된 모든 문자열을 연결해서 반환하는 메서드를 작성하세요
		
		System.out.println(concatenateStrings("donut","is","good"));
		
		private static String concatenateStrings(String...values) {
		String total = "";
	
		for(String val: values) {
			total += val;
		}
		return total;
		}
		
		*/ 
		System.out.println(concatenateStrings("donut","is","good"));	
	}
	private static String concatenateStrings(String...values) {
		String result = "";
	
		for(String val: values) {
			result += val;
		}
		return result;
	}
}
