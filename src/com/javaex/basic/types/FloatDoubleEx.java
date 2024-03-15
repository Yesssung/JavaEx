package com.javaex.basic.types;

public class FloatDoubleEx {

	public static void main(String[] args) {
		// float (4byte)
		// double (8byte)(default)
		
		float floatVar;
		double doubleVar;
		
		// 정밀도 체크 둘다 정밀도 포기 어느정도 가면 반올림으로 끊김
		floatVar = 0.12345678901234567890F; // 뒤에F붙이기!
		doubleVar = 0.12345678901234567890; 
		
		System.out.println("float: " + floatVar);
		System.out.println("double: " + doubleVar);
		
		// E 표기법
		int intVar;
		intVar = 300000000;
		floatVar = 3E9F;
		doubleVar = 3E-9;
		
		System.out.println("int: " + intVar);
		System.out.println("float: " + floatVar);
		System.out.println("double: " + doubleVar);
		
		// 부동 소수점 계산의 유의점
		// float, double형은 정밀도를 포기하고 표현 범위만 넓힌 데이터 -> 정밀한 계산시 두개는 사용 지양
		System.out.println(0.1 *3 );
		
	}

}
