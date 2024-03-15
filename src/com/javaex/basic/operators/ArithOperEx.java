package com.javaex.basic.operators;

public class ArithOperEx {
	public static void main(String[] args) {
		// 산술연산
		// arithOperTest();
		
		// 증감연산 (디버거)
		// incrOperTest();
		
		// 할당연산
		assignOperTest();
		
}
	
	public static void assignOperTest() {
		// = : 우선순위 가장 마지막
		int a = 7;
		int b = 3;
		
		a = a + b;
		System.out.println(a); // 10
		
		a += b; // 확장 할당 연산
		System.out.println(a); // 13
		
	}

	
	
	public static void incrOperTest(){
		// 밑에 두가지 경우의 구분 잘 하기!!
		int a = 10;
		int b;
		
		System.out.println(a);
		b = ++a;
		System.out.println(b);
		System.out.println(a);
		
		System.out.println("--------------------------");
		
		a = 10; // 원상복구
		System.out.println(a); // 10
		b = a++;			   // b에 먼저a의 값인 10을 넣고
		System.out.println(b); // 그렇기 때문에 10이 출력
		System.out.println(a); // 그리고 다시 a를 출력하면 값이 1증가한 a가 나오게 된다
	
	}
	
	public static void arithOperTest() {
		int a = 7;
		int b = 3;
		
		// 부호 연산(+, -)
		System.out.println(-a);
		System.out.println("--------------------------");

		// 사칙연산(+, -, *, /, %)
		System.out.println(a + b); // 10
		System.out.println(a - b); // 4
		System.out.println(a * b); // 21
		System.out.println(a / b); // 2 -> int기 때문에 소수점으로 안나오고 딱 몫의 정수만 나온다
		System.out.println(a % b); // 1
		System.out.println("--------------------------");
		
		// 정수의 나눗셈은 정수
		System.out.println(a / b); // 2 -> 몫과 나머지가 아니라 진짜 7을 나누고 싶다면? 실수로 바꾸자구요!
		System.out.println((float)a / (float)b); // 꼭 양쪽에 float를 넣을필요는 없다 한쪽만 써도 된다구요! like this-> System.out.println((float)a / b);
		System.out.println("--------------------------");
	
	}

}
