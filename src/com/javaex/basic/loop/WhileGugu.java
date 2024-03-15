package com.javaex.basic.loop;

import java.util.Scanner;

public class WhileGugu {

	public static void main(String[] args) {
		//  구구단
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력하세요. \n 단: ");
		int dan; // -> int변수 두개를 하나로 합치면 -> int num = 1, dan
		int num = 1;
		
		dan = sc.nextInt();
	
		
		while(num <= 9) {
			System.out.println(dan  + "*" + num + " = " + (dan * num));
			num += 1;
		}
		
		sc.close();

	}

}
