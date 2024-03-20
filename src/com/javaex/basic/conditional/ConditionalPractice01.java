package com.javaex.basic.conditional;

import java.util.Scanner;

public class ConditionalPractice01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int score = scanner.nextInt();
		
		// if문
		if (score % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		// switch문으로 할수도..?
		// 변수 하나 더 지정 후
		// boolean값으로 true면 3의배수 , false면 3의 배수가 아닙니다.
		
		scanner.close();

	}

}
