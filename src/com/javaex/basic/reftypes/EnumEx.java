package com.javaex.basic.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		// Enum 메서드 테스트
		
		Week today = Week.WENDNESDAY;
		
		System.out.println(today);
		
		System.out.printf("Today is %s(%d)%n", today.name(), // 열거상수의 문자열 표현)
											   today.ordinal()); // 열거 상수의 열거 객체 내 순번
		
		String strWeek = "FRIDAY";
		Week obj = Week.valueOf(strWeek);
		
		System.out.printf("obj is %s(%d)%n",
							obj.name(),
							obj.ordinal());
		

	}

}
