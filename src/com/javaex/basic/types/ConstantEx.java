package com.javaex.basic.types;

public class ConstantEx {

	public static void main(String[] args) {
		// 상수 : 변하지 않는 수
		// 초기화, 조회 가능, 재할당 불가
		final double PI = 3.14159; // 상수는 모두 대문자, _ 로 단어 구분
		final int SPEED_LIMIT = 130;
		
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		
		// 재할당 불가
		// SPEED_LIMIT = 100;
		
		System.out.printf("현재 제한 속도는 " + SPEED_LIMIT + "입니다");
		System.out.println("제한 속도 " + SPEED_LIMIT + "이하로 주행해주세요");

	}

}
