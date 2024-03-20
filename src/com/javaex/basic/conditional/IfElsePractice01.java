package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice01 {

	public static void main(String[] args) {
		// 입력받은 수가 양수일때 짝수면 -> 짝수, 홀수면 -> 홀수, 음수면 -> 음수, 0이면 -> 0 출력 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		int num;
		num = scanner.nextInt();
		/////////////////////////////////////////////////////////////////

		// 내 답안
		if(num < 0) {
			System.out.println("음수");
		} else if(num > 0 && num%2==0) {
			System.out.println("짝수");
		} else if(num > 0 && num%2==1) {
			System.out.println("홀수");
		} else {
			System.out.println("0입니다.");
		}
		
		
//		//모범답안
//		if(num > 0) {
//			if(num % 2 == 0) {
//				System.out.println("짝수");
//			} else {
//				System.out.println("홀수");
//			}
//		} else if(num < 0) {
//			System.out.println("음수");
//		} else{
//			System.out.println("0입니다");
//			}
//		
		
		/////////////////////////////////////////////////////////////
		scanner.close();
	}
}
