package com.javaex.exception;

import java.io.IOException;

// CheckException: 반드시 예외처리가 필요
// try-catch or throw 둘 중 하나는 해야함
public class ThrowsExceptEx {

	public static void main(String[] args) {

		ThrowsExcept except = new ThrowsExcept();

		try {
			except.divide(100, 0);
			except.executeRuntimeException();
			except.executeExcept(); // CheckedException은 반드시 예외처리
			
		} catch (IOException e) {
//			e.printStackTrace();
			System.err.println(e.getMessage());
			
		} catch (CustomArithException e) {
			System.err.println("에러메시지: " + e.getMessage()); // 에러출력 시스템 -> 빨간 글씨로 출력된다.
			// 상황 정보 확인
			System.err.println("나누어지는 수: " + e.getNum1());
			System.err.println("나누는 수: " + e.getNum2());
			
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
	}

}
