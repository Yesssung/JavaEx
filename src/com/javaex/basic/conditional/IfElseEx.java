package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		// If 조건문 -> 60점 이상이면 합격입니다.
		
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		
		// 점수입력
		System.out.print("점수는?");
		int score = scanner.nextInt();
		
		//점수 비교
		if(score >= 60) {
			System.out.println("합격입니다."); // 조건을 만족했을때(true)
		} else{
			System.out.println("불합격입니다."); // 조건을 만족하지 않았을때(false)
		}
		
		// 스캐너 닫기
		scanner.close();
		
	

	}

}
