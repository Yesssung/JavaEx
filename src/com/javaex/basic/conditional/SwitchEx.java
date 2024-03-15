package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		
		// 과목 번호 입력받기
		System.out.println("과목을 선택하세요. \n 1. 자바 2. C 3. C++ 4. 파이썬 \n 과목번호: ");
		int code = scanner.nextInt();
		
		// 조건(switch)
		switch(code) {
		case 1: // if문에서 'code == 1' 이다와 같음
			System.out.println("R101입니다.");
			break;
		case 2: 
			System.out.println("R202입니다.");
			break;
		case 3: 
			System.out.println("R303입니다.");
			break;
		case 4: 
			System.out.println("R404입니다.");
			break;
		default :
			System.out.println("나머지는 상담원에게 문의하세요");
			break;
		}
		
		// 스캐너 닫기
		scanner.close();

	}

}
