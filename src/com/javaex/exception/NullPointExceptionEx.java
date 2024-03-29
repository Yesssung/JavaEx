package com.javaex.exception;

public class NullPointExceptionEx {

	public static void main(String[] args) {
		
		
		String str = new String("Hello");
		str = null;
		
		try {
			System.out.println(str.toString());
		} catch(NullPointerException e) {
//			e.printStackTrace(); // 둘 중에 하나 사용
			System.err.println("null 입니다.");
		} finally {
			System.out.println("예외 처리 종료!");
		}
	}

}
