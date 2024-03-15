package com.javaex.basic.loop;

import java.util.Scanner;

public class ForLoopGugu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요. \n 단: ");
		int dan = sc.nextInt();
		// int num는 for문 안에서 쓸거기 때문에 위에 따로 빼서 써놓을 필요가 없다.
		
		for(int num = 1; num <= 9; num++) {
			System.out.println(dan + " * " + num +  " = " + (dan*num));
		}
		
		sc.close();
		
	
		
		

	}

}
