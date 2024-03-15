package com.javaex.basic.loop;

public class ContinueEx {
	
	// 1 - 20까지
	// 2의 배수, 3의 배수 제외한 숫자 출력하기

	public static void main(String[] args) {
		
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				continue; // 다음 루프로 넘어가세요
			}
			System.out.println(i);
		}
		

	}

}
