package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEx2 {

	public static void main(String[] args) {
		// 조건문 반복 
		// 숫자 입력 -> 0보다 크면 양수, 0보다 작으면 음수, 같으면 0
		
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
				
		// 숫자 입력
		System.out.println("숫자를 입력하세요. ");
		int num = scanner.nextInt();
		
//		// 숫자 조건
//		if(num > 0) {
//			System.out.println("양수");
//		} else if(num == 0) {
//			System.out.println("0입니다.");
//		} else {
//			System.out.println("음수"); // 혹은 위의 두개의 순서를 바꿔도 상관 없다.
//		}

		// 중첩if
		if(num == 0) {
			System.out.println("0입니다.");
		} else { //0을 먼저 걸렀으니 else안에는 양수 아니면 음수
			if(num > 0) {
				System.out.println("양수입니다.");
			} else {
				System.out.println("음수입니다.");
			}
			
		}
		// 스캐너 닫기
		scanner.close();
		

	}

}
