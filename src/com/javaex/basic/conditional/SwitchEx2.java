package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("월을 입력하세요: ");
		int month = scanner.nextInt();
		String message; // String message 할때는 각각 System.out 안해주기!
		
		switch(month) {
		case 1,3,5,7,8,10,12: // 이렇게도 가능 공통적인 부분 묶어주고 break 쓰기
//		case 3:
//		case 5:
//		case 7:				  // 이렇게도 가능
//		case 8:
//		case 10:
//		case 12: 
//			System.out.println("31일 입니다.");
			message="31일 입니다.";
		break;
		case 4, 6, 9, 11:
//			System.out.println("30일 입니다.");
			message="30일 입니다.";
		break;
		default:
//			System.out.println("28일 입니다.");
			message="28일 입니다.";
		break;
		}
		
		System.out.println(month + " 월은 " + message);
		scanner.close();

	}

}
