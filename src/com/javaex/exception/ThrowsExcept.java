package com.javaex.exception;

import java.io.IOException;

// 사용자 정의 예외
class CustomArithException extends ArithmeticException {
	private int num1;
	private int num2;

	public CustomArithException(String message, int num1, int num2) {
		super(message);
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}
}

public class ThrowsExcept {

	public void executeExcept() throws IOException { // -> 이 부분에 예외를 던질 것을 말함
		System.out.println("강제 예외 발생!");
		// 외부로 예외 던지기(Throw)
		throw new IOException("강제 예외!");
		// IOException은 대표적인 CheckedException,
		// IOException을 throw 할 때는 해당 메소드가 CheckedException을 던져준다는 점을
		// 외부 메소드에게 알려줘야 한다. // 선언부에 예외를 던질 것을 알림 (위쪽에 화살표)
	}

	public void executeRuntimeException() {
		// RuntimeException -> 실행 타임에서만 확인가능한 메소드
		// 예외처리 없이도 컴파일은 되지만 예외처리를 해야 안정성이 보장된다.
		// Throws를 명시하지 않는다. 그치만 해주는게 좋다네 휴
		System.out.println("RuntimeException");
		throw new RuntimeException("RuntimeException");
	}

	// 두개의 숫자를 나누는 코드
	public double divide(int num1, int num2) {
		// 예외가 발생했을 때 보다 구체적인 예외로 변환 후에 예외상황의 정보를 추가해서 예외를 반환하는 것이 귯
		double result = 0;

		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			// 보다 직접 예외로 전환
			CustomArithException cae = new CustomArithException("사용자 정의 Exception", num1, num2); // 구체적 정보 감시
			// 전환된 사용자 정의 예외를 throw
			throw cae;
		}

		return result;
	}

}
