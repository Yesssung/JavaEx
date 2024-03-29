package com.javaex.exception;

public class ArrayExceptionEx {

	public static void main(String[] args) {
		int[] intArray = new int[] {10,50,40};
		
		try {
			System.err.println(intArray[6]);
		} catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace(); // 둘 중에 하나 사용
			System.err.println("Error: " + e.getMessage());
		} finally {
			System.out.println("예외 처리 종료!");
		}

	}

}
