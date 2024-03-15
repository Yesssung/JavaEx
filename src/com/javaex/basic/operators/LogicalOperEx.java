package com.javaex.basic.operators;

public class LogicalOperEx {

	public static void main(String[] args) {
		
		int a = 7;
		int b;
		b = 3;
		
		// 비교연산자 : >=, <=, >, <, ==, !=   -> boolean으로 반환
		System.out.println(a > b);
		System.out.println(a == b);
		System.out.println(a != b); // -> a가 b와 같지 않냐? -> 네(true)(a와b가 같지 않으니까 그렇다고 출력)
		System.out.println("------------------------------");

		
		
		
		
		
		
		// 논리연산자
		// 논리곱(AND: &&)
		// 논리합(OR: ||)
		// 논리부정(NOT: !)
		
		int c = 5;

		// c는 0초과, 10미만의 값 조건1: c > 0
		//					  조건2: c < 10
		//					  결과: 조건1 and 조건2
		boolean r1 = c > 0;  // 조건1 
		boolean r2 = c < 10; // 조건2
		boolean result = r1 && r2;
		
		System.out.println(result);
		System.out.println("------------------------------");
		
		// c가 0이하이거나 10이상인가?
		//			조건1: c <= 0;
		//			조건2: c >= 10;
		
		r1 = c <= 0;
		r2 = c >= 10;
		result = r1 || r2;
		System.out.println(result);
		
		// 문제1의 논리부정
		result = !(c > 0 && c < 10);
		// c <= 0 || c >= 10 의 논리 결과와 동일
		System.out.println(result);
		
		// 문제2의 논리부정
		result = !(c <= 0 || c >= 10 );
		// c > 0 && c < 10 의 논리 결과와 동일
		
		
		

	}

}
