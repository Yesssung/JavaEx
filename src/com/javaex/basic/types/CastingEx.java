package com.javaex.basic.types;

public class CastingEx {

	public static void main(String[] args) {
		
		// 암시적 캐스팅(Promotion)
		promotionEx();
		// 명시적 캐스팅(Casting)
		castingEx();

	}
	
	public static void castingEx() {
		// 표현 범위가 넓은 자료형 -> 좁은 자료형으로 변환
		// 데이터 유실 가능성 있음, 반드시 강제 타입 변환이 필요
		
		double d = 1234567.890;
		System.out.println(d);
		
		float f = (float)d;
		System.out.println(f);
		
		long l = (long)f;
		System.out.println(l);
		
		int i = (int)l;
		System.out.println(i);
		
		short s = (short)i;
		System.out.println(s);
		
		byte b = (byte)s;
		System.out.println(b);
		
		
	}
	
	
	
	
	public static void promotionEx() {
		// 표현 범위가 좁은 자료형 -> 넓은 자료형으로 변환
		// 자바가 암묵적으로(자동으로) 캐스팅 수행
		// byte -> short -> int -> long -> float -> double
		byte b = 25; // 1바이트 정수형
		System.out.println(b);
		
		short s = b; // 2바이트
		System.out.println(s);
		
		int i = s; // 4바이트
		System.out.println(s);
		
		long l = i; // 8바이트
		System.out.println(i);
		
		float f = l; // 8바이트 정수 -> 4바이트 실수
		System.out.println(f);
		
		double d = f; // 4바이트 실수 -> 8바이트 실수
		System.out.println(d);
		
//		char ch = 'A';
//		short s2 = ch; //unsigned int (2바이트) -> 2바이트 정수
//		System.out.println(s2);
	}

}
