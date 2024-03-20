package com.javaex.basic.conditional;

import java.util.Scanner;

public class ConditionalPractice02 {

	public static void main(String[] args) {
		// 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요: ");
		int score = scanner.nextInt();
		// String message; 처리해놓으면 맨 밑에 System.out 한번만 하면 된다
		
		if(score >= 90) {
			System.out.println("A등급");
			// message = "A등급"
		} else if(score >= 90) {
			System.out.println("B등급");
		} else if(score >= 80) {
			System.out.println("C등급");
		} else if(score >= 70) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
		
		scanner.close();

	}

}
