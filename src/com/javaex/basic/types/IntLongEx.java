package com.javaex.basic.types;

public class IntLongEx {
	
	public static void main(String[] args) {
		
		// int 형 (4byte)
		int intVar1;
		int intVar2;
		
		intVar1 = 2024;
		// intVar2 = 1234567890123; // error; out of range
		
		System.out.println(intVar1);
		//System.out.println(intVar2); // error; The local variable intVar2 may not have been initialized -> 초기화 되지 않았기 때문에 에러 발생
		
		
		
		
		// long 형 (8byte)
		long longVar1;
		long longVar2;
		
		longVar1 = 2024;
		// longVar2 = 1234567890123; // error; out of range ->이렇게 하면 에러남 -> 뒤에L 붙여주면 잘 출력됌
		longVar2 = 1234567890123L;
		
		System.out.println(longVar1);
		System.out.println(longVar2); // error; out of range
		
		long amount = 1_000_000_000L; // -> 큰액수 ,(콤마)x, 그대신 _(언더바) 사용
		System.out.println(amount);
		
		
		
		
		// 진법 표기 : 2진수(0, 1), 8진수(0-7), 16진수(0-9, A-F)
		int bin, oct, hex;
		bin = 0b1100; // 2진수; 0b
		oct = 072;	  // 8진수; 
		hex = 0xFF;   // 16진수; 
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
		
	}

}
