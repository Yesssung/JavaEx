package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionEx {

	// 정수 1개 입력
	// 100을 입력받은 정수로 나눔
	// 나눗셈 결과를 화면에 출력
	public static void main(String[] args) {
		
		double result = 0;
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		
		try { // 예외 발생 가능성이 있는 영역을 try블록으로 감싸준다.
			num = sc.nextInt();
			result = 100 / num;
		} catch(InputMismatchException e){ // 왜 InputMismatchException만 import 해줬냠 -> java.lang안에 있는 애들은 import 안해도 잘 됌
			// 입력 형식 에러
			System.err.println("정수로 입력해 주세요");
		} catch(ArithmeticException e){
			// 여기로 들어온 예외는 100% ArithmeticException
			// 구체적인 예외 처리 로직 수행 가능
			System.err.println("0으로는 나눌 수 없다.");
		} catch (Exception e) { // 예외(정보) 클래스로 catch
			e.printStackTrace(); // 예외 스택 출력
		} finally {
			// 예외 유무 관계 없이 가장 마지막에 무조건 1회 출력
			// try 블록에서 설정된 시스템 자원 등을 해제
			// 필수사항이 아닌 선택사항 
			System.out.println("예외처리 종료.");
		}
		
		System.out.println(result);
		
		sc.close();
		
		
	}

}
